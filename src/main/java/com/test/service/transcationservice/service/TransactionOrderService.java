package com.test.service.transcationservice.service;

import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.test.service.transcationservice.dto.request.Orders;
import com.test.service.transcationservice.dto.response.ProductsDTO;
import com.test.service.transcationservice.entity.TrxOrder;
import com.test.service.transcationservice.entity.TrxOrderDetails;
import com.test.service.transcationservice.repository.TrxOrderDetailsRepository;
import com.test.service.transcationservice.repository.TrxOrderRepository;

public class TransactionOrderService {

	@Autowired
	private TrxOrderRepository trxOrderRepository;
	
	@Autowired
	private TrxOrderDetailsRepository trxOrderDetailsRepository;
	
	@Autowired
	private RestTemplate restTemplate;
	
	public ResponseEntity<?> createOrder(Orders orders){
		try {
			TrxOrder trxOrder = new TrxOrder();
			trxOrder.setAccount_id(orders.getAccount_id());
			trxOrder.setTotal_amount(orders.getTotal_amount());
			trxOrderRepository.save(trxOrder);
			for (int i = 0; i < orders.getDetails().size(); i++) {
				ProductsDTO productsResp = restTemplate.getForObject("http://localhost:3000/products/"+orders.getDetails().get(i).getProduct_id(), ProductsDTO.class);
				if(productsResp.getStock() > 0) {
					TrxOrderDetails trxOrderDetails = new TrxOrderDetails();
					trxOrderDetails.setTrx_order_id(trxOrder.getId());
					trxOrderDetails.setProduct_id(productsResp.getId());
					trxOrderDetails.setPrice(productsResp.getPrice());
					trxOrderDetails.setQuantity(orders.getDetails().get(i).getQuantity());
					
					trxOrderDetailsRepository.save(trxOrderDetails);
					
					productsResp.setStock(productsResp.getStock() - orders.getDetails().get(i).getQuantity());
					ResponseEntity<ProductsDTO> updateStock = restTemplate.postForEntity("http://localhost:3000/products", productsResp, ProductsDTO.class);
				}
			}
			
			return new ResponseEntity<>(orders, HttpStatus.OK);
			
		} catch (Exception e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
