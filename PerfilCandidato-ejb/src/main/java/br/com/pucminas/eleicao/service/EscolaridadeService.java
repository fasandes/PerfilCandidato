package br.com.pucminas.eleicao.service;

import java.util.List;

import javax.inject.Inject;

import br.com.pucminas.eleicao.dao.EscolaridadeDAO;
import br.com.pucminas.eleicao.model.Escolaridade;

public class EscolaridadeService {
	
	@Inject
	private EscolaridadeDAO escolaridadeDAO;
	
	public Escolaridade salvar(final Escolaridade c) {
		return escolaridadeDAO.salvar(c);
	}

	public Escolaridade buscarPorId(final Integer id) {
		return escolaridadeDAO.buscarPorId(id);
	}

	public Escolaridade atualizar(final Escolaridade classe) {
		return escolaridadeDAO.atualizar(classe);
	}
	
	public void deletar(final Escolaridade classe) {
		escolaridadeDAO.apagar(classe);
	}
	
	public List<Escolaridade> buscarTodos() {
		return escolaridadeDAO.buscarTodos();
	}
	
	public Escolaridade buscarPorDescricao(String descricao) {
		return escolaridadeDAO.buscarPorDescricao(descricao);
	}

}
