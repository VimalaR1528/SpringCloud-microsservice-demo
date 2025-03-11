package com.training.eureka.controller;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.training.eureka.domain.Product;
import com.training.eureka.proxy.ProductProxy;


@RestController
@Scope("request")
public class ProductController {

	@Autowired
	private ProductProxy  productServiceProxy;
	
	private static final Logger log=LoggerFactory.getLogger(ProductController.class);
	
	@GetMapping("/get-products/{id}")
	public Product getProductById(@PathVariable("id") int id) {
		log.debug("In get product by id:"+id);
		Product product= productServiceProxy.getProductById(id);
		log.debug("In get product by id:"+product);
		return product;
	}
	
	@GetMapping("/get-products")
	public List<Product> getProducts() {
		
	return	 productServiceProxy.getAllProducts();
		
	}
}


