package com.nelson.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nelson.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	//somente essa assinatura acima será capaz de instanciar um  objeto Repository que terá várias operações para trabalhar com o User
	
	
	

}
