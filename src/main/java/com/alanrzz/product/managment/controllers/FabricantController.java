package com.alanrzz.product.managment.controllers;

import com.alanrzz.product.managment.dto.FabricatorDTO;
import com.alanrzz.product.managment.entities.Fabricator;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

public interface FabricantController {

    public List<FabricatorDTO> findAll();

    public Optional<Fabricator> findById(@PathVariable Long id);

    public Fabricator create(@RequestBody Fabricator fabricator);

    public String edit(@RequestBody Fabricator fabricator, @PathVariable Long id);

    public String deleteById(@PathVariable Long id);

}
