package com.test.service.transcationservice.dto.request;

public class OrderDetails {
	
	private int product_id;
	private int quantity;
	private double price;
	
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
		return "OrderDetails [product_id=" + product_id
				+ ", quantity=" + quantity + ", price=" + price + "]";
	}
	
}
