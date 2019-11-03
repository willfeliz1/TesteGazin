package com.will.Filmes.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.will.Filmes.domain.entity.Filme;
import com.will.Filmes.repository.FilmeRepository;

@RestController
public class FilmeResource {

		
		@Autowired
		private FilmeRepository filmeRepository;
		
		@GetMapping("/api/filme")
		public List<Filme> listar(){
			return filmeRepository.findAll();
		}
		
		@PostMapping("/api/filme")
		public void salvar(@RequestBody Filme filme) {
			filmeRepository.save(filme);
		}
}
