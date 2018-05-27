package io.spring.app.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.spring.app.app.core.Conteudo;
import io.spring.app.app.repository.DashboardRepository;

@Service
public class DashboardServiceImplementacao implements DashboardService {
	
	@Autowired
	private DashboardRepository dashboardRepository;
	private List<Conteudo> conteudos = new ArrayList<>();
	
	@Override
	public List<Conteudo> getAllConteudos() {
		return dashboardRepository.findAll();
	}

	@Override
	public void adicionarConteudo(Conteudo conteudo) {
		conteudos.add(conteudo);
		dashboardRepository.saveAll(conteudos);
	}


}
