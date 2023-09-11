package com.nelson.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nelson.course.entities.User;
import com.nelson.course.repositories.UserRepository;

@Service //anotação para registrar a classe como componente do Spring
public class UserService {
	
	//operações no BD
	@Autowired
	private UserRepository repository;
	
	//possui o método findAll, porém, apenas repassa para o Repository essa chamada
	public List<User> findAll(){
		return repository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}
	

}
