package dev.caio.rest.controller;

import java.util.List;

import javax.inject.Inject;
import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import dev.caio.commom.TarefaMapper;
import dev.caio.domain.service.TarefaService;
import dev.caio.rest.input.TarefaINDTO;
import dev.caio.rest.input.alocarTarefaINDTO;
import dev.caio.rest.output.TarefaDTO;

@Path("")
@Consumes(MediaType.APPLICATION_JSON)
public class TarefaController {

	@Inject
	TarefaService serv;
	
	@Inject
	TarefaMapper mapper;
	
	@Path("/get/tarefas")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<TarefaDTO> listTarefa(){
		return mapper.toListResource(serv.list());
	}
	
	@Path("/post/tarefas")
	@POST
	public Response saveTarefa(@Valid TarefaINDTO tarefa) {
		serv.save(mapper.toEntity(tarefa));
		return Response.ok().build();
	}
	
	@Path("/put/tarefas/alocar/{id}")
	@PUT
	public Response alocarPessoa(@PathParam(value = "id") Long id, @Valid alocarTarefaINDTO alocar) {
		serv.alocar(id, alocar.getIdPessoa());
		return Response.noContent().build();
	}
	
	@Path("/put/tarefas/finalizar/{id}")
	@PUT
	public Response finalizarTarefa(@PathParam(value = "id") Long id) {
		serv.finalizar(id);
		return Response.noContent().build(); 
	}
	
}
