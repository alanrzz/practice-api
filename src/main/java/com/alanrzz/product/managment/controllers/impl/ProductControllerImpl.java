package com.alanrzz.product.managment.controllers.impl;

import com.alanrzz.product.managment.controllers.ProductController;
import com.alanrzz.product.managment.entities.Product;
import com.alanrzz.product.managment.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("products")
public class ProductControllerImpl implements ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping()
    public List<Product> findAll() {
        return this.productService.findAll();
    }

    @GetMapping("{id}")
    public Optional<Product> findById(Long id) {
        return this.productService.findById(id);
    }

    @PostMapping()
    public Product create(Product product) {
        return this.productService.create(product);
    }

    @PutMapping("{id}")
    public String edit(Product product, Long id) {
        return this.productService.edit(id, product);
    }

    @DeleteMapping("{id}")
    public String deleteById(Long id) {
        return this.productService.deleteById(id);
    }
}