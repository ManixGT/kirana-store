package com.example.kiranaStore.DTO.request;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductRequestDTO {
    private String name;
    private BigDecimal price;
    private String description;
}
