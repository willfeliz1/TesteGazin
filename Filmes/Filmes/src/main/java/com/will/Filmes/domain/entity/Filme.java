package com.will.Filmes.domain.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Filme {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private double verba;
	
	@JsonFormat(pattern="dd-mm-yyyy")
	private Date dtgravacaoinicio;
	@JsonFormat(pattern="dd-mm-yyyy")
	private Date dtgravacaofim;
	
	@OneToOne
	@JoinColumn(name ="pro_id", referencedColumnName = "id")	
	private Produtor produtor;
	
	@OneToOne
	@JoinColumn(name ="dir_id", referencedColumnName = "id")
	private Diretor diretor;
	
	@OneToOne
	@JoinColumn(name ="lon_id", referencedColumnName = "id")
	private LongaMetragem longametragem;
	
	@OneToOne
	@JoinColumn(name ="doc_id", referencedColumnName = "id")
	private Documentario documentario;
	
	@OneToOne
	@JoinColumn(name ="ato_id", referencedColumnName = "id")
	private Ator ator;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public double getVerba() {
		return verba;
	}
	public void setVerba(double verba) {
		this.verba = verba;
	}
	public Date getDtgravacaoinicio() {
		return dtgravacaoinicio;
	}
	public void setDtgravacaoinicio(Date dtgravacaoinicio) {
		this.dtgravacaoinicio = dtgravacaoinicio;
	}
	public Date getDtgravacaofim() {
		return dtgravacaofim;
	}
	public void setDtgravacaofim(Date dtgravacaofim) {
		this.dtgravacaofim = dtgravacaofim;
	}
	
	public Produtor getProdutor() {
		return produtor;
	}
	public void setProdutor(Produtor produtor) {
		this.produtor = produtor;
	}
	public Diretor getDiretor() {
		return diretor;
	}
	public void setDiretor(Diretor diretor) {
		this.diretor = diretor;
	}
	public LongaMetragem getLongametragem() {
		return longametragem;
	}
	public void setLongametragem(LongaMetragem longametragem) {
		this.longametragem = longametragem;
	}
	public Documentario getDocumentario() {
		return documentario;
	}
	public void setDocumentario(Documentario documentario) {
		this.documentario = documentario;
	}
	public Ator getAtor() {
		return ator;
	}
	public void setAtor(Ator ator) {
		this.ator = ator;
	}
	

	
	

}
