package br.com.pucminas.eleicao.dao.hibernate;

import br.com.pucminas.eleicao.dao.OcupacaoDAO;
import br.com.pucminas.eleicao.model.Ocupacao;

public class OcupacaoHibernateDAO extends GenericHibernateDAO<Ocupacao, Integer> implements OcupacaoDAO{

	public OcupacaoHibernateDAO() {
		super(Ocupacao.class);

	}
	
	

}
