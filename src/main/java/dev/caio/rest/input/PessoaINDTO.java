package dev.caio.rest.input;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class PessoaINDTO {

	@NotBlank(message = "Nome não pode ser vazio!")
	public String nome;
	@NotNull(message = "Pessoa deve possuir um departamento")
	@Min(value = 1, message = "Pessoa deve possuir um departamento")
	public Long depar;
}
