package com.training.storeapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.training.storeapp.domain.Product;
import com.training.storeapp.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@GetMapping(produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Product> getAllProducts(){
		
		return productService.findAllProducts();
	}
	
	
	@GetMapping("/{id}")
	public Product getProductById(@PathVariable("id")Integer productId){
		
		return productService.findProductById(productId);
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(code=HttpStatus.NO_CONTENT)
	public void deletebyId(@PathVariable("id")Integer productId) {
		productService.deleteProduct(productId);
	}
	
	@PostMapping
	@ResponseStatus(code=HttpStatus.CREATED)
	public Product addProduct(@RequestBody Product product) {
		return productService.addProduct(product);
	}
	
	@PutMapping
	@ResponseStatus(code=HttpStatus.OK)
	public Product UpdateProduct(@RequestBody Product product) {
	return productService.UpdateProduct(product);
	}
	
	
}
	
	
	
	