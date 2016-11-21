package br.com.pucminas.eleicao.service;

import java.util.List;

import javax.inject.Inject;

import br.com.pucminas.eleicao.dao.EleitorDAO;
import br.com.pucminas.eleicao.dto.FiltroEleitorDTO;
import br.com.pucminas.eleicao.model.Eleitor;

public class EleitorService {
	
	@Inject
	private EleitorDAO eleitorDAO;
	
	public Eleitor salvar(final Eleitor c) {
		return eleitorDAO.salvar(c);
	}

	public Eleitor buscarPorId(final Integer id) {
		return eleitorDAO.buscarPorId(id);
	}

	public Eleitor atualizar(final Eleitor classe) {
		return eleitorDAO.atualizar(classe);
	}
	
	public void deletar(final Eleitor classe) {
		eleitorDAO.apagar(classe);
	}
	
	public List<Eleitor> buscarTodos() {
		return eleitorDAO.buscarTodos();
	}

	public List<Eleitor> buscarComFiltro(FiltroEleitorDTO filtro) {
		return eleitorDAO.buscarComFiltro(filtro);
	}

}
