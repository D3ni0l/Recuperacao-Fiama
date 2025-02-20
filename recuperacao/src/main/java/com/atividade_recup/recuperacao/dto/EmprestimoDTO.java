package com.atividade_recup.recuperacao.dto;

import java.time.LocalDate;

public class EmprestimoDTO { 
	
	private Long id;
	private LocalDate dataEmprestimo;
	private LocalDate dataDevolucaoPrevista;
	private Long usuarioId;
	private Long livroId;
	
	public EmprestimoDTO(Long id, LocalDate dataEmprestimo, LocalDate dataDevolucaoPrevista, Long usuarioId,Long livroId) {
		super();
		this.id = id;
		this.dataEmprestimo = dataEmprestimo;
		this.dataDevolucaoPrevista = dataDevolucaoPrevista;
		this.usuarioId = usuarioId;
		this.livroId = livroId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getDataEmprestimo() {
		return dataEmprestimo;
	}

	public void setDataEmprestimo(LocalDate dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}

	public LocalDate getDataDevolucaoPrevista() {
		return dataDevolucaoPrevista;
	}

	public void setDataDevolucaoPrevista(LocalDate dataDevolucaoPrevista) {
		this.dataDevolucaoPrevista = dataDevolucaoPrevista;
	}

	public Long getUsuarioId() {
		return usuarioId;
	}

	public void setUsuarioId(Long usuarioId) {
		this.usuarioId = usuarioId;
	}

	public Long getLivroId() {
		return livroId;
	}
	
	public void setLivroId(Long livroId) {
		this.livroId = livroId;
	}
}
