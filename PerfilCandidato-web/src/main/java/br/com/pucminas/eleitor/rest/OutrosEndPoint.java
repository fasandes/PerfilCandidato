package br.com.pucminas.eleitor.rest;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.pucminas.eleicao.model.Cargo;
import br.com.pucminas.eleicao.model.CorRaca;
import br.com.pucminas.eleicao.model.Escolaridade;
import br.com.pucminas.eleicao.model.EstadoCivil;
import br.com.pucminas.eleicao.model.FaixaEtaria;
import br.com.pucminas.eleicao.model.Municipio;
import br.com.pucminas.eleicao.model.Partido;
import br.com.pucminas.eleicao.model.Sexo;
import br.com.pucminas.eleicao.service.CargoService;
import br.com.pucminas.eleicao.service.CorRacaService;
import br.com.pucminas.eleicao.service.EscolaridadeService;
import br.com.pucminas.eleicao.service.EstadoCivilService;
import br.com.pucminas.eleicao.service.FaixaEtariaService;
import br.com.pucminas.eleicao.service.MunicipioService;
import br.com.pucminas.eleicao.service.PartidoService;
import br.com.pucminas.eleicao.service.SexoService;

@RequestScoped
@Path("/outros")
public class OutrosEndPoint {


	@Inject
	private FaixaEtariaService faixaEtariaService;

	@Inject
	private SexoService sexoService;
	
	@Inject
	private MunicipioService municipioService;
	
	@Inject
	private EstadoCivilService estadoCivilService;
	
	@Inject
	private EscolaridadeService escolaridadeService;
	
	@Inject
	private PartidoService partidoService;
	
	@Inject
	private CorRacaService corRacaService;
	
	@Inject
	private CargoService cargoService;
	

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/validaConexao")
	public Boolean validaConexao() {
		return true;
	}

	@GET
	@Path("/buscarMunicipios")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Municipio> buscarMunicipios() {
		return municipioService.buscarTodos();
	}

	@GET
	@Path("/buscarSexos")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Sexo> buscarSexo() {
		return sexoService.buscarTodos();
	}
	@GET
	@Path("/buscarEstadosCivis")
	@Produces(MediaType.APPLICATION_JSON)
	public List<EstadoCivil> buscarEstadosCivis() {
		return estadoCivilService.buscarTodos();
	}
	@GET
	@Path("/buscarEscolaridades")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Escolaridade> buscarEscolaridades() {
		return escolaridadeService.buscarTodos();
	}
	@GET
	@Path("/buscarPartidos")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Partido> buscarPartidos() {
		return partidoService.buscarTodos();
	}
	@GET
	@Path("/buscarCoresRacas")
	@Produces(MediaType.APPLICATION_JSON)
	public List<CorRaca> buscarCoresRacas() {
		return corRacaService.buscarTodos();
	}
	@GET
	@Path("/buscarCargos")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Cargo> buscarCargos() {
		return cargoService.buscarTodos();
	}
	@GET
	@Path("/buscarFaixaEtarias")
	@Produces(MediaType.APPLICATION_JSON)
	public List<FaixaEtaria> buscarFaixaEtarias() {
		return faixaEtariaService.buscarTodos();
	}
	
	

	

}
