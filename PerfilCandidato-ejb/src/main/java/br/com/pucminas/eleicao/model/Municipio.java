/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pucminas.eleicao.model;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Fabricio
 */
@Entity
@Table(name = "municipio")
@NamedQueries({ @NamedQuery(name = "Municipio.findAll", query = "SELECT m FROM Municipio m"),
		@NamedQuery(name = "Municipio.findByCodMunicipioTse", query = "SELECT m FROM Municipio m WHERE m.municipioPK.codMunicipioTse = :codMunicipioTse"),
		@NamedQuery(name = "Municipio.findByMunicipio", query = "SELECT m FROM Municipio m WHERE m.municipioPK.municipio = :municipio") })
public class Municipio implements Serializable {
	private static final long serialVersionUID = 1L;
	@EmbeddedId
	protected MunicipioPK municipioPK;

	public Municipio() {
	}

	public Municipio(MunicipioPK municipioPK) {
		this.municipioPK = municipioPK;
	}

	public Municipio(int codMunicipioTse, String municipio) {
		this.municipioPK = new MunicipioPK(codMunicipioTse, municipio);
	}

	public MunicipioPK getMunicipioPK() {
		return municipioPK;
	}

	public void setMunicipioPK(MunicipioPK municipioPK) {
		this.municipioPK = municipioPK;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (municipioPK != null ? municipioPK.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are
		// not set
		if (!(object instanceof Municipio)) {
			return false;
		}
		Municipio other = (Municipio) object;
		if ((this.municipioPK == null && other.municipioPK != null)
				|| (this.municipioPK != null && !this.municipioPK.equals(other.municipioPK))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "br.com.pucminas.eleicao.Municipio[ municipioPK=" + municipioPK + " ]";
	}

}
