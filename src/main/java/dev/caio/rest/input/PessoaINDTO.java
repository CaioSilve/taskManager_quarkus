package dev.caio.rest.input;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

public class PessoaINDTO {

	@NotBlank(message = "Nome não pode ser vazio!")
	public String nome;
	@Min(value = 1, message = "Pessoa deve possuir um departamento")
	public Long depar;
}
