package br.com.pucminas.eleicao.dao;

import br.com.pucminas.eleicao.model.Sexo;

public interface SexoDAO extends GenericDAO<Sexo, Integer> {

	Sexo buscarPorDescricao(String descricao);

}
