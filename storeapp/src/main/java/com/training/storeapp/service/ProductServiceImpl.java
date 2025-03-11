package com.training.storeapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.storeapp.domain.Product;
import com.training.storeapp.repossitory.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductRepository repository;

	@Override
	public Product addProduct(Product product) {
		 		return repository.save(product);
	}

	@Override
	public Product UpdateProduct(Product product) {
		return repository.save(product);
	}

	@Override
	public void deleteProduct(Integer productId) {
		 repository.deleteById(productId);
		
	}

	@Override
	public List<Product> findAllProducts() {
		return repository.findAll();
	}

	@Override
	public Product findProductById(Integer productId) {
		return repository.findById(productId).get();
	}

	@Override
	public Product UpdateProductPrice(Integer productId, double productPrice) {
		Product product= repository.findById(productId).get();
		product.setPrice(productPrice);
		return repository.save(product);
	}

}
