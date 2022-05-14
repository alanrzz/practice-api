package com.alanrzz.product.managment.services.impl;

import com.alanrzz.product.managment.entities.Product;
import com.alanrzz.product.managment.repositories.ProductRepository;
import com.alanrzz.product.managment.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll() {
        return this.productRepository.findAll();
    }

    public Optional<Product> findById(Long id) {
        return this.productRepository.findById(id);
    }

    public Product create(Product product) {
        return this.productRepository.save(product);
    }

    public String edit(Long id, Product product) {
        product.setId(id);
        this.productRepository.save(product);
        return null;
    }

    public String deleteById(Long id) {
        this.productRepository.deleteById(id);
        return null;
    }
}
