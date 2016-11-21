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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "eleitor")
@NamedQueries({ @NamedQuery(name = "Eleitor.findAll", query = "SELECT e FROM Eleitor e") })
public class Eleitor implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Basic(optional = false)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "codigo")
	private Integer codigo;
	@Column(name = "NR_ZONA")
	private Integer nrZona;
	@Column(name = "QTD_ELEITORES_NO_PERFIL")
	private Integer qtdEleitoresNoPerfil;
	 @JoinColumns({
	        @JoinColumn(name = "municipio_COD_MUNICIPIO_TSE", referencedColumnName = "COD_MUNICIPIO_TSE"),
	        @JoinColumn(name = "municipio_MUNICIPIO", referencedColumnName = "MUNICIPIO")})
	    @ManyToOne(optional = false)
	 private Municipio municipio;	
	@JoinColumn(name = "faixa_etaria_descricao", referencedColumnName = "descricao")
	@ManyToOne(optional = false)
	private FaixaEtaria faixaEtariaCodigo;
	@JoinColumn(name = "sexo_CODIGO_SEXO", referencedColumnName = "CODIGO_SEXO")
	@ManyToOne(optional = false)
	private Sexo sexo;
	@JoinColumn(name = "escolaridade_COD_GRAU_INSTRUCAO", referencedColumnName = "COD_GRAU_INSTRUCAO")
	@ManyToOne(optional = false)
	private Escolaridade escolaridade;

	public Eleitor() {
	}

	public Eleitor(Integer codigo) {
		this.codigo = codigo;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Integer getNrZona() {
		return nrZona;
	}

	public void setNrZona(Integer nrZona) {
		this.nrZona = nrZona;
	}

	public Integer getQtdEleitoresNoPerfil() {
		return qtdEleitoresNoPerfil;
	}

	public void setQtdEleitoresNoPerfil(Integer qtdEleitoresNoPerfil) {
		this.qtdEleitoresNoPerfil = qtdEleitoresNoPerfil;
	}

	public FaixaEtaria getFaixaEtariaCodigo() {
		return faixaEtariaCodigo;
	}

	public void setFaixaEtariaCodigo(FaixaEtaria faixaEtariaCodigo) {
		this.faixaEtariaCodigo = faixaEtariaCodigo;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public Escolaridade getEscolaridade() {
		return escolaridade;
	}

	public void setEscolaridade(Escolaridade escolaridade) {
		this.escolaridade = escolaridade;
	}
	
	

	public Municipio getMunicipio() {
		return municipio;
	}

	public void setMunicipio(Municipio municipio) {
		this.municipio = municipio;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (codigo != null ? codigo.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are
		// not set
		if (!(object instanceof Eleitor)) {
			return false;
		}
		Eleitor other = (Eleitor) object;
		if ((this.codigo == null && other.codigo != null)
				|| (this.codigo != null && !this.codigo.equals(other.codigo))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "br.com.pucminas.eleicao.Eleitor[ codigo=" + codigo + " ]";
	}

}
