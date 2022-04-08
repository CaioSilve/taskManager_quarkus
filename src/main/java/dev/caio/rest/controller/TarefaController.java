package dev.caio.rest.controller;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import dev.caio.domain.model.Tarefa;
import dev.caio.domain.service.TarefaService;

@Path("")
public class TarefaController {

	@Inject
	TarefaService serv;
	
	@Path("/get/tarefas")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Tarefa> listTarefa(){
		return serv.list();
	}
}
