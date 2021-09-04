package com.infotech.mappings.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="categories")
@Data
public class Category {
	
	@Id
	@GeneratedValue
	@Column(name="category_id")
	private int categoryId;
	
	private String name;
	
	@OneToMany(mappedBy = "category")
	private List<Product> products;
	
}
