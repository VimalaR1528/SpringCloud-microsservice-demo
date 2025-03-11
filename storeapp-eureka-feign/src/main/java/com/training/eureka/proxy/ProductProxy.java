package com.training.eureka.proxy;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.training.eureka.domain.Product;

@FeignClient("product-service")
public interface ProductProxy {

	@GetMapping(value="/products/{id}", produces= {MediaType.APPLICATION_JSON_VALUE})
	Product getProductById(@PathVariable("id") int id);
	
	@GetMapping(value="/products", produces= {MediaType.APPLICATION_JSON_VALUE})
	List<Product> getAllProduct();
}
