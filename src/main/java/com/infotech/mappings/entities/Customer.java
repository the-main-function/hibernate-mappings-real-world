package com.infotech.mappings.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Entity
@Table(name="customers")
public class Customer {
	
	@Id
	@GeneratedValue
	@Column(name="customer_id")
	private int customerId;
	
	private String name;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="address_id")	
	private Address address;
	
	@OneToMany(mappedBy = "customer")
	private List<Order> orders;
	
}	
