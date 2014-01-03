package br.com.webagenda.paciente;

import br.com.webagenda.util.HibernateUtil;

public class DAOFactory {
	
	public static PacienteDAO criarPacienteDAO(){
		PacienteDAOHibernate pacienteDAO = new PacienteDAOHibernate();
		pacienteDAO.setSession(HibernateUtil.getSf().getCurrentSession());
		return pacienteDAO;
	}

}
