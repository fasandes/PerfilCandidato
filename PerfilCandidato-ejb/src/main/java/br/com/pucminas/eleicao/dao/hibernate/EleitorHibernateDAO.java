package br.com.pucminas.eleicao.dao.hibernate;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

import br.com.pucminas.eleicao.dao.EleitorDAO;
import br.com.pucminas.eleicao.dto.FiltroEleitorDTO;
import br.com.pucminas.eleicao.model.Eleitor;

public class EleitorHibernateDAO extends GenericHibernateDAO<Eleitor, Integer> implements EleitorDAO{

	public EleitorHibernateDAO() {
		super(Eleitor.class);

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Eleitor> buscarComFiltro(FiltroEleitorDTO filtro) {
		Criteria c = getSessao().createCriteria(Eleitor.class);
		
		if (filtro.getCodigo() != null) {
			c.add(Restrictions.eq("Codigo", filtro.getCodigo()));
		}
		if (filtro.getEscolaridade() != null) {
			c.add(Restrictions.eq("escolaridade", filtro.getEscolaridade()));
		}
		if (filtro.getFaixaEtariaCodigo() != null) {
			c.add(Restrictions.eq("faixaEtariaCodigo", filtro.getFaixaEtariaCodigo()));
		}
		if (filtro.getMunicipio() != null) {
			c.add(Restrictions.eq("municipio", filtro.getMunicipio()));
		}
		if (filtro.getNrZona() != null) {
			c.add(Restrictions.eq("nrZona", filtro.getNrZona()));
		}
		if (filtro.getQtdEleitoresNoPerfil() != null) {
			c.add(Restrictions.eq("qtdEleitoresNoPerfil", filtro.getQtdEleitoresNoPerfil()));
		}
		if (filtro.getSexo() != null) {
			c.add(Restrictions.eq("sexo", filtro.getSexo()));
		}
		if (filtro.getQtdEleitoresNoPerfilMaiorOuIgualQue() != null) {
			c.add(Restrictions.ge("qtdEleitoresNoPerfil", filtro.getQtdEleitoresNoPerfilMaiorOuIgualQue()));
		}
		if (filtro.getQtdEleitoresNoPerfilMaiorQue() != null) {
			c.add(Restrictions.gt("qtdEleitoresNoPerfil", filtro.getQtdEleitoresNoPerfilMaiorQue()));
		}
		if (filtro.getQtdEleitoresNoPerfilMenorOuIgualQue() != null) {
			c.add(Restrictions.le("qtdEleitoresNoPerfil", filtro.getQtdEleitoresNoPerfilMenorOuIgualQue()));
		}
		if (filtro.getQtdEleitoresNoPerfilMenorQue() != null) {
			c.add(Restrictions.lt("qtdEleitoresNoPerfil", filtro.getQtdEleitoresNoPerfilMenorQue()));
		}
		
		return c.list();


	}
	
	

}
