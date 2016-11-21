package br.com.pucminas.eleicao.dao;

import br.com.pucminas.eleicao.model.Escolaridade;

public interface EscolaridadeDAO extends GenericDAO<Escolaridade, Integer> {

	Escolaridade buscarPorDescricao(String descricao);

}
