package dev.caio.domain.service;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import dev.caio.domain.model.Tarefa;

@ApplicationScoped
public class TarefaService {

	
	
	public List<Tarefa> list(){
		return Tarefa.listAll();
	}
}
