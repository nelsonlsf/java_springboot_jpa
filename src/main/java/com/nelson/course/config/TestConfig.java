package com.nelson.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.nelson.course.entities.User;
import com.nelson.course.repositories.UserRepository;

@Configuration
@Profile("test")//igual o nome do perfil colocado no arquivo application.properties
public class TestConfig implements CommandLineRunner{
	
	//classe de configuração específica para o perfil teste 

	//fazer um objeto depender do outro, pois como a clase UserRepository é a classe que salva os dados no banco, logo é um caso de injeção de dependência, enfim, a classe TestConfig depende de UserRepository
	@Autowired //só com essa anotação, vai associar a dependência e associar uma instância do UserRepository na classe TestConfig
	private UserRepository userRepository;

	//agora preciso instanciar objetos e salvar no BD
	//logo é criado esse método Run a partir da implementação do CommandLinaRunner
	//tudo o que tiver dentro do método run(), será executado quando a aplicação for iniciada
	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "98888888", "123456");//passando o Id como nulo, porque o Id será gerado pelo BD agora 
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "97777777", "123456");
		
		//salvar no BD os objetos acima
		userRepository.saveAll(Arrays.asList(u1, u2)); //o saveAll() vai passar uma lista de objetos e salva essa lista no BD
		
	}
			
}
