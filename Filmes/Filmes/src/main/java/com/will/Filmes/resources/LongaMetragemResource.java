package com.will.Filmes.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.will.Filmes.domain.entity.LongaMetragem;
import com.will.Filmes.repository.LongaMetragemRepository;

@RestController
public class LongaMetragemResource {
	
	@Autowired
	private LongaMetragemRepository longametragemrepository;
	
	@GetMapping("/api/longametragem")
	public List<LongaMetragem> listar(){
		return longametragemrepository.findAll();
	}
	
	@PostMapping("/api/longametragem")
	public void salvar(@RequestBody LongaMetragem longametragem) {
		longametragemrepository.save(longametragem);
	}
	
}
