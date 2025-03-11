package com.training.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

@EnableCircuitBreaker
@SpringBootApplication
public class ProductRibbonApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductRibbonApplication.class, args);
	}

}
