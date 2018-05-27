package io.spring.app.app.service;

import java.util.List;

import io.spring.app.app.core.Conteudo;

public interface DashboardService {
	
	List<Conteudo> getAllConteudos();
	void adicionarConteudo(Conteudo conteudo);
}
