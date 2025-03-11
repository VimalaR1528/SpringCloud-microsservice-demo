package com.training.feign.controller;
 

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.training.feign.domain.Product;
import com.training.feign.proxy.ProductProxy;

 

@RestController
@Scope("request")
public class ProductClientController {

	@Autowired
	private ProductProxy  productServiceProxy;
	
	@GetMapping("/get-products/{id}")
	public Product getProductById(@PathVariable("id") int id) {
		
		return productServiceProxy.getProductById(id);
	}
	
	@GetMapping("/get-products")
	public List<Product> getProducts() {
		
		return productServiceProxy.getAllProducts();
	}
}


