package com.training.ribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
 

import com.training.ribbon.domain.Product;
import com.training.ribbon.hystrix.service.ProductService;

@RestController
@Scope("request")
public class ProductClientController {

	@Autowired
	private ProductService productService;
	
	@GetMapping("/get-products/{id}")
	public Product getProductById(@PathVariable("id")Integer id) {
		
	Product product=	productService.getProductById(id);
		return product;
	}
}
