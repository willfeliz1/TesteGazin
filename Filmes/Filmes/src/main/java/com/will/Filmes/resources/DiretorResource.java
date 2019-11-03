package com.will.Filmes.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.will.Filmes.domain.entity.Diretor;
import com.will.Filmes.repository.DiretorRepository;

@RestController

public class DiretorResource {
	
	@Autowired
	private DiretorRepository diretorRepository;
	
	@GetMapping("/api/diretor")
	public List<Diretor> listar(){
		return diretorRepository.findAll();
	}
	
	@PostMapping("/api/diretor")
	public void salvar(@RequestBody Diretor diretor) {
		diretorRepository.save(diretor);
	}
}
