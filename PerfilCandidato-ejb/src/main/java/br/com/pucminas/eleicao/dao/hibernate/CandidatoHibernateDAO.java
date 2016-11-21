package br.com.pucminas.eleicao.dao.hibernate;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

import br.com.pucminas.eleicao.dao.CandidatoDAO;
import br.com.pucminas.eleicao.dto.FiltroCandidatoDTO;
import br.com.pucminas.eleicao.model.Candidato;

public class CandidatoHibernateDAO extends GenericHibernateDAO<Candidato, Integer> implements CandidatoDAO{

	public CandidatoHibernateDAO() {
		super(Candidato.class);

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Candidato> buscarComFiltro(FiltroCandidatoDTO filtro) {
		Criteria c = getSessao().createCriteria(Candidato.class);
		
		if (filtro.getCorracaCODIGOCORRACA() != null) {
			c.add(Restrictions.eq("corracaCODIGOCORRACA", filtro.getCorracaCODIGOCORRACA()));
		}
		if (filtro.getCpfCandidato() != null) {
			c.add(Restrictions.eq("cpfCandidato", filtro.getCpfCandidato()));
		}
		if (filtro.getEscolaridadeCODGRAUINSTRUCAO() != null) {
			c.add(Restrictions.eq("escolaridadeCODGRAUINSTRUCAO", filtro.getEscolaridadeCODGRAUINSTRUCAO()));
		}
		if (filtro.getEstadocivilCODIGOESTADOCIVIL() != null) {
			c.add(Restrictions.eq("escolaridadeCODGRAUINSTRUCAO", filtro.getEstadocivilCODIGOESTADOCIVIL()));
		}
		if (filtro.getNomeCandidato() != null) {
			c.add(Restrictions.eq("nomeCandidato", filtro.getNomeCandidato()));
		}
		
		if (filtro.getNomeUrnaCandidato() != null) {
			c.add(Restrictions.eq("nomeUrnaCandidato", filtro.getNomeUrnaCandidato()));
		}
		
		if (filtro.getNumeroCandidato() != null) {
			c.add(Restrictions.eq("numeroCandidato", filtro.getNumeroCandidato()));
		}
		
		if (filtro.getOcupacaoCODIGOOCUPACAO() != null) {
			c.add(Restrictions.eq("ocupacaoCODIGOOCUPACAO", filtro.getOcupacaoCODIGOOCUPACAO()));
		}
		
		if (filtro.getPartidoNUMEROPARTIDO() != null) {
			c.add(Restrictions.eq("partidoNUMEROPARTIDO", filtro.getPartidoNUMEROPARTIDO()));
		}
		
		if (filtro.getSequencialCandidato() != null) {
			c.add(Restrictions.eq("sequencialCandidato", filtro.getSequencialCandidato()));
		}
		
		if (filtro.getSexoCODIGOSEXO() != null) {
			c.add(Restrictions.eq("sexoCODIGOSEXO", filtro.getSexoCODIGOSEXO()));
		}
		
		if (filtro.getMunicipio() != null) {
			c.add(Restrictions.eq("municipio", filtro.getMunicipio()));
		}
		
		if (filtro.getCargoCODIGOCARGO() != null) {
			c.add(Restrictions.eq("cargoCODIGOCARGO", filtro.getCargoCODIGOCARGO()));
		}
		
		return c.list();
		
	
		
	}
	
	

}
