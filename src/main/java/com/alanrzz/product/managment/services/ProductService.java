package com.alanrzz.product.managment.services;

import com.alanrzz.product.managment.entities.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    public List<Product> findAll();

    public Optional<Product> findById(Long id);

    public Product create(Product product);

    public String edit(Long id, Product product);

    public String deleteById(Long id);
}
