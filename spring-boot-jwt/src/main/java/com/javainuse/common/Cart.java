package com.javainuse.common;




public class Cart {
	
		private String Name;
		
		private Long Pid;
		private Long Uid;
		private Integer Price;
		
		
		
		public Cart() {
			super();
			// TODO Auto-generated constructor stub
		}



		public String getName() {
			return Name;
		}



		public void setName(String name) {
			Name = name;
		}



		public Long getPid() {
			return Pid;
		}



		public void setPid(Long pid) {
			Pid = pid;
		}



		public Long getUid() {
			return Uid;
		}



		public void setUid(Long uid) {
			Uid = uid;
		}



		public Integer getPrice() {
			return Price;
		}



		public void setPrice(Integer price) {
			Price = price;
		}
		
}
