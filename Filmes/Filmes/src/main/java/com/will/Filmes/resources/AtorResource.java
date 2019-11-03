package com.will.Filmes.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.will.Filmes.domain.entity.Ator;
import com.will.Filmes.repository.AtorRepository;

@RestController

public class AtorResource {
	
	@Autowired
	private AtorRepository atorRepository;
	
	@GetMapping("/api/ator")
	public List<Ator> listar(){
		return atorRepository.findAll();
	}
	
	@PostMapping("/api/ator")
	public void salvar(@RequestBody Ator ator) {
		atorRepository.save(ator);
	}
}
