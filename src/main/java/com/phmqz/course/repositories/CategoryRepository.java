package com.phmqz.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.phmqz.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
