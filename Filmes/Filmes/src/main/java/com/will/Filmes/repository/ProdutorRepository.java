package com.will.Filmes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.will.Filmes.domain.entity.Produtor;

public interface ProdutorRepository extends JpaRepository<Produtor, Long> {

}
