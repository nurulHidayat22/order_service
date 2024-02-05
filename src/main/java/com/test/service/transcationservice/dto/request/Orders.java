package com.test.service.transcationservice.dto.request;

import java.util.List;

public class Orders {
	
	private int account_id;
	private List<OrderDetails> details;
	private double total_amount;
	
	public int getAccount_id() {
		return account_id;
	}
	
	public void setAccount_id(int account_id) {
		this.account_id = account_id;
	}
	
	public List<OrderDetails> getDetails() {
		return details;
	}
	
	public void setDetails(List<OrderDetails> details) {
		this.details = details;
	}
	
	public double getTotal_amount() {
		return total_amount;
	}

	public void setTotal_amount(double total_amount) {
		this.total_amount = total_amount;
	}

	@Override
	public String toString() {
		return "Orders [account_id=" + account_id + ", details=" + details + "]";
	}
	
}
