package dev.caio.rest.controller;

import java.util.List;

import javax.inject.Inject;
import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import dev.caio.commom.PessoaMapper;
import dev.caio.domain.service.PessoaService;
import dev.caio.rest.input.PessoaINDTO;
import dev.caio.rest.output.PessoaDTO;


@Path("")
@Produces(MediaType.APPLICATION_JSON)
public class PessoaController {

	@Inject
	PessoaService serv;
	
	@Inject
	PessoaMapper mapper;
	
	@Path("/get/pessoas")
	@GET
	public List<PessoaDTO> listPessoa(){
		return mapper.toListResource(serv.list());
	}
	
	
	@Path("/post/pessoas")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response savePessoa(@Valid PessoaINDTO pessoa) {
		serv.save(mapper.toEntity(pessoa));
		return Response.noContent().build();
	}
	
	@Path("/put/pessoas/{id}")
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public Response updatePessoa(@PathParam("id") Long id, @Valid PessoaINDTO pessoa) {
		serv.update(id, mapper.toEntity(pessoa));
		return Response.noContent().build();
	}
	
	@Path("/delete/pessoas/{id}")
	@DELETE
	@Consumes(MediaType.APPLICATION_JSON)
	public Response removePessoa(@PathParam("id") Long id) {
		serv.delete(id);
		return Response.noContent().build();
	}
	
}
