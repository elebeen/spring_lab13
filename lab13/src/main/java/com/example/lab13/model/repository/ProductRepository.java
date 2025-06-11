package com.example.lab13.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.lab13.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
    // Additional query methods can be defined here if needed
}
