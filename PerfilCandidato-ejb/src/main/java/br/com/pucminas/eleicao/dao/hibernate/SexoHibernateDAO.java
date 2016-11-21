package br.com.pucminas.eleicao.dao.hibernate;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

import br.com.pucminas.eleicao.dao.SexoDAO;
import br.com.pucminas.eleicao.model.Sexo;

public class SexoHibernateDAO extends GenericHibernateDAO<Sexo, Integer> implements SexoDAO{

	public SexoHibernateDAO() {
		super(Sexo.class);

	}

	@Override
	public Sexo buscarPorDescricao(String descricao) {
		
		
		final Criteria criteria = getSessao().createCriteria(Sexo.class);
		
		criteria.add(Restrictions.eq("descricaoSexo", descricao));
		
		return (Sexo) criteria.uniqueResult();
		
	}
	
	

}
