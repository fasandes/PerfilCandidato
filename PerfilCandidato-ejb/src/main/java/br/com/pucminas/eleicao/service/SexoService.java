package br.com.pucminas.eleicao.service;

import java.util.List;

import javax.inject.Inject;

import br.com.pucminas.eleicao.dao.SexoDAO;
import br.com.pucminas.eleicao.model.Sexo;

public class SexoService {
	
	@Inject
	private SexoDAO sexoDAO;
	
	public Sexo salvar(final Sexo c) {
		return sexoDAO.salvar(c);
	}

	public Sexo buscarPorId(final Integer id) {
		return sexoDAO.buscarPorId(id);
	}

	public Sexo atualizar(final Sexo classe) {
		return sexoDAO.atualizar(classe);
	}
	
	public void deletar(final Sexo classe) {
		sexoDAO.apagar(classe);
	}
	
	public List<Sexo> buscarTodos() {
		return sexoDAO.buscarTodos();
	}
	
	public Sexo buscarPorDescricao(String descricao) {
		return sexoDAO.buscarPorDescricao(descricao);
	}

}
