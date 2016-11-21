package br.com.pucminas.eleicao.dao.hibernate;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import br.com.pucminas.eleicao.dao.GenericDAO;

/**
 * 
 * @author gleimar
 */
public class GenericHibernateDAO<T, ID extends Serializable> implements GenericDAO<T, ID> {
	
	@PersistenceContext
	private EntityManager entityManager;

	// public SessionFactory getSessionFactory() {
	// return sessionFactory;
	// }

	// public void setSessionFactory(final SessionFactory sessionFactory) {
	// this.sessionFactory = sessionFactory;
	// }
		

	public Session getSession() {
		return (Session) entityManager.getDelegate();

	}

	@Override
	public Session getSessao() {
		// return getSessionFactory().openSession();
		Session currentSession = null;

		currentSession = getSession();

		if (currentSession == null) {
			throw new HibernateException("Não foi possivel obter uma sessao do hibernate");
		}
		return currentSession;
	}

	public GenericHibernateDAO() {
//		this.persistentClass = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	}
	
	public GenericHibernateDAO(Class<T> persistentClass) {
		this.persistentClass = persistentClass;
	}
	

	// Classe que será persistida.
	private Class<T> persistentClass;

	public Class<T> getPersistentClass() {
		return this.persistentClass;
	}

	@Override
	@Transactional
	public void apagar(final T entity) {
		try {
			this.getSessao().delete(entity);
		} catch (final HibernateException ex) {
			throw new RuntimeException(ex);
		}
	}
	
	@Override
	@Transactional
	public void apagarMerged(final T entity) {
		try {
			this.getSessao().delete(this.getSessao().merge(entity));
		} catch (final HibernateException ex) {
			throw new RuntimeException(ex);
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public T buscarPorId(final ID id) {
		try {
			return (T) this.getSessao().get(getPersistentClass(), id);
		} catch (final HibernateException ex) {
			throw new RuntimeException(ex);
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public T buscarPorCodigo(final ID id) {
		try {
			return (T) this.getSessao().get(getPersistentClass(), id);
		} catch (final HibernateException ex) {
			throw new RuntimeException(ex);
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public List<T> buscarTodos() {
		try {
			return this.getSessao().createCriteria(getPersistentClass()).list();
		} catch (final HibernateException ex) {

			throw new RuntimeException(ex);
		}
	}

	@Override
	@Transactional
	public T salvar(final T entity) {
		try {
			this.getSessao().save(entity);
			return entity;	
		} catch (final HibernateException ex) {

			throw new RuntimeException(ex);
		}
	}

	@SuppressWarnings("unchecked")
	@Transactional
	protected List<T> findByCriteria(final Criterion... criterion) {
		try {
			final Criteria crit = getSession().createCriteria(getPersistentClass());
			for (final Criterion c : criterion) {
				crit.add(c);
			}
			return crit.list();
		} catch (final HibernateException ex) {
			throw new RuntimeException(ex);
		}
	}

	protected Criteria makeCriteria() {
		return getSession().createCriteria(getPersistentClass());
	}

	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public T atualizar(T entity) {
		return (T) getSessao().merge(entity);
	}

	@Override
	@Transactional
	public void savarOuAtualizar(T entity) {
		getSessao().saveOrUpdate(entity);
	}

	@Override
	public Long count(final String campo, final Object o) {
		final Criteria c = this.makeCriteria();

		c.add(Restrictions.eq(campo, o));
		// c.add(Restrictions.eq("activo", Boolean.TRUE));

		c.setProjection(Projections.rowCount());

		return HibernateFix.count(c.list());

	}

	public EntityManager getEntityManager() {
		return entityManager;
	}

	
}
