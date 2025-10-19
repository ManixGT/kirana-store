package com.example.kiranaStore.mapper;

import com.example.kiranaStore.DTO.request.CategoryRequestDTO;
import com.example.kiranaStore.DTO.response.CategoryResponseDTO;
import com.example.kiranaStore.model.Category;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CategoryMapper {
    Category toEntity(CategoryRequestDTO dto);
    CategoryResponseDTO toCategoryDTO(Category category);
}
