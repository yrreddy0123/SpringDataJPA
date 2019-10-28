package com.yrrhelp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.yrrhelp.entities.Product;

@Repository
public interface ProductRepo extends CrudRepository<Product, Integer>{

}
