package dev.caio.domain.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

import org.mapstruct.Named;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

@Entity
public class Pessoa extends PanacheEntityBase {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id;

	public String nome;
	@ManyToOne
	@JoinColumn(name = "idDepartamento", nullable = true)
	public Departamento depar;
	@Transient
	@OneToMany(mappedBy = "pessoa", fetch = FetchType.EAGER)
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
	
	@Named("horasGastas")
	public Integer horasGastas() {
		Integer soma = 0;
		
		for (Tarefa t : tarefas) {
			soma += t.getDuracao();
		}
		return soma;
	}
	
	
	
}
