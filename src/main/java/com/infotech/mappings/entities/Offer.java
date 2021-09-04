package com.infotech.mappings.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="offers")
@Data
public class Offer {

	@Id
	@GeneratedValue
	private int offerId;
	
	private String description;
	
	@ManyToMany(mappedBy = "offers")
	private List<Product> products;
}
