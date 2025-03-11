package com.training.storeapp.service;

import java.util.List;

import com.training.storeapp.domain.Product;

public interface ProductService {

	Product addProduct(Product product);
	Product UpdateProduct(Product product);
	void deleteProduct(Integer productId);
	List<Product> findAllProducts();
	Product findProductById(Integer productId);
	Product UpdateProductPrice(Integer productId, double productPrice);
	
}
