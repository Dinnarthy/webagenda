package br.com.webagenda.EstadoCidade;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;


public class EstadoCidadeDAOHibernate implements EstadoCidadeDAO {
	
private Session session;

	
	public void setSession(Session s) {
		this.session = s;
	}


	@Override
	public List consultaTodosEstados() {
		Criteria crit = session.createCriteria(Estado.class);
		return crit.list();
		
	}


	@Override
	public List consultaCidades(Estado estado) {
		
			
		
		Criteria crit = session.createCriteria(Cidade.class);
		crit.add(Restrictions.eq("estado", estado));
		return   crit.list();
		
		/*	Query query = session.createQuery("FROM Cidade c WHERE c.estado.idEstado = ? ");
			query.setLong(0, estado.getIdEstado());
			List cidades = query.list();
			
			return cidades;*/
			
			
			
			
		}
		
		
		
	


	@Override
	public Cidade getByIdCidade(Long id) {
		return (Cidade) session.get(Cidade.class, id);
		
	}


	@Override
	public Estado getByIdEstado(Long id) {
		return (Estado) session.get(Estado.class, id);
		
	}
	
	

	
	
}
