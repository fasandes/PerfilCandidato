/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pucminas.eleicao.dao;

import java.util.List;

import org.hibernate.Session;

/**
 * 
 * @author Administrador
 */
public interface GenericDAO<T, ID> {
	
	public List<T> buscarTodos();

	public T buscarPorId(ID id);

	public T salvar(T entidad);

	public T atualizar(T entidad);

	public void apagar(T entidad);

	public Long count(String campo, Object o);

	public Session getSessao();

	public void savarOuAtualizar(T entity);

	public T buscarPorCodigo(ID id);

	void apagarMerged(T entity);
}
