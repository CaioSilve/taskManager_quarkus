package dev.caio.domain.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class Tarefa extends PanacheEntity{

	public String titulo;
	public String descricao;
	public LocalDate prazo;
	public Integer duracao;
	public Boolean finalizado;
	@ManyToOne
	@JoinColumn(name = "idDepartamento", nullable = false)
	public Departamento depar;
	@ManyToOne
	@JoinColumn(name = "idPessoa", nullable = true)
	public Pessoa pessoa;
	
	
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public LocalDate getPrazo() {
		return prazo;
	}
	public void setPrazo(LocalDate prazo) {
		this.prazo = prazo;
	}
	public Integer getDuracao() {
		return duracao;
	}
	public void setDuracao(Integer duracao) {
		this.duracao = duracao;
	}
	public Boolean getFinalizado() {
		return finalizado;
	}
	public void setFinalizado(Boolean finalizado) {
		this.finalizado = finalizado;
	}
	public Departamento getDepar() {
		return depar;
	}
	public void setDepar(Departamento depar) {
		this.depar = depar;
	}
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	
	
}
