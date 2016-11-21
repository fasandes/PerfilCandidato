/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pucminas.eleicao.model;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
/**
 *
 * @author Fabricio
 */
@Entity
@Table(name = "candidato")
@NamedQueries({ @NamedQuery(name = "Candidato.findAll", query = "SELECT c FROM Candidato c") })
public class Candidato implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Basic(optional = false)
	@Column(name = "SEQUENCIAL_CANDIDATO")
	private String sequencialCandidato;
	@Column(name = "NOME_CANDIDATO")
	private String nomeCandidato;
	@Column(name = "NUMERO_CANDIDATO")
	private Integer numeroCandidato;
	@Column(name = "CPF_CANDIDATO")
	private String cpfCandidato;
	@Column(name = "NOME_URNA_CANDIDATO")
	private String nomeUrnaCandidato;
	@JoinColumn(name = "cor_raca_CODIGO_COR_RACA", referencedColumnName = "CODIGO_COR_RACA")
	@ManyToOne(optional = false)
	private CorRaca corracaCODIGOCORRACA;
	@JoinColumn(name = "partido_NUMERO_PARTIDO", referencedColumnName = "NUMERO_PARTIDO")
	@ManyToOne(optional = false)
	private Partido partidoNUMEROPARTIDO;
	@JoinColumn(name = "estado_civil_CODIGO_ESTADO_CIVIL", referencedColumnName = "CODIGO_ESTADO_CIVIL")
	@ManyToOne(optional = false)
	private EstadoCivil estadocivilCODIGOESTADOCIVIL;
	@JoinColumn(name = "sexo_CODIGO_SEXO", referencedColumnName = "CODIGO_SEXO")
	@ManyToOne(optional = false)
	private Sexo sexoCODIGOSEXO;
	@JoinColumn(name = "escolaridade_COD_GRAU_INSTRUCAO", referencedColumnName = "COD_GRAU_INSTRUCAO")
	@ManyToOne(optional = false)
	private Escolaridade escolaridadeCODGRAUINSTRUCAO;
	@JoinColumn(name = "ocupacao_CODIGO_OCUPACAO", referencedColumnName = "CODIGO_OCUPACAO")
	@ManyToOne(optional = false)
	private Ocupacao ocupacaoCODIGOOCUPACAO;
	@JoinColumns({ @JoinColumn(name = "municipio_COD_MUNICIPIO_TSE", referencedColumnName = "COD_MUNICIPIO_TSE"),
			@JoinColumn(name = "municipio_MUNICIPIO", referencedColumnName = "MUNICIPIO") })
	@ManyToOne(optional = false)
	private Municipio municipio;
	@JoinColumn(name = "cargo_CODIGO_CARGO", referencedColumnName = "CODIGO_CARGO")
	@ManyToOne(optional = false)
	private Cargo cargoCODIGOCARGO;

	public Candidato() {
	}

	public Candidato(String sequencialCandidato) {
		this.sequencialCandidato = sequencialCandidato;
	}

	public String getSequencialCandidato() {
		return sequencialCandidato;
	}

	public void setSequencialCandidato(String sequencialCandidato) {
		this.sequencialCandidato = sequencialCandidato;
	}

	public String getNomeCandidato() {
		return nomeCandidato;
	}

	public void setNomeCandidato(String nomeCandidato) {
		this.nomeCandidato = nomeCandidato;
	}

	public Integer getNumeroCandidato() {
		return numeroCandidato;
	}

	public void setNumeroCandidato(Integer numeroCandidato) {
		this.numeroCandidato = numeroCandidato;
	}

	public String getCpfCandidato() {
		return cpfCandidato;
	}

	public void setCpfCandidato(String cpfCandidato) {
		this.cpfCandidato = cpfCandidato;
	}

	public String getNomeUrnaCandidato() {
		return nomeUrnaCandidato;
	}

	public void setNomeUrnaCandidato(String nomeUrnaCandidato) {
		this.nomeUrnaCandidato = nomeUrnaCandidato;
	}

	public CorRaca getCorracaCODIGOCORRACA() {
		return corracaCODIGOCORRACA;
	}

	public void setCorracaCODIGOCORRACA(CorRaca corracaCODIGOCORRACA) {
		this.corracaCODIGOCORRACA = corracaCODIGOCORRACA;
	}

	public Partido getPartidoNUMEROPARTIDO() {
		return partidoNUMEROPARTIDO;
	}

	public void setPartidoNUMEROPARTIDO(Partido partidoNUMEROPARTIDO) {
		this.partidoNUMEROPARTIDO = partidoNUMEROPARTIDO;
	}

	public EstadoCivil getEstadocivilCODIGOESTADOCIVIL() {
		return estadocivilCODIGOESTADOCIVIL;
	}

	public void setEstadocivilCODIGOESTADOCIVIL(EstadoCivil estadocivilCODIGOESTADOCIVIL) {
		this.estadocivilCODIGOESTADOCIVIL = estadocivilCODIGOESTADOCIVIL;
	}

	public Sexo getSexoCODIGOSEXO() {
		return sexoCODIGOSEXO;
	}

	public void setSexoCODIGOSEXO(Sexo sexoCODIGOSEXO) {
		this.sexoCODIGOSEXO = sexoCODIGOSEXO;
	}

	public Escolaridade getEscolaridadeCODGRAUINSTRUCAO() {
		return escolaridadeCODGRAUINSTRUCAO;
	}

	public void setEscolaridadeCODGRAUINSTRUCAO(Escolaridade escolaridadeCODGRAUINSTRUCAO) {
		this.escolaridadeCODGRAUINSTRUCAO = escolaridadeCODGRAUINSTRUCAO;
	}

	public Ocupacao getOcupacaoCODIGOOCUPACAO() {
		return ocupacaoCODIGOOCUPACAO;
	}

	public void setOcupacaoCODIGOOCUPACAO(Ocupacao ocupacaoCODIGOOCUPACAO) {
		this.ocupacaoCODIGOOCUPACAO = ocupacaoCODIGOOCUPACAO;
	}
	
	

	public Municipio getMunicipio() {
		return municipio;
	}

	public void setMunicipio(Municipio municipio) {
		this.municipio = municipio;
	}

	public Cargo getCargoCODIGOCARGO() {
		return cargoCODIGOCARGO;
	}

	public void setCargoCODIGOCARGO(Cargo cargoCODIGOCARGO) {
		this.cargoCODIGOCARGO = cargoCODIGOCARGO;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (sequencialCandidato != null ? sequencialCandidato.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are
		// not set
		if (!(object instanceof Candidato)) {
			return false;
		}
		Candidato other = (Candidato) object;
		if ((this.sequencialCandidato == null && other.sequencialCandidato != null)
				|| (this.sequencialCandidato != null && !this.sequencialCandidato.equals(other.sequencialCandidato))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "br.com.pucminas.eleicao.Candidato[ sequencialCandidato=" + sequencialCandidato + " ]";
	}

}
