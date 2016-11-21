package br.com.pucminas.eleicao.dao.hibernate;

import javax.inject.Named;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

import br.com.pucminas.eleicao.dao.UsuarioDAO;
import br.com.pucminas.eleicao.model.Usuario;

@Named("usuarioDAO")
public class UsuarioHibernateDAO extends GenericHibernateDAO<Usuario, Integer> implements UsuarioDAO{

	public UsuarioHibernateDAO() {
		super(Usuario.class);

	}

	@Override
	public Usuario buscarPorLogin(String login) {
		Criteria c = getSessao().createCriteria(Usuario.class);
		
		c.add(Restrictions.eq("login", login));
		
		return (Usuario) c.uniqueResult();
	}
	
	

}
