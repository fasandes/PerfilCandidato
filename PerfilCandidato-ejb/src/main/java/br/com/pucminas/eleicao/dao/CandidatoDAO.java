package br.com.pucminas.eleicao.dao;

import java.util.List;

import br.com.pucminas.eleicao.dto.FiltroCandidatoDTO;
import br.com.pucminas.eleicao.model.Candidato;

public interface CandidatoDAO extends GenericDAO<Candidato, Integer> {

	List<Candidato> buscarComFiltro(FiltroCandidatoDTO filtro);

}
