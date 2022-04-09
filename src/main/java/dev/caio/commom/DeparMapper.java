package dev.caio.commom;

import java.util.List;

import org.mapstruct.Mapper;

import dev.caio.domain.model.Departamento;
import dev.caio.rest.output.DeparDTO;

@Mapper(config = MappingConfig.class)
public interface DeparMapper {
	
	DeparDTO toResource(Departamento depar);
	
	
	List<DeparDTO> toListResource(List<Departamento> departamentos);
}
