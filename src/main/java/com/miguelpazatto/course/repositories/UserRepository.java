package com.miguelpazatto.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.miguelpazatto.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
