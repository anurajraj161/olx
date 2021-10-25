package com.Product.entity;

import java.util.ArrayList;
import java.util.List;

public class Users {

	private Long UserId;
	private String Name;
	private String Phone;
	
	List<Product> product = new ArrayList<>();
	List<Cart> cart = new ArrayList<>();
	List<OrderHistory> orderhisttory = new ArrayList<>();
	
	
	
	public Users(Long userId, String name, String phone, List<Product> product) {
		super();
		UserId = userId;
		Name = name;
		Phone = phone;
		this.product = product;
	}

	public Long getUserId() {
		return UserId;
	}

	public void setUserId(Long userId) {
		UserId = userId;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getPhone() {
		return Phone;
	}

	public void setPhone(String phone) {
		Phone = phone;
	}

	public List<Product> getProduct() {
		return product;
	}

	public void setProduct(List<Product> product) {
		this.product = product;
	}


	
}