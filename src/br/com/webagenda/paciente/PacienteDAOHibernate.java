package br.com.webagenda.paciente;

import java.util.List;

import org.hibernate.Session;

public class PacienteDAOHibernate implements PacienteDAO {
	
	private Session session;

	
	public void setSession(Session s) {
		this.session = s;
	}


	@Override
	public void salvar(Paciente user) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void delete(Paciente user) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void alter(Paciente user) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public Paciente getById(Integer idUsuario) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Paciente getByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Paciente getByNome(String nome) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Paciente getBySenha(String senha) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<Paciente> listar() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	

}
