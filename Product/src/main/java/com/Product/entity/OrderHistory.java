package com.Product.entity;

import java.util.Date;

public class OrderHistory {

	private Long ProductId;
	private String Name;
	private Integer Price;
	private Date date;
	
	
	
	
	public OrderHistory(Long productId, String name, Integer price, Date date) {
		super();
		ProductId = productId;
		Name = name;
		Price = price;
		this.date = date;
	}
	
	public Long getProductId() {
		return ProductId;
	}
	public void setProductId(Long productId) {
		ProductId = productId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Integer getPrice() {
		return Price;
	}
	public void setPrice(Integer price) {
		Price = price;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	
	
}
