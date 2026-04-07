package com.fooddelivery.restaurant_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ResaurantServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ResaurantServiceApplication.class, args);
	}

}
