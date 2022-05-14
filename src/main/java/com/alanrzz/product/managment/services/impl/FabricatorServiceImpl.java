package com.alanrzz.product.managment.services.impl;

import com.alanrzz.product.managment.dto.FabricatorDTO;
import com.alanrzz.product.managment.entities.Fabricator;
import com.alanrzz.product.managment.repositories.FabricatorRepository;
import com.alanrzz.product.managment.services.FabricatorService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class FabricatorServiceImpl implements FabricatorService {

    @Autowired
    private FabricatorRepository fabricatorRepository;

    @Autowired
    private ModelMapper modelMapper;

    public List<FabricatorDTO> findAll() {
        return this.fabricatorRepository.findAll().stream().map(this::convertEntityToDto).collect(Collectors.toList());
    }

    public Optional<Fabricator> findById(Long id) {
        return this.fabricatorRepository.findById(id);
    }

    public Fabricator create(Fabricator fabricator) {
        return this.fabricatorRepository.save(fabricator);
    }

    public String edit(Long id, Fabricator fabricator) {
        fabricator.setId(id);
        this.fabricatorRepository.save(fabricator);
        return null;
    }

    public String deleteById(Long id) {
        this.fabricatorRepository.deleteById(id);
        return null;
    }

    private FabricatorDTO convertEntityToDto(Fabricator fabricator) {
        FabricatorDTO fabricatorDTO = new FabricatorDTO();
        fabricatorDTO = modelMapper.map(fabricator, FabricatorDTO.class);
        return null;
    }
}
