package com.phmqz.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.phmqz.course.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long>{

}
