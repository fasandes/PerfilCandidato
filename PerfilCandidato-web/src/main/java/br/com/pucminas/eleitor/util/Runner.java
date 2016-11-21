//package br.com.pucminas.eleitor.util;
//
//import java.beans.IntrospectionException;
//import java.beans.Introspector;
//import java.beans.PropertyDescriptor;
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//import javax.inject.Inject;
//import javax.inject.Named;
//
//import br.com.pucminas.eleicao.model.Candidato;
//import br.com.pucminas.eleicao.model.CorRaca;
//import br.com.pucminas.eleicao.model.Eleitor;
//import br.com.pucminas.eleicao.model.Escolaridade;
//import br.com.pucminas.eleicao.model.EstadoCivil;
//import br.com.pucminas.eleicao.model.FaixaEtaria;
//import br.com.pucminas.eleicao.model.Municipio;
//import br.com.pucminas.eleicao.model.MunicipioPK;
//import br.com.pucminas.eleicao.model.Ocupacao;
//import br.com.pucminas.eleicao.model.Partido;
//import br.com.pucminas.eleicao.model.Sexo;
//import br.com.pucminas.eleicao.service.CandidatoService;
//import br.com.pucminas.eleicao.service.CorRacaService;
//import br.com.pucminas.eleicao.service.EleitorService;
//import br.com.pucminas.eleicao.service.EscolaridadeService;
//import br.com.pucminas.eleicao.service.EstadoCivilService;
//import br.com.pucminas.eleicao.service.FaixaEtariaService;
//import br.com.pucminas.eleicao.service.MunicipioService;
//import br.com.pucminas.eleicao.service.OcupacaoService;
//import br.com.pucminas.eleicao.service.PartidoService;
//import br.com.pucminas.eleicao.service.SexoService;
//
//@Named
//public class Runner {
//
//	@Inject
//	private SexoService sexoService;
//
//	@Inject
//	private MunicipioService municipioService;
//
//	@Inject
//	private FaixaEtariaService faixaEtariaService;
//
//	@Inject
//	private EscolaridadeService escolaridadeService;
//
//	@Inject
//	private CorRacaService corRacaService;
//
//	@Inject
//	private EleitorService eleitorService;
//
//	@Inject
//	private CandidatoService candidatoService;
//
//	@Inject
//	private PartidoService partidoService;
//
//	@Inject
//	private EstadoCivilService civilService;
//
//	@Inject
//	private OcupacaoService ocupacaoService;
//	
//	public PartidoService getPartidoService() {
//		return this.partidoService;
//	}
//
//	private Municipio retornaMunicipioEleitor(String[] dados) {
//		String nome = dados[2];
//		String codigo = dados[3];
//
//		final Municipio municipio = new Municipio();
//		final MunicipioPK municipioPK = new MunicipioPK();
//		municipioPK.setCodMunicipioTse(Integer.parseInt(codigo));
//		municipioPK.setMunicipio(nome);
//		municipio.setMunicipioPK(municipioPK);
//		return municipioService.atualizar(municipio);
//	}
//
//	private Sexo retornaSexoEleitor(String[] dados) {
//
//		String descricao = dados[5];
//
//		Sexo sexo = this.sexoService.buscarPorDescricao(descricao);
//
//		if (sexo != null) {
//			return sexo;
//		} else {
//			sexo = new Sexo();
//			sexo.setDescricaoSexo(descricao);
//			return this.sexoService.atualizar(sexo);
//
//		}
//
//	}
//
//	private FaixaEtaria retornaFaixaEtariaEleitor(String[] dados) {
//		String descricao = dados[6];
//
//		FaixaEtaria faixaEtaria = this.faixaEtariaService.buscarPorDescricao(descricao);
//
//		if (faixaEtaria != null) {
//			return faixaEtaria;
//		} else {
//			faixaEtaria = new FaixaEtaria();
//			faixaEtaria.setDescricao(descricao);
//
//			return this.faixaEtariaService.atualizar(faixaEtaria);
//		}
//
//	}
//
//	private Escolaridade retornaEscolaridadeEleitor(String[] dados) {
//		String descricao = dados[7];
//
//		Escolaridade escolaridade = escolaridadeService.buscarPorDescricao(descricao);
//
//		if (escolaridade != null) {
//			return escolaridade;
//		} else {
//
//			escolaridade = new Escolaridade();
//			escolaridade.setDescricaoGrauInstrucao(descricao);
//
//			return this.escolaridadeService.atualizar(escolaridade);
//		}
//
//	}
//
//	private CorRaca retornaCorRacaCandidato(String[] dados) {
//		final String codigo = dados[35];
//		final String descricao = dados[36];
//
//		final CorRaca corRaca = new CorRaca();
//
//		corRaca.setCodigoCorRaca(Integer.parseInt(codigo));
//		corRaca.setDescricaoCorRaca(descricao);
//
//		return corRacaService.atualizar(corRaca);
//	}
//
//	private Partido retornaPartido(String[] dados) {
//		final String numeroPartido = dados[17];
//		final String sigla = dados[18];
//		final String nome = dados[19];
//
//		final Partido partido = new Partido();
//		partido.setNumeroPartido(Integer.parseInt(numeroPartido));
//		partido.setSiglaPartido(sigla);
//		partido.setNomePartido(nome);
//
//		return partidoService.atualizar(partido);
//	}
//
//	private EstadoCivil retornaEstadoCivil(String[] dados) {
//		final String codigo = dados[33];
//		final String descricao = dados[34];
//
//		final EstadoCivil estadoCivil = new EstadoCivil();
//		estadoCivil.setCodigoEstadoCivil(Integer.parseInt(codigo));
//		estadoCivil.setDescricaoEstadoCivil(descricao);
//
//		return civilService.atualizar(estadoCivil);
//	}
//
//	private Sexo retornaSexo(String[] dados) {
//		final String codigo = dados[29];
//		final String descricao = dados[30];
//
//		final Sexo sexo = new Sexo();
//		sexo.setCodigoSexo(Integer.parseInt(codigo));
//		sexo.setDescricaoSexo(descricao);
//
//		return sexoService.atualizar(sexo);
//	}
//
//	private Escolaridade retornaEscolaridade(String[] dados) {
//		final String codigo = dados[31];
//		final String descricao = dados[32];
//
//		final Escolaridade escolaridade = new Escolaridade();
//		escolaridade.setCodGrauInstrucao(Integer.parseInt(codigo));
//		escolaridade.setDescricaoGrauInstrucao(descricao);
//		return escolaridadeService.atualizar(escolaridade);
//	}
//
//	private Ocupacao retornaOcupacao(String[] dados) {
//		final String codigo = dados[24];
//		final String descricao = dados[25];
//
//		final Ocupacao ocupacao = new Ocupacao();
//		ocupacao.setCodigoOcupacao(Integer.parseInt(codigo));
//		ocupacao.setDescricaoOcupacao(descricao);
//		return ocupacaoService.atualizar(ocupacao);
//	}
//
//	private void processaEleitor(final String[] dados) {
//		final Eleitor eleitor = new Eleitor();
//
//		final FaixaEtaria faixaEtaria = retornaFaixaEtariaEleitor(dados);
//		final Municipio municipio = retornaMunicipioEleitor(dados);
//		final Sexo sexo = retornaSexoEleitor(dados);
//		final Escolaridade escolaridade = retornaEscolaridadeEleitor(dados);
//		final String nr_zona = dados[4];
//		final String qtdEleitores = dados[8];
//
//		eleitor.setEscolaridade(escolaridade);
//		eleitor.setFaixaEtariaCodigo(faixaEtaria);
//		eleitor.setSexo(sexo);
//		eleitor.setNrZona(Integer.parseInt(nr_zona));
//		eleitor.setQtdEleitoresNoPerfil(Integer.parseInt(qtdEleitores));
//
//		this.eleitorService.atualizar(eleitor);
//
//	}
//
//	private void processaCandidato(final String[] dados) {
//		final Candidato candidato = new Candidato();
//
//		final CorRaca corRaca = retornaCorRacaCandidato(dados);
//		final Partido partido = retornaPartido(dados);
//		final EstadoCivil estadoCivil = retornaEstadoCivil(dados);
//		final Sexo sexo = retornaSexo(dados);
//		final Escolaridade escolaridade = retornaEscolaridade(dados);
//		final Ocupacao ocupacao = retornaOcupacao(dados);
//
//		final String nomeCandidato = dados[10];
//		final String sequencial = dados[11];
//		final String numeroCandidato = dados[12];
//		final String cpfCandidato = dados[13];
//		final String nomeUrnaCandidato = dados[14];
//
//		candidato.setCorracaCODIGOCORRACA(corRaca);
//		candidato.setCpfCandidato(cpfCandidato);
//		candidato.setEscolaridadeCODGRAUINSTRUCAO(escolaridade);
//		candidato.setEstadocivilCODIGOESTADOCIVIL(estadoCivil);
//		candidato.setNomeCandidato(nomeCandidato);
//		candidato.setNomeUrnaCandidato(nomeUrnaCandidato);
//		candidato.setNumeroCandidato(Integer.parseInt(numeroCandidato));
//		candidato.setOcupacaoCODIGOOCUPACAO(ocupacao);
//		candidato.setPartidoNUMEROPARTIDO(partido);
//		candidato.setSexoCODIGOSEXO(sexo);
//		candidato.setSequencialCandidato(sequencial);
//
//		candidatoService.atualizar(candidato);
//
//	}
//
//	public void processaCandidato() {
//
//		BufferedReader reader;
//		try {
//
//			reader = new BufferedReader(
//					new InputStreamReader(getClass().getClassLoader().getResourceAsStream("/candidatos.txt"), "UTF-8"));
//
//			String linha = null;
//
//			while ((linha = reader.readLine()) != null) {
//				linha = linha.replace("\"", "");
//				final String[] dados = linha.split(";");
//				this.processaCandidato(dados);
//			}
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//
//	}
//
//	public void processaEleitor() {
//
//		BufferedReader reader;
//		try {
//
//			reader = new BufferedReader(
//					new InputStreamReader(getClass().getClassLoader().getResourceAsStream("/eleitor.txt"), "UTF-8"));
//
//			String linha = null;
//
//			while ((linha = reader.readLine()) != null) {
//				linha = linha.replace("\"", "");
//				final String[] dados = linha.split(";");
//				if (dados[2].equals("BELO HORIZONTE")) {
//					this.processaEleitor(dados);
//				}
//			}
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//
//	}
//	
//
//
//}
