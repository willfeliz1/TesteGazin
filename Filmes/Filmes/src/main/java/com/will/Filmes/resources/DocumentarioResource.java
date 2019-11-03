package com.will.Filmes.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.will.Filmes.domain.entity.Documentario;
import com.will.Filmes.repository.DocumentarioRepository;

@RestController
public class DocumentarioResource {

	@Autowired
	private DocumentarioRepository documentarioRepository;
	
	@GetMapping("/api/documentario")
	public List<Documentario> listar(){
		return documentarioRepository.findAll();
	}
	
	@PostMapping("/api/documentario")
	public void salvar(@RequestBody Documentario documentario) {
		documentarioRepository.save(documentario);
	}
}
