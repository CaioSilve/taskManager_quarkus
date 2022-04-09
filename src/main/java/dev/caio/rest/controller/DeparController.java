package dev.caio.rest.controller;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import dev.caio.commom.DeparMapper;
import dev.caio.domain.model.Departamento;
import dev.caio.domain.service.DeparService;
import dev.caio.rest.output.DeparDTO;


@Path("")
public class DeparController {

	
	@Inject
	DeparService serv;
	
	@Inject
	DeparMapper mapper;
	
	@Path("get/departamentos")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<DeparDTO> listDepar(){
		return mapper.toListResource(Departamento.listAll());
	}
}
