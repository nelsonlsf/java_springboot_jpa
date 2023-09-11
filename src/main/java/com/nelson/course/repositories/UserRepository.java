package com.nelson.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nelson.course.entities.User;

//a anotação de registro de uma classe como componente Spring nesse caso não é necessário, uma vez que ela já estende do JpaRepository que é um componente Spring
public interface UserRepository extends JpaRepository<User, Long> {
	
	//somente essa assinatura acima será capaz de instanciar um  objeto Repository que terá várias operações para trabalhar com o User
	
	
	

}
