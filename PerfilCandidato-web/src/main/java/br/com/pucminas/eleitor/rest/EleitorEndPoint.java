package br.com.pucminas.eleitor.rest;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.pucminas.eleicao.dto.FiltroEleitorDTO;
import br.com.pucminas.eleicao.model.Eleitor;
import br.com.pucminas.eleicao.service.EleitorService;
import br.com.pucminas.eleicao.service.FaixaEtariaService;
import br.com.pucminas.eleicao.service.SexoService;

@RequestScoped
@Path("/eleitor")
public class EleitorEndPoint {

	@Inject
	private EleitorService eleitorService;

	@Inject
	private FaixaEtariaService faixaEtariaService;

	@Inject
	private SexoService sexoService;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/validaConexao")
	public Boolean validaConexao() {
		return true;
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Eleitor buscaEleitor(Integer id) {
		return eleitorService.buscarPorId(id);
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Eleitor> buscaEleitor() {
		return eleitorService.buscarTodos();
	}

	@GET
	@Path("/testeFiltro")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Eleitor> testeFiltro() {

		final FiltroEleitorDTO filtro = new FiltroEleitorDTO();
		filtro.setFaixaEtariaCodigo(this.faixaEtariaService.buscarPorId("16 ANOS"));
		filtro.setSexo(this.sexoService.buscarPorId(4));
		filtro.setQtdEleitoresNoPerfilMaiorQue(400);

		return eleitorService.buscarComFiltro(filtro);
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Eleitor> buscarComFiltro(FiltroEleitorDTO filtro) {
		return eleitorService.buscarComFiltro(filtro);
	}

}
