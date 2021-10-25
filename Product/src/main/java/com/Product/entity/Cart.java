package com.Product.entity;

public class Cart {

	private Long ProductId;
	private String Name;
	private Integer Price;
	
	
	public Cart(Long productId, String name, Integer price) {
		super();
		ProductId = productId;
		Name = name;
		Price = price;
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
	
	
}
