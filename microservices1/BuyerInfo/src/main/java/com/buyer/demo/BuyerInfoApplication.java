package com.buyer.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient
@SpringBootApplication
public class BuyerInfoApplication {

	public static void main(String[] args) {
		SpringApplication.run(BuyerInfoApplication.class, args);
	}

}
