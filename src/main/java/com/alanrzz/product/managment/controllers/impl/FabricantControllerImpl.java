package com.alanrzz.product.managment.controllers.impl;

import com.alanrzz.product.managment.controllers.FabricantController;
import com.alanrzz.product.managment.dto.FabricatorDTO;
import com.alanrzz.product.managment.entities.Fabricator;
import com.alanrzz.product.managment.services.FabricatorService;
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
@RequestMapping("fabricants")
public class FabricantControllerImpl implements FabricantController {

    @Autowired
    private FabricatorService fabricatorService;

    @GetMapping()
    public List<FabricatorDTO> findAll() {
        return this.fabricatorService.findAll();
    }

    @GetMapping("{id}")
    public Optional<Fabricator> findById(Long id) {
        return this.fabricatorService.findById(id);
    }

    @PostMapping()
    public Fabricator create(Fabricator fabricator) {
        return this.fabricatorService.create(fabricator);
    }

    @PutMapping("{id}")
    public String edit(Fabricator fabricator, Long id) {
        return this.fabricatorService.edit(id, fabricator);
    }

    @DeleteMapping("{id}")
    public String deleteById(Long id) {
        return this.fabricatorService.deleteById(id);
    }
}
