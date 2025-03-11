package com.training.product_configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ProductConfigserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductConfigserverApplication.class, args);
	}

}
