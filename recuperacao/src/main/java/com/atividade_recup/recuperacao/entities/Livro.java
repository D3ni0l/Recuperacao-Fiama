package com.atividade_recup.recuperacao.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;


@Entity
@Table(name = "livros")
public class Livro {

	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;

	 private String titulo;
	 private String autor;
	 private int anoPublicacao;

	 @OneToOne(mappedBy = "livro", cascade = CascadeType.ALL)
	 private Emprestimo emprestimo;
	 	
	}