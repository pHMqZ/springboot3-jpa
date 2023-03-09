package com.phmqz.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.phmqz.course.entities.OrderItem;
import com.phmqz.course.entities.pk.OrderItemPK;


public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{

}
