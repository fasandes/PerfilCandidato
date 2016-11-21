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
@Table(name = "cor_raca")
@NamedQueries({
    @NamedQuery(name = "CorRaca.findAll", query = "SELECT c FROM CorRaca c")})
public class CorRaca implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CODIGO_COR_RACA")
    private Integer codigoCorRaca;
    @Column(name = "DESCRICAO_COR_RACA")
    private String descricaoCorRaca;


    public CorRaca() {
    }

    public CorRaca(Integer codigoCorRaca) {
        this.codigoCorRaca = codigoCorRaca;
    }

    public Integer getCodigoCorRaca() {
        return codigoCorRaca;
    }

    public void setCodigoCorRaca(Integer codigoCorRaca) {
        this.codigoCorRaca = codigoCorRaca;
    }

    public String getDescricaoCorRaca() {
        return descricaoCorRaca;
    }

    public void setDescricaoCorRaca(String descricaoCorRaca) {
        this.descricaoCorRaca = descricaoCorRaca;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoCorRaca != null ? codigoCorRaca.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CorRaca)) {
            return false;
        }
        CorRaca other = (CorRaca) object;
        if ((this.codigoCorRaca == null && other.codigoCorRaca != null) || (this.codigoCorRaca != null && !this.codigoCorRaca.equals(other.codigoCorRaca))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.pucminas.eleicao.CorRaca[ codigoCorRaca=" + codigoCorRaca + " ]";
    }
    
}
