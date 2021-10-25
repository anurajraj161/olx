package com.javainuse.common;



public class Product {

	
    private Long Pid;
	
	
	private String Name;
	
	private Integer Price;
	
	private String Location;
	
	
	

	public Product(Long pid, String name, Integer price, String location) {
		super();
		Pid = pid;
		Name = name;
		Price = price;
		Location = location;
	}


	public Long getPid() {
		return Pid;
	}


	public void setPid(Long pid) {
		Pid = pid;
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



