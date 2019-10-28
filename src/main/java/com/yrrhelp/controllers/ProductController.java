package com.yrrhelp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yrrhelp.entities.Product;
import com.yrrhelp.services.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@GetMapping()
	public List<Product> getAll() {
		System.out.println("Inside Home Controller");
		
		return productService.getAllProducts();
	}
	
	@PostMapping("/add")
	public Product add(@RequestBody Product product) {
		return productService.addProduct(product);
	}
}
