package com.example.kiranaStore.mapper;

import com.example.kiranaStore.DTO.request.ProductRequestDTO;
import com.example.kiranaStore.DTO.response.ProductResponseDTO;
import com.example.kiranaStore.model.Product;
import org.mapstruct.Mapper;

@Mapper(componentModel="spring")
public interface ProductMapper {
    Product toEntity(ProductRequestDTO dto);
    ProductResponseDTO toResponseDTO(Product product);
}
