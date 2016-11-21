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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Fabricio
 */
@Entity
@Table(name = "partido")
@NamedQueries({ @NamedQuery(name = "Partido.findAll", query = "SELECT p FROM Partido p") })
public class Partido implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Basic(optional = false)
	@Column(name = "NUMERO_PARTIDO")
	private Integer numeroPartido;
	@Column(name = "SIGLA_PARTIDO")
	private String siglaPartido;
	@Column(name = "NOME_PARTIDO")
	private String nomePartido;

	public Partido() {
	}

	public Partido(Integer numeroPartido) {
		this.numeroPartido = numeroPartido;
	}

	public Integer getNumeroPartido() {
		return numeroPartido;
	}

	public void setNumeroPartido(Integer numeroPartido) {
		this.numeroPartido = numeroPartido;
	}

	public String getSiglaPartido() {
		return siglaPartido;
	}

	public void setSiglaPartido(String siglaPartido) {
		this.siglaPartido = siglaPartido;
	}

	public String getNomePartido() {
		return nomePartido;
	}

	public void setNomePartido(String nomePartido) {
		this.nomePartido = nomePartido;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (numeroPartido != null ? numeroPartido.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are
		// not set
		if (!(object instanceof Partido)) {
			return false;
		}
		Partido other = (Partido) object;
		if ((this.numeroPartido == null && other.numeroPartido != null)
				|| (this.numeroPartido != null && !this.numeroPartido.equals(other.numeroPartido))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "br.com.pucminas.eleicao.Partido[ numeroPartido=" + numeroPartido + " ]";
	}

}
