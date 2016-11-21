package br.com.pucminas.eleitor.rest;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.pucminas.eleicao.model.Usuario;
import br.com.pucminas.eleicao.service.UsuarioService;

@RequestScoped
@Path("/usuario")
public class UsuarioEndPoint {

	@Inject
	private UsuarioService usuarioService;
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/validaConexao")
	public Boolean validaConexao() {
		return true;
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Usuario buscaUsuario(Integer id) {
		return usuarioService.buscarPorId(id);
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Usuario buscaUsuarioPorLogin(String login) {
		return usuarioService.buscarPorLogin(login);
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Usuario> buscaUsuarios() {
		return usuarioService.buscarTodos();
	}
	
	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	public Usuario salvarUsuario(Usuario usuario) {
		return usuarioService.atualizar(usuario);
		
	}

}
