package com.miguelpazatto.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.miguelpazatto.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}
