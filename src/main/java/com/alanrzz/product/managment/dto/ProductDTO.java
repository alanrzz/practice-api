package com.alanrzz.product.managment.dto;

import com.alanrzz.product.managment.entities.Fabricator;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class ProductDTO {

    private Long id;
    private String name;
    private Double price;
    private Fabricator fabricator;
}
