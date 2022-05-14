package com.alanrzz.product.managment.seeders;

import com.alanrzz.product.managment.entities.Fabricator;
import com.alanrzz.product.managment.entities.Product;
import com.alanrzz.product.managment.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProductSeeder {
    @Autowired
    ProductRepository productRepository;

    @EventListener
    public void seed(ContextRefreshedEvent event) throws Exception {
        productSeed();
    }

    public void productSeed() {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1L, "Cafe", 20.4, new Fabricator(1L, "Tesla", "USA")));
        productList.add(new Product(2L, "Monitor", 100.0, new Fabricator(2L, "Kans", "Mexico")));
        productList.add(new Product(3L, "Coca Cola", 438.0, new Fabricator(3L, "Marolio", "Argentina")));
        productRepository.saveAll(productList);
    }
}
