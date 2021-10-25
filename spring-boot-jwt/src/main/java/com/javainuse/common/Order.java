package com.javainuse.common;


public class Order {
	
	    private Long Oid;
		
		private String Name;
		
		private Integer Price;
		
		private String Uid;
		public Long getOid() {
			return Oid;
		}
		public void setOid(Long oid) {
			Oid = oid;
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
		public String getUid() {
			return Uid;
		}
		public void setUid(String uid) {
			Uid = uid;
		}
		public Order() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Order(Long oid, String name, Integer price, String uid) {
			super();
			Oid = oid;
			Name = name;
			Price = price;
			Uid = uid;
		}

}
