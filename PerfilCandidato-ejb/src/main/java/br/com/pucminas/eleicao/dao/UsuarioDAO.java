package br.com.pucminas.eleicao.dao;

import br.com.pucminas.eleicao.model.Usuario;

public interface UsuarioDAO extends GenericDAO<Usuario, Integer> {

	Usuario buscarPorLogin(String login);

}
