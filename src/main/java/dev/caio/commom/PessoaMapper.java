package dev.caio.commom;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import dev.caio.domain.model.Pessoa;
import dev.caio.rest.input.PessoaINDTO;
import dev.caio.rest.output.PessoaDTO;

@Mapper(config = MappingConfig.class)
public interface PessoaMapper {
	
	@Mapping(target = "depar", source = "depar.titulo")
	PessoaDTO toResource(Pessoa pessoa);
	
	@Mapping(target = "depar.id", source = "depar")
	Pessoa toEntity(PessoaINDTO pessoain);
	
	
	List<PessoaDTO> toListResource(List<Pessoa> pessoas);

}
