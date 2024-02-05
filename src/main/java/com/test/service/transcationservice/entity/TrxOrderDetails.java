package com.test.service.transcationservice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "trx_order_details")
public class TrxOrderDetails {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "trx_order_id")
	private int trx_order_id;
	
	@Column(name = "product_id")
	private int product_id;
	
	@Column(name = "quantity")
	private int quantity;
	
	@Column(name = "price")
	private double price;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTrx_order_id() {
		return trx_order_id;
	}

	public void setTrx_order_id(int trx_order_id) {
		this.trx_order_id = trx_order_id;
	}

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "TrxOrderDetails [id=" + id + ", trx_order_id=" + trx_order_id + ", product_id=" + product_id
				+ ", quantity=" + quantity + ", price=" + price + "]";
	}
	
}
