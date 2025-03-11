package com.training.eureka.proxy;

 
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.training.eureka.domain.Product;
 

//@Component
//or
@Service
public class ProductServiceFallback implements ProductProxy {

	@Override
	public Product getProductById(int id) {
		return new Product(id, "Macbook", 110000.0);
	}

	@Override
	public List<Product> getAllProducts() {
		return Arrays.asList(new Product());
	}

}
