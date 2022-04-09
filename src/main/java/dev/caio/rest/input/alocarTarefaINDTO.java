package dev.caio.rest.input;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class alocarTarefaINDTO {
	
	@NotNull(message = "idPessoa não pode ser nulo")
	@Min(value = 1, message = "idPessoa tem que ser válida")
	public Long idPessoa;

	public Long getIdPessoa() {
		return idPessoa;
	}

	public void setIdPessoa(Long idPessoa) {
		this.idPessoa = idPessoa;
	}
	
	

}
