package com.nelson.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nelson.course.entities.User;

@RestController 
@RequestMapping(value = "/users") //nome para o recurso
public class UserResource {
	
	//ESSE É O CONTROLADOR REST QUE RESPONDE NO CAMINHO /users
	
	//Camada de recursos (camada de controladores REST)
	//Classe que vai disponibilizar um recurso Web correspondente à classe User
	
	//método que será um endpoint para acessar os usuários
	//ResponseEntity (tipo de retorno do método), tipo específico do Spring para retornar respostas de requisição Web
	
	@GetMapping //pra indicar que esse método responde à requisiçãod do tipo GET do http
	public ResponseEntity<User> finAll(){
		User u = new User(1L, "Maria", "maria@gmail.com", "99999999", "12345"); //como o Id é tipo Long, tem que colocar um L após o valor
		return ResponseEntity.ok().body(u); //ok() para retornar a responsta com sucesso no http e body(u) pra retornar no corpo da resposta o u
	}
	

}
