package io.spring.app.app.core;

import java.util.ArrayList;
import java.util.List;


public class Dashboard {
	
	List<Conteudo> conteudos = new ArrayList<>();
	
	public void adicionarConteudo(String nome) {
		conteudos.add(new Conteudo(nome));
	}
	
	public List<Conteudo> getConteudos() {
		return conteudos;
	}
	
}
