package dev.caio.rest.controller;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import dev.caio.domain.model.Departamento;
import dev.caio.domain.service.DeparService;


@Path("")
public class DeparController {

	
	@Inject
	DeparService serv;
	
	@Path("get/departamentos")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Departamento> listDepar(){
		System.out.println("entrou");
		return Departamento.listAll(null);
	}
}
