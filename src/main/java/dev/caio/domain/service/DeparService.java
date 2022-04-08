package dev.caio.domain.service;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import dev.caio.domain.model.Departamento;

@ApplicationScoped
public class DeparService {
	
	
	
	public List<Departamento> list(){
		return Departamento.listAll();
	}
	


}
