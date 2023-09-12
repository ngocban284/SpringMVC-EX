package com.example.springmvcproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springmvcproject.models.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{
    
}