package com.atividade_recup.recuperacao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.atividade_recup.recuperacao.entities.Livro;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long> {
}