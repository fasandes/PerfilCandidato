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
@Table(name = "escolaridade")
@NamedQueries({
    @NamedQuery(name = "Escolaridade.findAll", query = "SELECT e FROM Escolaridade e")})
public class Escolaridade implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "COD_GRAU_INSTRUCAO")
    private Integer codGrauInstrucao;
    @Column(name = "DESCRICAO_GRAU_INSTRUCAO")
    private String descricaoGrauInstrucao;

    public Escolaridade() {
    }

    public Escolaridade(Integer codGrauInstrucao) {
        this.codGrauInstrucao = codGrauInstrucao;
    }

    public Integer getCodGrauInstrucao() {
        return codGrauInstrucao;
    }

    public void setCodGrauInstrucao(Integer codGrauInstrucao) {
        this.codGrauInstrucao = codGrauInstrucao;
    }

    public String getDescricaoGrauInstrucao() {
        return descricaoGrauInstrucao;
    }

    public void setDescricaoGrauInstrucao(String descricaoGrauInstrucao) {
        this.descricaoGrauInstrucao = descricaoGrauInstrucao;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codGrauInstrucao != null ? codGrauInstrucao.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Escolaridade)) {
            return false;
        }
        Escolaridade other = (Escolaridade) object;
        if ((this.codGrauInstrucao == null && other.codGrauInstrucao != null) || (this.codGrauInstrucao != null && !this.codGrauInstrucao.equals(other.codGrauInstrucao))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.pucminas.eleicao.Escolaridade[ codGrauInstrucao=" + codGrauInstrucao + " ]";
    }
    
}
