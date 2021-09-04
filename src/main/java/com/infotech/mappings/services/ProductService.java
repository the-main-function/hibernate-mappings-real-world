package com.infotech.mappings.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infotech.mappings.entities.Product;
import com.infotech.mappings.repos.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	public Product addProduct(Product product) {
		return productRepository.save(product);
	}
}
