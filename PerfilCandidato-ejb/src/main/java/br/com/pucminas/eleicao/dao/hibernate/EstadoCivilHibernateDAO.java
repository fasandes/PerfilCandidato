package br.com.pucminas.eleicao.dao.hibernate;

import br.com.pucminas.eleicao.dao.EstadoCivilDAO;
import br.com.pucminas.eleicao.model.EstadoCivil;

public class EstadoCivilHibernateDAO extends GenericHibernateDAO<EstadoCivil, Integer> implements EstadoCivilDAO{

	public EstadoCivilHibernateDAO() {
		super(EstadoCivil.class);

	}
	
	

}
