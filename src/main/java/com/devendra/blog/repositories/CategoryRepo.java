package com.devendra.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devendra.blog.entities.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer>{

}
