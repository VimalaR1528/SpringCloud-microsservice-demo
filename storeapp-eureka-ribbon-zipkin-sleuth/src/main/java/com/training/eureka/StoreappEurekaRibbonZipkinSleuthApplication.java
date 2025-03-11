package com.training.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

//@EnableFeignClients
//@EnableCircuitBreaker
@SpringBootApplication
public class StoreappEurekaRibbonZipkinSleuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(StoreappEurekaRibbonZipkinSleuthApplication.class, args);
	}
	
	@Bean								
	public Sampler alwaysSampler() {
		return Sampler.ALWAYS_SAMPLE;
	}

}
