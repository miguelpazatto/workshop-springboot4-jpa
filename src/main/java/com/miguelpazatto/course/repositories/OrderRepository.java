package com.miguelpazatto.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.miguelpazatto.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
