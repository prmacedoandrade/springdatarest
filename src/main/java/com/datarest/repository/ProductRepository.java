package com.datarest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.datarest.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
