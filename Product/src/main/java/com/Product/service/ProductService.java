package com.Product.service;

import org.springframework.stereotype.Service;

import com.Product.entity.Product;

import java.util.List;

@Service
public class ProductService implements ProductServiceInt {
	
	List<Product> list = List.of(
			new Product(13L, "samsung",10000,"pala"),
			new Product(14L, "Dell",17665,"cochin"),
			new Product(15L, "apple",18760,"tvm")
			);

	@Override
	public Product getProduct(Long id) {
		// TODO Auto-generated method stub
		return this.list.stream().filter(prod -> prod.getProductId().equals(id)).findAny().orElse(null);
	}

}

