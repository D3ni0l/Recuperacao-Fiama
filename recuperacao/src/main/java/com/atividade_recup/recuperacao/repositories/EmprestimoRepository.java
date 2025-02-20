package com.atividade_recup.recuperacao.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.atividade_recup.recuperacao.entities.Emprestimo;

@Repository
public interface EmprestimoRepository extends JpaRepository<Emprestimo, Long> {
   
    List<Emprestimo> findByUsuarioId(Long usuarioId);

    List<Emprestimo> findByLivroId(Long livroId);
}