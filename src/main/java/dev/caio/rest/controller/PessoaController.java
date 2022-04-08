package dev.caio.rest.controller;

import java.util.List;

import javax.inject.Inject;
import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import dev.caio.commom.PessoaMapper;
import dev.caio.domain.service.PessoaService;
import dev.caio.rest.input.PessoaINDTO;
import dev.caio.rest.output.PessoaDTO;


@Path("")
public class PessoaController {

	@Inject
	PessoaService serv;
	
	@Inject
	PessoaMapper mapper;
	
	@Path("/get/pessoas")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<PessoaDTO> listPessoa(){
		return mapper.toListResource(serv.list());
	}
	
	
	@Path("/post/pessoas")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response savePessoa(@Valid PessoaINDTO pessoa) {
		return Response.ok(serv.save(mapper.toEntity(pessoa))).build();
	}
	
}
