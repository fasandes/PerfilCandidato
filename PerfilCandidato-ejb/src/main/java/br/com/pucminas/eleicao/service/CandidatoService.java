package br.com.pucminas.eleicao.service;

import java.util.List;

import javax.inject.Inject;

import br.com.pucminas.eleicao.dao.CandidatoDAO;
import br.com.pucminas.eleicao.dto.FiltroCandidatoDTO;
import br.com.pucminas.eleicao.model.Candidato;

public class CandidatoService {
	
	@Inject
	private CandidatoDAO candidatoDAO;
	
	public Candidato salvar(final Candidato c) {
		return candidatoDAO.salvar(c);
	}

	public Candidato buscarPorId(final Integer id) {
		return candidatoDAO.buscarPorId(id);
	}

	public Candidato atualizar(final Candidato classe) {
		return candidatoDAO.atualizar(classe);
	}
	
	public void deletar(final Candidato classe) {
		candidatoDAO.apagar(classe);
	}
	
	public List<Candidato> buscarTodos() {
		return candidatoDAO.buscarTodos();
	}

	public List<Candidato> buscarComFiltro(FiltroCandidatoDTO filtro) {
		return candidatoDAO.buscarComFiltro(filtro);
	}

}
