package com.rafael.cursoMC1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rafael.cursoMC1.domain.Categoria;

@Repository
public interface  CategoriaRepository extends JpaRepository<Categoria, Integer> {

}
