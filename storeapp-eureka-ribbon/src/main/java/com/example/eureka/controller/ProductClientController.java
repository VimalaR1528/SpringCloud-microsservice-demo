package com.example.eureka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.training.eureka.domain.Product;

@RestController
@Scope("request")
public class ProductClientController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/get-products/{id}")
	public Product getProductById(@PathVariable("id")Integer id) {
		
		Product product=restTemplate.getForObject("http://product-service/products/"+id, Product.class);
		return product ;
		
	}
	 
}
