package br.com.pucminas.eleicao.service;

import java.util.List;

import javax.inject.Inject;

import br.com.pucminas.eleicao.dao.EstadoCivilDAO;
import br.com.pucminas.eleicao.model.EstadoCivil;

public class EstadoCivilService {
	
	@Inject
	private EstadoCivilDAO estadoCivilDAO;
	
	public EstadoCivil salvar(final EstadoCivil c) {
		return estadoCivilDAO.salvar(c);
	}

	public EstadoCivil buscarPorId(final Integer id) {
		return estadoCivilDAO.buscarPorId(id);
	}

	public EstadoCivil atualizar(final EstadoCivil classe) {
		return estadoCivilDAO.atualizar(classe);
	}
	
	public void deletar(final EstadoCivil classe) {
		estadoCivilDAO.apagar(classe);
	}
	
	public List<EstadoCivil> buscarTodos() {
		return estadoCivilDAO.buscarTodos();
	}

}
