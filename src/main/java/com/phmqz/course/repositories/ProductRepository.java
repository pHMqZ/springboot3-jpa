package com.phmqz.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.phmqz.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
