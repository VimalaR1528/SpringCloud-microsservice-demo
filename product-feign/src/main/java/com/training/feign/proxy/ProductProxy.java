package com.training.feign.proxy;

 import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.training.feign.domain.Product;

 

@FeignClient("product-service")
public interface ProductProxy {

	@GetMapping(value = "/products/{id}", produces = {MediaType.APPLICATION_JSON_VALUE})
	Product getProductById(@PathVariable("id") int id);
	
	@GetMapping(value = "/products", produces = {MediaType.APPLICATION_JSON_VALUE})
	List<Product> getAllProducts();
	/*
	@PostMapping(value="/products", produces = {MediaType.APPLICATION_JSON_VALUE},
			consumes = {MediaType.APPLICATION_JSON_VALUE})
	Product addProduct(@RequestBody Product product);
	
	@PutMapping(value="/products", produces = {MediaType.APPLICATION_JSON_VALUE},
			consumes = {MediaType.APPLICATION_JSON_VALUE})
	Product updateProduct(@RequestBody Product product);
	
	@DeleteMapping(value = "/products/{id}")
	void deleteProductById(@PathVariable("id") int id);
	*/
}











