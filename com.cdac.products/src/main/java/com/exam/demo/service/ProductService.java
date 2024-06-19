package com.exam.demo.service;

import java.util.Optional;

import com.exam.demo.pojos.Product;

public interface ProductService {
	    public Product createProduct(Product product);
	    public Optional<Product> getProductById(Long id); 
	    public void deleteProductById(Long id);
}
