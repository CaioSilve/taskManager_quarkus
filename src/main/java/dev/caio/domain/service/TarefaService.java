package dev.caio.domain.service;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;

import org.hibernate.service.spi.ServiceException;

import dev.caio.domain.model.Departamento;
import dev.caio.domain.model.Pessoa;
import dev.caio.domain.model.Tarefa;

@ApplicationScoped
public class TarefaService {

	
	
	public List<Tarefa> list(){
		return Tarefa.listAll();
	}

	@Transactional
	public void save(Tarefa tarefa) {
		Departamento depart = Departamento.findById(tarefa.getDepar().id);
		if(depart == null) throw new ServiceException("Departamento não encontrado");
		
		
		Tarefa.persist(tarefa);
	}

	@Transactional
	public void alocar(Long id, Long idPessoa) {
		Tarefa tarefa = Tarefa.findById(id);
		Pessoa pessoa = Pessoa.findById(idPessoa);
		
		if(tarefa == null) throw new ServiceException("Tarefa não encontrada");
		if(pessoa == null) throw new ServiceException("Pessoa não encontrada");
		if(tarefa.getDepar() != pessoa.getDepar()) throw new ServiceException("Tarefa e Pessoa não são do mesmo Departamento");
		
		tarefa.setPessoa(pessoa);
		
		tarefa.persist();
		
	}

	@Transactional
	public void finalizar(Long id) {
		Tarefa tarefa = Tarefa.findById(id);
		
		if(tarefa == null) throw new ServiceException("Tarefa não encontrada");
		if(tarefa.getPessoa() == null) throw new ServiceException("Tarefa não pode ser finalizada: Pessoa não alocada");
		
		tarefa.setFinalizado(true);
		
		tarefa.persist();
		
	}
}
