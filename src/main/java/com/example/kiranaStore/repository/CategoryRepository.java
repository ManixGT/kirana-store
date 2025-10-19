package com.example.kiranaStore.repository;

import com.example.kiranaStore.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {
}
