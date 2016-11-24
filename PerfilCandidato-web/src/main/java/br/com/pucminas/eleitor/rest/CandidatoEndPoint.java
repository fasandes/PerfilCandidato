package br.com.pucminas.eleitor.rest;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.pucminas.eleicao.dto.FiltroCandidatoDTO;
import br.com.pucminas.eleicao.model.Candidato;
import br.com.pucminas.eleicao.service.CandidatoService;
import br.com.pucminas.eleicao.service.CargoService;
import br.com.pucminas.eleicao.service.CorRacaService;
import br.com.pucminas.eleicao.service.EscolaridadeService;

@RequestScoped
@Path("/candidato")
public class CandidatoEndPoint {
	
	
	@Inject
	private CandidatoService candidatoService;
	
	@Inject
	private CorRacaService corRacaService;
	
	@Inject
	private EscolaridadeService escolaridadeService;
	
	@Inject
	private CargoService cargoService;
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/validaConexao")
	public Boolean validaConexao() {
		return true;
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Candidato buscaCandidato(Integer id) {
		return candidatoService.buscarPorId(id);
	}
		
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Candidato> buscaCandidato() {
		return candidatoService.buscarTodos();
	}
	

	@POST
	@Path("/filtro")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public List<Candidato> buscarComFiltro(FiltroCandidatoDTO filtro) {
		return candidatoService.buscarComFiltro(filtro);
	}
	
	@GET
	@Path("/testeFiltro")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Candidato> testeFiltro() {
		
		final FiltroCandidatoDTO filtro = new FiltroCandidatoDTO();
		filtro.setCorracaCODIGOCORRACA(this.corRacaService.buscarPorId(2));
		filtro.setEscolaridadeCODGRAUINSTRUCAO(this.escolaridadeService.buscarPorId(8));
		filtro.setCargoCODIGOCARGO(this.cargoService.buscarPorId(11));
		return candidatoService.buscarComFiltro(filtro);
	}
	
	

}
