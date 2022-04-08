package dev.caio.domain.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class Pessoa extends PanacheEntity {

	public String nome;
	@ManyToOne
	@JoinColumn(name = "idDepartamento", nullable = true)
	public Departamento depar;
	
	@Transient
	public Set<Tarefa> tarefas;
	
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Departamento getDepar() {
		return depar;
	}

	public void setDepar(Departamento depar) {
		this.depar = depar;
	}

	public Set<Tarefa> getTarefas() {
		return tarefas;
	}

	public void setTarefas(Set<Tarefa> tarefas) {
		this.tarefas = tarefas;
	}
	
	
	
}
