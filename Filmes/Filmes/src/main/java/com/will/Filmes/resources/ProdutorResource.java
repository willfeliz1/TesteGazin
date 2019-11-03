package com.will.Filmes.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.will.Filmes.domain.entity.Produtor;
import com.will.Filmes.repository.ProdutorRepository;

@RestController
public class ProdutorResource {
	
	@Autowired
	private ProdutorRepository produtorrepository;
	
	@GetMapping("/api/produtor")
	public List <Produtor> listar(){
		return produtorrepository.findAll(); 
	}
	
	@PostMapping("/api/produtor")
	public void salvar(@RequestBody Produtor produtor) {
		produtorrepository.save(produtor);
	}
}
