package com.training.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class ProductFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductFeignApplication.class, args);
	}

}
