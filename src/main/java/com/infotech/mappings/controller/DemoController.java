package com.infotech.mappings.controller;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.infotech.mappings.entities.Category;
import com.infotech.mappings.entities.Customer;
import com.infotech.mappings.entities.Offer;
import com.infotech.mappings.entities.Order;
import com.infotech.mappings.entities.Product;
import com.infotech.mappings.services.CategoryService;
import com.infotech.mappings.services.CustomerService;
import com.infotech.mappings.services.OfferService;
import com.infotech.mappings.services.OrderService;
import com.infotech.mappings.services.ProductService;

@Controller
public class DemoController {
	
	@Autowired
	private CategoryService categoryService;
	
	@Autowired
	private ProductService productService;
	
	@Autowired
	private OfferService offerService;
	
	@Autowired
	private CustomerService customerService;
	
	@Autowired
	private OrderService orderService;
	
	@GetMapping("/category-form")
	public String displayCategoryForm(Model model) {
		model.addAttribute("category", new Category());
		return "category-form";
	}
	
	@PostMapping("/add-category")
	public String addCategory(Model model, @ModelAttribute Category category) {
		categoryService.addCategory(category);
		return "redirect:/category-form";
	}
	
	@GetMapping("/product-form")
	public String displayProductForm(Model model) {
		model.addAttribute("product", new Product());
		model.addAttribute("categoryList",categoryService.getAllCategories());
		model.addAttribute("offerList",offerService.getAllOffers());
		return "product-form";
	}
	
	@PostMapping("/add-product")
	public String addProduct(Model model, @ModelAttribute Product product) {
		productService.addProduct(product);
		return "redirect:/product-form";
	}
	
	@GetMapping("/offer-form")
	public String displayOfferForm(Model model) {
		model.addAttribute("offer", new Offer());
		return "offer-form";
	}
	
	@PostMapping("/add-offer")
	public String addProduct(Model model, @ModelAttribute Offer offer) {
		offerService.addOffer(offer);
		return "redirect:/offer-form";
	}
	
	@GetMapping("/customer-form")
	public String displayCustomerForm(Model model) {
		model.addAttribute("customer", new Customer());
		return "customer-form";
	}
	
	@PostMapping("/add-customer")
	public String addCustomer(Model model, @ModelAttribute Customer customer) {
		customerService.addCustomer(customer);
		return "redirect:/customer-form";
	}
	
	@GetMapping("/order-form")
	public String displayorderForm(Model model) {
		model.addAttribute("order", new Order());
		model.addAttribute("customerList", customerService.getAllCustomers());
		model.addAttribute("productList", productService.getAllProducts());
		return "order-form";
	}
	
	@PostMapping("/add-order")
	public String addOrder(Model model, @ModelAttribute Order order) {
		double price = 0.0;
		List<Product> products = order.getProducts();
		Iterator<Product> iterator = products.iterator();
		while(iterator.hasNext()) {
			Product prod = iterator.next();
			price += prod.getPrice();
		}
		order.setTotalPrice(price);
		orderService.addOrder(order);
		return "redirect:/order-form";
	}
}
