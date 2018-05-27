package io.spring.app.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.spring.app.app.core.Conteudo;
import io.spring.app.app.service.DashboardServiceImplementacao;

@RestController
public class HomeController {
	
	private DashboardServiceImplementacao dashboardServiceImplementacao;
	
	@Autowired
	public HomeController(DashboardServiceImplementacao dashboardServiceImplementacao) {
		this.dashboardServiceImplementacao = dashboardServiceImplementacao;
	}
	
	@RequestMapping("/")
	public void home(@RequestBody String nome) {
		dashboardServiceImplementacao.adicionarConteudo(new Conteudo(nome));
	}
	
	@RequestMapping("/dashboard")
	public List<Conteudo> dashboard() {
		return dashboardServiceImplementacao.getAllConteudos();
	}
	
	@RequestMapping(value = "/dashboard{id}", method = RequestMethod.GET)
	void conteudoPeloId(@RequestBody Long id) {
		
	}
	
	@RequestMapping(value = "/dashboard{id}", method = RequestMethod.POST)
	void editarConteudoPeloId(@RequestBody Long id) {
		
	}
	
	@RequestMapping(value = "/dashboard{id}", method = RequestMethod.DELETE)
	void deletarConteudoPeloId(@RequestBody Long id) {
		
	}

}
