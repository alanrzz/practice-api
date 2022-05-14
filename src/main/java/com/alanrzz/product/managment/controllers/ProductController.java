package com.alanrzz.product.managment.controllers;

import com.alanrzz.product.managment.entities.Product;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

public interface ProductController {

    public List<Product> findAll();

    public Optional<Product> findById(@PathVariable Long id);

    public Product create(@RequestBody Product product);

    public String edit(@RequestBody Product product, @PathVariable Long id);

    public String deleteById(@PathVariable Long id);

}
