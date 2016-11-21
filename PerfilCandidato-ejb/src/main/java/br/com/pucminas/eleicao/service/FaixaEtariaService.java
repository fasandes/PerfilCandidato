package br.com.pucminas.eleicao.service;

import java.util.List;

import javax.inject.Inject;

import br.com.pucminas.eleicao.dao.FaixaEtariaDAO;
import br.com.pucminas.eleicao.model.FaixaEtaria;

public class FaixaEtariaService {
	
	@Inject
	private FaixaEtariaDAO faixaEtariaDAO;
	
	public FaixaEtaria salvar(final FaixaEtaria c) {
		return faixaEtariaDAO.salvar(c);
	}

	public FaixaEtaria buscarPorId(final String id) {
		return faixaEtariaDAO.buscarPorId(id);
	}

	public FaixaEtaria atualizar(final FaixaEtaria classe) {
		return faixaEtariaDAO.atualizar(classe);
	}
	
	public void deletar(final FaixaEtaria classe) {
		faixaEtariaDAO.apagar(classe);
	}
	
	public List<FaixaEtaria> buscarTodos() {
		return faixaEtariaDAO.buscarTodos();
	}
	
	public FaixaEtaria buscarPorDescricao(String descricao) {
		return faixaEtariaDAO.buscarPorDescricao(descricao);
	}

}
