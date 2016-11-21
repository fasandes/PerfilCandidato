/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pucminas.eleicao.model;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Fabricio
 */
@Embeddable
public class MunicipioPK implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Basic(optional = false)
    @Column(name = "COD_MUNICIPIO_TSE")
    private int codMunicipioTse;
    @Basic(optional = false)
    @Column(name = "MUNICIPIO")
    private String municipio;

    public MunicipioPK() {
    }

    public MunicipioPK(int codMunicipioTse, String municipio) {
        this.codMunicipioTse = codMunicipioTse;
        this.municipio = municipio;
    }

    public int getCodMunicipioTse() {
        return codMunicipioTse;
    }

    public void setCodMunicipioTse(int codMunicipioTse) {
        this.codMunicipioTse = codMunicipioTse;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) codMunicipioTse;
        hash += (municipio != null ? municipio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MunicipioPK)) {
            return false;
        }
        MunicipioPK other = (MunicipioPK) object;
        if (this.codMunicipioTse != other.codMunicipioTse) {
            return false;
        }
        if ((this.municipio == null && other.municipio != null) || (this.municipio != null && !this.municipio.equals(other.municipio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.pucminas.eleicao.MunicipioPK[ codMunicipioTse=" + codMunicipioTse + ", municipio=" + municipio + " ]";
    }
    
}
