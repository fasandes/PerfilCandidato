package br.com.pucminas.eleicao.dao.hibernate;

import javax.inject.Named;

import br.com.pucminas.eleicao.dao.CorRacaDAO;
import br.com.pucminas.eleicao.model.CorRaca;

@Named("corRacaDAO")
public class CorRacaHibernateDAO extends GenericHibernateDAO<CorRaca, Integer> implements CorRacaDAO{

	public CorRacaHibernateDAO() {
		super(CorRaca.class);

	}
	
	

}
