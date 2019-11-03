package com.will.Filmes.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.will.Filmes.domain.entity.Atuacao;
import com.will.Filmes.repository.AtuacaoRepository;

@RestController
public class AtuacaoResource {
	
	@Autowired
	private AtuacaoRepository atuacaoRepository;
	
	@GetMapping("/api/atuacao")
	public List<Atuacao> listar(){
		return atuacaoRepository.findAll();
	}
	
	@PostMapping("/api/atuacao")
	public void salvar(@RequestBody Atuacao atuacao) {
		atuacaoRepository.save(atuacao);
	}
}
