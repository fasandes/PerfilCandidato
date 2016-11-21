package br.com.pucminas.eleicao.service;

import java.util.List;

import javax.inject.Inject;

import br.com.pucminas.eleicao.dao.MunicipioDAO;
import br.com.pucminas.eleicao.model.Municipio;
import br.com.pucminas.eleicao.model.MunicipioPK;

public class MunicipioService {
	
	@Inject
	private MunicipioDAO municipioDAO;
	
	public Municipio salvar(final Municipio c) {
		return municipioDAO.salvar(c);
	}

	public Municipio buscarPorId(final MunicipioPK id) {
		return municipioDAO.buscarPorId(id);
	}

	public Municipio atualizar(final Municipio classe) {
		return municipioDAO.atualizar(classe);
	}
	
	public void deletar(final Municipio classe) {
		municipioDAO.apagar(classe);
	}
	
	public List<Municipio> buscarTodos() {
		return municipioDAO.buscarTodos();
	}

}
