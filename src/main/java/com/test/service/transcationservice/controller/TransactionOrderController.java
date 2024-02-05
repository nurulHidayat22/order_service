package com.test.service.transcationservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.service.transcationservice.dto.request.Orders;
import com.test.service.transcationservice.service.TransactionOrderService;

@CrossOrigin("*")
@RequestMapping(value = "/order")
@RestController
public class TransactionOrderController {

	@Autowired
	private TransactionOrderService transactionOrderService;
	
	@PostMapping
	public ResponseEntity<?> createOrder(@RequestBody Orders orders){
		return transactionOrderService.createOrder(orders);
	}
}
