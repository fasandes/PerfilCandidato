package br.com.pucminas.eleicao.service;

import java.util.List;

import javax.inject.Inject;

import br.com.pucminas.eleicao.dao.OcupacaoDAO;
import br.com.pucminas.eleicao.model.Ocupacao;

public class OcupacaoService {
	
	@Inject
	private OcupacaoDAO ocupacaoDAO;
	
	public Ocupacao salvar(final Ocupacao c) {
		return ocupacaoDAO.salvar(c);
	}

	public Ocupacao buscarPorId(final Integer id) {
		return ocupacaoDAO.buscarPorId(id);
	}

	public Ocupacao atualizar(final Ocupacao classe) {
		return ocupacaoDAO.atualizar(classe);
	}
	
	public void deletar(final Ocupacao classe) {
		ocupacaoDAO.apagar(classe);
	}
	
	public List<Ocupacao> buscarTodos() {
		return ocupacaoDAO.buscarTodos();
	}

}
