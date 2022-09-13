package com.rohanbagul.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rohanbagul.blog.entity.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer> {
	
}
