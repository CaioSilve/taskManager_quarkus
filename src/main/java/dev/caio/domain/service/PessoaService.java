package dev.caio.domain.service;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;

import org.hibernate.service.spi.ServiceException;

import dev.caio.domain.model.Departamento;
import dev.caio.domain.model.Pessoa;
import dev.caio.domain.model.Tarefa;

@ApplicationScoped
public class PessoaService {
	

	
	public List<Pessoa> list(){
		
		
		return Pessoa.listAll();
	}

	@Transactional
	public Pessoa save(Pessoa entity) {
		Departamento depart = Departamento.findById(entity.getDepar().id);
		if(depart == null) throw new ServiceException("Departamento não encontrado");
		
		Pessoa.persist(entity);
		
		return entity;
		
	}
	
	@Transactional
	public Pessoa update(Long id, Pessoa entity) {
		Pessoa pessoa = Pessoa.findById(id);
		Departamento depart = Departamento.findById(entity.getDepar().id);
		
		if(pessoa == null) throw new ServiceException("Pessoa não encontrada");
		if(depart == null) throw new ServiceException("Departamento não encontrado");
		pessoa.setDepar(entity.getDepar());
		pessoa.setNome(entity.getNome());
		
		Pessoa.persist(pessoa);
		
		return pessoa;
	}
	
	@Transactional
	public void delete(Long id) {
		Pessoa pessoa = Pessoa.findById(id);
		if(pessoa == null) throw new ServiceException("Pessoa não encontrada");
		
		Tarefa.delete("pessoa", pessoa);
		
		
		Pessoa.deleteById(id);
		Pessoa.flush();
	}
}
