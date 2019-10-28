package com.yrrhelp.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yrrhelp.entities.Product;
import com.yrrhelp.repositories.ProductRepo;
@Service
public class ProductService {
 
	@Autowired
	ProductRepo productRepo;
	
	public List<Product> getAllProducts() {
		
		List<Product> productList = new ArrayList<>();
		productRepo.findAll().forEach(productList::add);
		return productList;
	}
	public Product addProduct(Product product) {

		product= productRepo.save(product);
		
		return product;
	}
	
}
