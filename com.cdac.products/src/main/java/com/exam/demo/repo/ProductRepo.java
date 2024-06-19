package com.exam.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exam.demo.pojos.Product;

public interface ProductRepo extends JpaRepository<Product, Long> {

}
