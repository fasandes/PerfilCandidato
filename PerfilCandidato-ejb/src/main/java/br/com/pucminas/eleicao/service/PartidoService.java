package br.com.pucminas.eleicao.service;

import java.util.List;

import javax.inject.Inject;

import br.com.pucminas.eleicao.dao.PartidoDAO;
import br.com.pucminas.eleicao.model.Partido;

public class PartidoService {
	
	@Inject
	private PartidoDAO partidoDAO;
	
	public Partido salvar(final Partido c) {
		return partidoDAO.salvar(c);
	}

	public Partido buscarPorId(final Integer id) {
		return partidoDAO.buscarPorId(id);
	}

	public Partido atualizar(final Partido classe) {
		return partidoDAO.atualizar(classe);
	}
	
	public void deletar(final Partido classe) {
		partidoDAO.apagar(classe);
	}
	
	public List<Partido> buscarTodos() {
		return partidoDAO.buscarTodos();
	}

}
