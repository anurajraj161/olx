package com.Product.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.Product.entity.Product;
import com.Product.entity.Users;
import com.Product.service.ProductServiceInt;





@RestController
@RequestMapping("/user/product")
public class ProductController {
	
	@Autowired
	private ProductServiceInt Service;
	
	@PostMapping("/bookorder")
	public Product bookProduct(@RequestBody Product p) {
		Product product = p.getProductId();
		Users user = p.getProductId();
		
		payment.setOrderid(order.getId());
		payment.setAmount(order.getPrice());
		
		return orderService.saveOrder(order);
	}
    
	@GetMapping("/{ProductId}")
	
    public Product getProduct(@PathVariable("ProductId")Long ProductId) {
    
		return this.getProduct(ProductId);
    }

}
