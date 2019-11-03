package com.will.Filmes.domain.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Atuacao {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String papel;
	
	@ManyToOne
	@JoinColumn(name="ato_id", referencedColumnName = "id")
	private Ator ator;
	
	@OneToOne
	@JoinColumn(name="fil_id", referencedColumnName = "id")
	private Filme filme;
	
	
	public Filme getFilme() {
		return filme;
	}
	public void setFilme(Filme filme) {
		this.filme = filme;
	}
	public Ator getAtor() {
		return ator;
	}
	public void setAtor(Ator ator) {
		this.ator = ator;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getPapel() {
		return papel;
	}
	public void setPapel(String papel) {
		this.papel = papel;
	}
	
	 
	
}
