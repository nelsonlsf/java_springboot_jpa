package com.nelson.course.entities;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//anotações nessa entidade, para instruir para JPA como ele vai converter os objetos para o modelo relacional
@Entity
@Table(name = "tb_user") //renomear o nome da tabela do banco H2 para tb_user
public class User implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id //informando que o id é a chave primária
	@GeneratedValue(strategy = GenerationType.IDENTITY)//informa para o JPA que essa chave é auto incrementável no banco de dados 
	private Long id;
	private String name;
	private String email;
	private String fone;
	private String password;
	
	public User() {
		
	}

	public User(Long id, String name, String email, String fone, String password) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.fone = fone;
		this.password = password;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFone() {
		return fone;
	}

	public void setFone(String fone) {
		this.fone = fone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
	

}
