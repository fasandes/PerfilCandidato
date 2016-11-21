package br.com.pucminas.eleicao.dao;

import java.util.List;

import br.com.pucminas.eleicao.dto.FiltroEleitorDTO;
import br.com.pucminas.eleicao.model.Eleitor;

public interface EleitorDAO extends GenericDAO<Eleitor, Integer> {

	List<Eleitor> buscarComFiltro(FiltroEleitorDTO filtro);

}
