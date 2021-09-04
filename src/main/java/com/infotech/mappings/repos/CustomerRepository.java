package com.infotech.mappings.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infotech.mappings.entities.Category;
import com.infotech.mappings.entities.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {

}
