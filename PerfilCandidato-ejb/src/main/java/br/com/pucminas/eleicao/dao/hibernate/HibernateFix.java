package br.com.pucminas.eleicao.dao.hibernate;

import java.util.List;

public class HibernateFix {
	/**
	 * Usado para garantizar que las dos versiones del hibernate 3.6 y 3.2 realicen de forma correcta el count
	 * @param list
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	public static Long count(List list) {

		Object resultado = list.iterator().next();
		
		return count(resultado);
	}
	/**
	 * Usado para garantizar que las dos versiones del hibernate 3.6 y 3.2 realicen de forma correcta el count
	 * @param list
	 * @return
	 */
	public static Long count(Object resultado) {
		Long cant = 0l;
		
		if (resultado instanceof Integer) {
			cant = Long.valueOf(((Integer) resultado).longValue());
		} else {
			cant = (Long) resultado;
		}
		return cant;
	}
}
