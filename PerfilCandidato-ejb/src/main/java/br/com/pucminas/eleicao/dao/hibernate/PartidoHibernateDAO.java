package br.com.pucminas.eleicao.dao.hibernate;

import br.com.pucminas.eleicao.dao.PartidoDAO;
import br.com.pucminas.eleicao.model.Partido;

public class PartidoHibernateDAO extends GenericHibernateDAO<Partido, Integer> implements PartidoDAO{

	public PartidoHibernateDAO() {
		super(Partido.class);

	}
	
	

}
