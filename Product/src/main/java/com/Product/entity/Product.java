package com.Product.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Product_db")
public class Product {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long ProductId;
	
	@Column(name="Product_name")
	private String Name;
	@Column(name="Price")
	private Integer Price;
	@Column(name="Location")
	private String Location;
	
	
	public Product(Long productId, String name, Integer price, String location) {
		super();
		ProductId = productId;
		Name = name;
		Price = price;
		Location = location;
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


	public String getLocation() {
		return Location;
	}


	public void setLocation(String location) {
		Location = location;
	}
	
	
	
}

