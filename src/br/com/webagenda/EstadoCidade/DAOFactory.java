package br.com.webagenda.EstadoCidade;


import br.com.webagenda.paciente.PacienteDAOHibernate;
import br.com.webagenda.util.HibernateUtil;

public class DAOFactory {
	
	public static EstadoCidadeDAO criarEstadoCidadeDAO(){
		EstadoCidadeDAOHibernate estadoCidadeDAO = new EstadoCidadeDAOHibernate();
		estadoCidadeDAO.setSession(HibernateUtil.getSf().getCurrentSession());
		return estadoCidadeDAO;
	}

}
