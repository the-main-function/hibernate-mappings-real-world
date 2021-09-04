package com.infotech.mappings.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="products")
public class Product {

	@Id
	@GeneratedValue
	@Column(name="product_id")
	private int productId;
	
	private String name;
	
	private double price;
	
	@ManyToOne
	@JoinColumn(name="category_id")
	private Category category;
}
