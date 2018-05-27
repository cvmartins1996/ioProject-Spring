package io.spring.app.app.core;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Conteudo {
	
	@Id
	@GeneratedValue
	private Long id;
	private String nome;

	public Conteudo() {
		
	}
	
	public Conteudo(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	
}
