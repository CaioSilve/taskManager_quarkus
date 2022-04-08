package dev.caio.domain.service;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;

import org.hibernate.service.spi.ServiceException;

import dev.caio.domain.model.Departamento;
import dev.caio.domain.model.Pessoa;

@ApplicationScoped
public class PessoaService {

	
	public List<Pessoa> list(){
		return Pessoa.listAll();
	}

	@Transactional
	public Pessoa save(Pessoa entity) {
		Departamento depart = Departamento.findById(entity.getDepar().id);
//		if(depar.equals(null)) throw new ServiceException("Departamento não existe");
//		
		entity.setDepar(depart);
//		Pessoa.persist(entity);
		
		return entity;
		
	}
}
