package com.alanrzz.product.managment.services;

import com.alanrzz.product.managment.dto.FabricatorDTO;
import com.alanrzz.product.managment.entities.Fabricator;

import java.util.List;
import java.util.Optional;

public interface FabricatorService {

    public List<FabricatorDTO> findAll();

    public Optional<Fabricator> findById(Long id);

    public Fabricator create(Fabricator fabricator);

    public String edit(Long id, Fabricator fabricator);

    public String deleteById(Long id);

}
