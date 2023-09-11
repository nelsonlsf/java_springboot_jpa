package com.nelson.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nelson.course.entities.User;
import com.nelson.course.services.UserService;

@RestController 
@RequestMapping(value = "/users") //nome para o recurso
public class UserResource {
	
	//ESSE É O CONTROLADOR REST QUE RESPONDE NO CAMINHO /users
	
	//Camada de recursos (camada de controladores REST)
	//Classe que vai disponibilizar um recurso Web correspondente à classe User
	
	//método que será um endpoint para acessar os usuários
	//ResponseEntity (tipo de retorno do método), tipo específico do Spring para retornar respostas de requisição Web
	@Autowired
	private UserService service;
	
	@GetMapping //pra indicar que esse método responde à requisiçãod do tipo GET do http
	public ResponseEntity<List<User>> findAll(){
		//após a criação do UserService, fazer o que está abaixo
		List<User> list = service.findAll();
		return ResponseEntity.ok().body(list); //ok() para retornar a responsta com sucesso no http e body(u) pra retornar no corpo da resposta o u
	}
	
	@GetMapping(value = "/{id}") //indicando que a minha requisição vai aceitar um ID dentro da URL
	public ResponseEntity<User> findById(@PathVariable Long id){ //a anotação é para receber o ID como parâmetro na URL
		User obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	

}
