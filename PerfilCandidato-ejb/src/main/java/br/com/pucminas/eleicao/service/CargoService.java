package br.com.pucminas.eleicao.service;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import br.com.pucminas.eleicao.dao.CargoDAO;
import br.com.pucminas.eleicao.model.Cargo;

@Named
public class CargoService {

	@Inject
	private CargoDAO cargoDAO;

	public Cargo salvar(final Cargo c) {
		return cargoDAO.salvar(c);
	}

	public Cargo buscarPorId(final Integer id) {
		return cargoDAO.buscarPorId(id);
	}

	public Cargo atualizar(final Cargo classe) {
		return cargoDAO.atualizar(classe);
	}

	public void deletar(final Cargo classe) {
		cargoDAO.apagar(classe);
	}

	public List<Cargo> buscarTodos() {
		return cargoDAO.buscarTodos();
	}

}
