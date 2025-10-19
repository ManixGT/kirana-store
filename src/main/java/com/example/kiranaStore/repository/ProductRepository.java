package com.example.kiranaStore.repository;

import com.example.kiranaStore.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
