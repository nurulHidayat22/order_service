package com.test.service.transcationservice.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "trx_order")
public class TrxOrder {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "account_id")
	private int account_id;
	
	@Column(name = "trx_date")
	private Date trx_date;
	
	@Column(name = "total_amount")
	private double total_amount;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAccount_id() {
		return account_id;
	}

	public void setAccount_id(int account_id) {
		this.account_id = account_id;
	}

	public Date getTrx_date() {
		return trx_date;
	}

	public void setTrx_date(Date trx_date) {
		this.trx_date = trx_date;
	}

	public double getTotal_amount() {
		return total_amount;
	}

	public void setTotal_amount(double total_amount) {
		this.total_amount = total_amount;
	}

	@Override
	public String toString() {
		return "TrxOrder [id=" + id + ", account_id=" + account_id + ", trx_date=" + trx_date + ", total_amount="
				+ total_amount + "]";
	}
	
}
