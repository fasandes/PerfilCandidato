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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Fabricio
 */
@Entity
@Table(name = "sexo")
@NamedQueries({
    @NamedQuery(name = "Sexo.findAll", query = "SELECT s FROM Sexo s")})
public class Sexo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "CODIGO_SEXO")
    private Integer codigoSexo;
    @Column(name = "DESCRICAO_SEXO")
    private String descricaoSexo;
 

    public Sexo() {
    }

    public Sexo(Integer codigoSexo) {
        this.codigoSexo = codigoSexo;
    }

    public Integer getCodigoSexo() {
        return codigoSexo;
    }

    public void setCodigoSexo(Integer codigoSexo) {
        this.codigoSexo = codigoSexo;
    }

    public String getDescricaoSexo() {
        return descricaoSexo;
    }

    public void setDescricaoSexo(String descricaoSexo) {
        this.descricaoSexo = descricaoSexo;
    }


    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoSexo != null ? codigoSexo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sexo)) {
            return false;
        }
        Sexo other = (Sexo) object;
        if ((this.codigoSexo == null && other.codigoSexo != null) || (this.codigoSexo != null && !this.codigoSexo.equals(other.codigoSexo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.pucminas.eleicao.Sexo[ codigoSexo=" + codigoSexo + " ]";
    }
    
}
