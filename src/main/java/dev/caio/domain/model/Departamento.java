package dev.caio.domain.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

@Entity
public class Departamento extends PanacheEntityBase {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id;

	@NotBlank(message = "Título deve ser informado!")
	public String titulo;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	
}
