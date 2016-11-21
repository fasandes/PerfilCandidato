package br.com.pucminas.eleicao.dao;

import br.com.pucminas.eleicao.model.FaixaEtaria;

public interface FaixaEtariaDAO extends GenericDAO<FaixaEtaria, String> {

	FaixaEtaria buscarPorDescricao(String descricao);

}
