package com.infotech.mappings.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.infotech.mappings.entities.Category;
import com.infotech.mappings.entities.Product;
import com.infotech.mappings.services.CategoryService;
import com.infotech.mappings.services.ProductService;

@Controller
public class DemoController {
	
	@Autowired
	private CategoryService categoryService;
	
	@Autowired
	private ProductService productService;
	
	@GetMapping("/category-form")
	public String displayCategoryForm(Model model) {
		model.addAttribute("category", new Category());
		return "category-form";
	}
	
	@PostMapping("/add-category")
	public String addCategory(Model model, @ModelAttribute Category category) {
		categoryService.addCategory(category);
		return displayCategoryForm(model);
	}
	
	@GetMapping("/product-form")
	public String displayProductForm(Model model) {
		model.addAttribute("product", new Product());
		model.addAttribute("categoryList",categoryService.getAllCategories());
		return "product-form";
	}
	
	@PostMapping("/add-product")
	public String addProduct(Model model, @ModelAttribute Product product) {
		productService.addProduct(product);
		return displayCategoryForm(model);
	}
	
	
}
