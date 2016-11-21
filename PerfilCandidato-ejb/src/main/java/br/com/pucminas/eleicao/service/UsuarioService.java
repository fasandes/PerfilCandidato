package br.com.pucminas.eleicao.service;

import java.util.List;

import javax.inject.Inject;

import br.com.pucminas.eleicao.dao.UsuarioDAO;
import br.com.pucminas.eleicao.model.Usuario;

public class UsuarioService {
	
	@Inject
	private UsuarioDAO usuarioDAO;
	
	public Usuario salvar(final Usuario c) {
		return usuarioDAO.salvar(c);
	}

	public Usuario buscarPorId(final Integer id) {
		return usuarioDAO.buscarPorId(id);
	}

	public Usuario atualizar(final Usuario classe) {
		return usuarioDAO.atualizar(classe);
	}
	
	public void deletar(final Usuario classe) {
		usuarioDAO.apagar(classe);
	}
	
	public List<Usuario> buscarTodos() {
		return usuarioDAO.buscarTodos();
	}
	
	public Usuario buscarPorLogin(String login) {
		return usuarioDAO.buscarPorLogin(login);
		
	}

}
