package com.test.service.transcationservice.dto.response;

public class ProductsDTO {
	private int id;
	
	private String name;
	
	private String code;
	
	private Double price;
	
	private Integer stock;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "ProductsDTO [id=" + id + ", name=" + name + ", code=" + code + ", price=" + price + ", stock=" + stock
				+ "]";
	}
	
}
