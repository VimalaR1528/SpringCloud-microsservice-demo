package com.training.productapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import com.training.productapp.domain.Product;
import com.training.productapp.repository.IProductRepository;

 
@EnableDiscoveryClient
//@EnableEurekaClient
@SpringBootApplication
public class ProductappApplication implements CommandLineRunner {

	
	@Autowired
	IProductRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(ProductappApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
	
		repository.save(new Product(null, "LG", 10345.66));
		repository.save(new Product(null, "NOKIA", 20345.66));
		repository.save(new Product(null, "ONIDA", 30345.66));
		repository.save(new Product(null, "APPLE", 40345.66));
		repository.save(new Product(null, "SAMSUNG", 50345.66));
		
		System.out.println("--------Data saved in H2 Database---------");
	
	}

}

