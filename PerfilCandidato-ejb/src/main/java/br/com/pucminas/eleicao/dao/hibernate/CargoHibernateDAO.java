package br.com.pucminas.eleicao.dao.hibernate;

import br.com.pucminas.eleicao.dao.CargoDAO;
import br.com.pucminas.eleicao.model.Cargo;

public class CargoHibernateDAO extends GenericHibernateDAO<Cargo, Integer> implements CargoDAO{

	public CargoHibernateDAO() {
		super(Cargo.class);

	}
	
	

}
