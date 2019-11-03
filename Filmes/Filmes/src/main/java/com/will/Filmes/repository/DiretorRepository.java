package com.will.Filmes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.will.Filmes.domain.entity.Diretor;

public interface DiretorRepository extends JpaRepository<Diretor, Long> {

}
