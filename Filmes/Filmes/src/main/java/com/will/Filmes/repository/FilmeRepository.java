package com.will.Filmes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.will.Filmes.domain.entity.Filme;

public interface FilmeRepository extends JpaRepository<Filme, Long> {

}
