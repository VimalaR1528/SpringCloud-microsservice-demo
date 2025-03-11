package com.training.eureka.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.training.eureka.domain.Product;
import com.training.eureka.proxy.ProductProxy;

@RestController
@Scope("request")
public class ProductController {

	@Autowired
	private ProductProxy productProxy;
	
	public Product getProductById(@PathVariable("id") int id) {
		
		return productProxy.getProductById(id);
		
	}
	public List<Product> getAllProduct() {
		
		return productProxy.getAllProduct();
		
	}
	
	
}
