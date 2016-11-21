package br.com.pucminas.eleicao.dao.hibernate;

import br.com.pucminas.eleicao.dao.MunicipioDAO;
import br.com.pucminas.eleicao.model.Municipio;
import br.com.pucminas.eleicao.model.MunicipioPK;

public class MunicipioHibernateDAO extends GenericHibernateDAO<Municipio, MunicipioPK> implements MunicipioDAO{

	public MunicipioHibernateDAO() {
		super(Municipio.class);

	}
	
	

}
