package com.infotech.mappings.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="addresses")
@Data
public class Address {
	
	@Id
	@GeneratedValue
	@Column(name="address_id")
	private int addressId;
	
	private String state;
	
	private String city;
	
	private String area;
	
	private String address;
	
	@OneToOne(mappedBy = "address")
	private Customer customer;
}
