package com.webapp.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.webapp.backend.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
