package com.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ecommerce.dao.ProductRepository;

@SpringBootApplication
public class RetailWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(RetailWebApplication.class, args);
		//ProductRepository productRepository=con
	}

}
