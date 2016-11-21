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
@Table(name = "ocupacao")
@NamedQueries({
    @NamedQuery(name = "Ocupacao.findAll", query = "SELECT o FROM Ocupacao o")})
public class Ocupacao implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CODIGO_OCUPACAO")
    private Integer codigoOcupacao;
    @Column(name = "DESCRICAO_OCUPACAO")
    private String descricaoOcupacao;

    public Ocupacao() {
    }

    public Ocupacao(Integer codigoOcupacao) {
        this.codigoOcupacao = codigoOcupacao;
    }

    public Integer getCodigoOcupacao() {
        return codigoOcupacao;
    }

    public void setCodigoOcupacao(Integer codigoOcupacao) {
        this.codigoOcupacao = codigoOcupacao;
    }

    public String getDescricaoOcupacao() {
        return descricaoOcupacao;
    }

    public void setDescricaoOcupacao(String descricaoOcupacao) {
        this.descricaoOcupacao = descricaoOcupacao;
    }


    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoOcupacao != null ? codigoOcupacao.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ocupacao)) {
            return false;
        }
        Ocupacao other = (Ocupacao) object;
        if ((this.codigoOcupacao == null && other.codigoOcupacao != null) || (this.codigoOcupacao != null && !this.codigoOcupacao.equals(other.codigoOcupacao))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.pucminas.eleicao.Ocupacao[ codigoOcupacao=" + codigoOcupacao + " ]";
    }
    
}
