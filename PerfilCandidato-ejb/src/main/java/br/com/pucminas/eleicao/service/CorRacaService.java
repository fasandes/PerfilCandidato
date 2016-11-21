package br.com.pucminas.eleicao.service;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import br.com.pucminas.eleicao.dao.CorRacaDAO;
import br.com.pucminas.eleicao.model.CorRaca;

@Named
public class CorRacaService {

	@Inject
	private CorRacaDAO corRacaDAO;

	public CorRaca salvar(final CorRaca c) {
		return corRacaDAO.salvar(c);
	}

	public CorRaca buscarPorId(final Integer id) {
		return corRacaDAO.buscarPorId(id);
	}

	public CorRaca atualizar(final CorRaca classe) {
		return corRacaDAO.atualizar(classe);
	}

	public void deletar(final CorRaca classe) {
		corRacaDAO.apagar(classe);
	}

	public List<CorRaca> buscarTodos() {
		return corRacaDAO.buscarTodos();
	}

}
