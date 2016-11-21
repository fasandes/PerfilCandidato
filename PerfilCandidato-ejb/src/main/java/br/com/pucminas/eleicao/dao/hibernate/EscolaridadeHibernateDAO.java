package br.com.pucminas.eleicao.dao.hibernate;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

import br.com.pucminas.eleicao.dao.EscolaridadeDAO;
import br.com.pucminas.eleicao.model.Escolaridade;

public class EscolaridadeHibernateDAO extends GenericHibernateDAO<Escolaridade, Integer> implements EscolaridadeDAO {

	public EscolaridadeHibernateDAO() {
		super(Escolaridade.class);

	}

	@Override
	public Escolaridade buscarPorDescricao(String descricao) {
		final Criteria criteria = getSessao().createCriteria(Escolaridade.class);

		criteria.add(Restrictions.eq("descricaoGrauInstrucao", descricao));

		return (Escolaridade) criteria.uniqueResult();
	}

}
