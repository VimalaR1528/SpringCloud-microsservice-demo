package com.training.storeapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import com.training.storeapp.domain.Product;
import com.training.storeapp.repossitory.ProductRepository;

@EnableDiscoveryClient
@SpringBootApplication
public class StoreappApplication implements CommandLineRunner{
	
	@Autowired
	ProductRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(StoreappApplication.class, args);
		System.out.println("Spring Boot Microservices.........");
	}

	@Override
	public void run(String... args) throws Exception {
		repository.save(new Product(null,"LG",12345.77));
		repository.save(new Product(null,"NOKIA",43455.77));
		repository.save(new Product(null,"APPLE",67345.77));
		repository.save(new Product(null,"SAMSUNG",23345.77));
		repository.save(new Product(null,"ONIDA",87345.77));
		
	}

}
