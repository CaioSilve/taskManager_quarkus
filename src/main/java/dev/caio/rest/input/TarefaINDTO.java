package dev.caio.rest.input;

import java.time.LocalDate;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class TarefaINDTO {
	
	@NotBlank(message = "Titulo não pode ser ser vazio")
	public String titulo;
	@NotBlank(message = "Descrição não pode ser ser vazia")
	public String descricao;
	@NotNull(message = "Prazo não pode ser vazio")
	@Temporal(TemporalType.DATE)
	public LocalDate prazo;
	@Min(value = 1, message = "Duração deve ser pelo menos 1")
	public Integer duracao;
	@NotNull(message = "Tarefa deve possuir um departamento")
	@Min(value = 1, message = "Tarefa deve possuir um departamento")
	public Long depar;

}
