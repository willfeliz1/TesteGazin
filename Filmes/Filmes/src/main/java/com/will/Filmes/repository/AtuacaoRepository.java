package com.will.Filmes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.will.Filmes.domain.entity.Atuacao;

public interface AtuacaoRepository extends JpaRepository<Atuacao, Long> {

}
