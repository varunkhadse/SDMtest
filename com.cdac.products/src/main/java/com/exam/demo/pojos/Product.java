package com.exam.demo.pojos;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    
    @Column(nullable = false)
    private String name;

   
    @Column(nullable = false, unique = true)
    private String code;

    
    @Column(nullable = false)
    private LocalDate dateOfManufacturing;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Category category;

	public Product() {
		super();
	}

	public Product(Long id, String name, String code, LocalDate dateOfManufacturing, Category category) {
		super();
		this.id = id;
		this.name = name;
		this.code = code;
		this.dateOfManufacturing = dateOfManufacturing;
		this.category = category;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public LocalDate getDateOfManufacturing() {
		return dateOfManufacturing;
	}

	public void setDateOfManufacturing(LocalDate dateOfManufacturing) {
		this.dateOfManufacturing = dateOfManufacturing;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
    
    
}
