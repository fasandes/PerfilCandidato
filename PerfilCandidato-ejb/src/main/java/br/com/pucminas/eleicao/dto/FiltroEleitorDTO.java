package br.com.pucminas.eleicao.dto;

import br.com.pucminas.eleicao.model.Eleitor;

public class FiltroEleitorDTO extends Eleitor {
	
	private Integer qtdEleitoresNoPerfilMaiorQue;
	private Integer qtdEleitoresNoPerfilMenorQue;
	
	private Integer qtdEleitoresNoPerfilMaiorOuIgualQue;
	private Integer qtdEleitoresNoPerfilMenorOuIgualQue;


	public FiltroEleitorDTO() {
		super();
	}

	public Integer getQtdEleitoresNoPerfilMaiorQue() {
		return qtdEleitoresNoPerfilMaiorQue;
	}

	public void setQtdEleitoresNoPerfilMaiorQue(Integer qtdEleitoresNoPerfilMaiorQue) {
		this.qtdEleitoresNoPerfilMaiorQue = qtdEleitoresNoPerfilMaiorQue;
	}

	public Integer getQtdEleitoresNoPerfilMenorQue() {
		return qtdEleitoresNoPerfilMenorQue;
	}

	public void setQtdEleitoresNoPerfilMenorQue(Integer qtdEleitoresNoPerfilMenorQue) {
		this.qtdEleitoresNoPerfilMenorQue = qtdEleitoresNoPerfilMenorQue;
	}

	public Integer getQtdEleitoresNoPerfilMaiorOuIgualQue() {
		return qtdEleitoresNoPerfilMaiorOuIgualQue;
	}

	public void setQtdEleitoresNoPerfilMaiorOuIgualQue(Integer qtdEleitoresNoPerfilMaiorOuIgualQue) {
		this.qtdEleitoresNoPerfilMaiorOuIgualQue = qtdEleitoresNoPerfilMaiorOuIgualQue;
	}

	public Integer getQtdEleitoresNoPerfilMenorOuIgualQue() {
		return qtdEleitoresNoPerfilMenorOuIgualQue;
	}

	public void setQtdEleitoresNoPerfilMenorOuIgualQue(Integer qtdEleitoresNoPerfilMenorOuIgualQue) {
		this.qtdEleitoresNoPerfilMenorOuIgualQue = qtdEleitoresNoPerfilMenorOuIgualQue;
	}

	
	

}
