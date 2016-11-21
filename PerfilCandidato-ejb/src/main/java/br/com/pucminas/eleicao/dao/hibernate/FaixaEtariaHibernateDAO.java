package br.com.pucminas.eleicao.dao.hibernate;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

import br.com.pucminas.eleicao.dao.FaixaEtariaDAO;
import br.com.pucminas.eleicao.model.FaixaEtaria;

public class FaixaEtariaHibernateDAO extends GenericHibernateDAO<FaixaEtaria, String> implements FaixaEtariaDAO{

	public FaixaEtariaHibernateDAO() {
		super(FaixaEtaria.class);

	}

	@Override
	public FaixaEtaria buscarPorDescricao(String descricao) {
	final Criteria criteria = getSessao().createCriteria(FaixaEtaria.class);
		
		criteria.add(Restrictions.eq("descricao", descricao));
		
		return (FaixaEtaria) criteria.uniqueResult();
	}
	
	

}
