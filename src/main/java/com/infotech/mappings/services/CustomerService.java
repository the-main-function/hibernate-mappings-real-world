package com.infotech.mappings.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infotech.mappings.entities.Customer;
import com.infotech.mappings.repos.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	
	public  Customer addCustomer(Customer customer) {
		return customerRepository.save(customer);
	}
}
