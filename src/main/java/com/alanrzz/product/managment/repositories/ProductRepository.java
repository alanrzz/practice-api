package com.alanrzz.product.managment.repositories;

import com.alanrzz.product.managment.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}