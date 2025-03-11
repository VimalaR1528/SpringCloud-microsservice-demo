package com.training.ribbon.hystrix.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.training.ribbon.domain.Product;

@Service
//or
//@Component
public class ProductService {

	// Registry aware HTTP Client
	@Autowired
	private RestTemplate restTemplate;

	@HystrixCommand(fallbackMethod = "getDefaultProductById")
	public Product getProductById(int id) {
		
		Product product =
				restTemplate.getForObject(
						"http://product-service/products/" + id, Product.class);
		return product;
	}
	
	public Product getDefaultProductById(int id) {
		return new Product (id, "Vivo", 88888.0);
	}
}
