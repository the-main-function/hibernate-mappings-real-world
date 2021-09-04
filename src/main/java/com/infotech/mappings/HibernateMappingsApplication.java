package com.infotech.mappings;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.infotech.mappings.entities.Customer;

@SpringBootApplication
public class HibernateMappingsApplication {

	public static void main(String[] args) {
		SpringApplication.run(HibernateMappingsApplication.class, args);
	}

}
