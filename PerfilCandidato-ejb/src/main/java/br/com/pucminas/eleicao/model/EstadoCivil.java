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
@Table(name = "estado_civil")
@NamedQueries({
    @NamedQuery(name = "EstadoCivil.findAll", query = "SELECT e FROM EstadoCivil e")})
public class EstadoCivil implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CODIGO_ESTADO_CIVIL")
    private Integer codigoEstadoCivil;
    @Column(name = "DESCRICAO_ESTADO_CIVIL")
    private String descricaoEstadoCivil;

    public EstadoCivil() {
    }

    public EstadoCivil(Integer codigoEstadoCivil) {
        this.codigoEstadoCivil = codigoEstadoCivil;
    }

    public Integer getCodigoEstadoCivil() {
        return codigoEstadoCivil;
    }

    public void setCodigoEstadoCivil(Integer codigoEstadoCivil) {
        this.codigoEstadoCivil = codigoEstadoCivil;
    }

    public String getDescricaoEstadoCivil() {
        return descricaoEstadoCivil;
    }

    public void setDescricaoEstadoCivil(String descricaoEstadoCivil) {
        this.descricaoEstadoCivil = descricaoEstadoCivil;
    }


    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoEstadoCivil != null ? codigoEstadoCivil.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EstadoCivil)) {
            return false;
        }
        EstadoCivil other = (EstadoCivil) object;
        if ((this.codigoEstadoCivil == null && other.codigoEstadoCivil != null) || (this.codigoEstadoCivil != null && !this.codigoEstadoCivil.equals(other.codigoEstadoCivil))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.pucminas.eleicao.EstadoCivil[ codigoEstadoCivil=" + codigoEstadoCivil + " ]";
    }
    
}
