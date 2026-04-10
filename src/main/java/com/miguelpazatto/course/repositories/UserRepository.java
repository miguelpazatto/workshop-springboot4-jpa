package com.miguelpazatto.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.miguelpazatto.course.entities.User;

//nesse caso notation de component não é necessária pela relação de herança
public interface UserRepository extends JpaRepository<User, Long> {
	
}
