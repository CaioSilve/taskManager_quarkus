package dev.caio.commom;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import dev.caio.domain.model.Tarefa;
import dev.caio.rest.input.TarefaINDTO;
import dev.caio.rest.output.TarefaDTO;

@Mapper(config = MappingConfig.class)
public interface TarefaMapper {
	
	@Mapping(target = "id", source = "tarefa.id", resultType = Long.class)
	@Mapping(target = "pessoa", source = "pessoa.nome", resultType = String.class)
	@Mapping(target = "depar", source = "depar.titulo", resultType = String.class)
	TarefaDTO toResource(Tarefa tarefa);
	
	@Mapping(target = "depar.id", source = "depar")
	Tarefa toEntity(TarefaINDTO tarefa);
	
	
	List<TarefaDTO> toListResource(List<Tarefa> tarefas);

}

