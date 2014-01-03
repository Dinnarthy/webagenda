package br.com.webagenda.paciente;

import java.util.List;

public class PacienteRN {
	
	private PacienteDAO pacienteDAO;
	
	public PacienteRN(){
		pacienteDAO = DAOFactory.criarPacienteDAO();
		
	}
	
	public Paciente getById(Integer idUsuario){
		return pacienteDAO.getById(idUsuario);
	}
	
	public Paciente getByEmail(String email){
		return pacienteDAO.getByEmail(email);
	}
	public Paciente getByNome(String nome){
		return pacienteDAO.getByNome(nome);
	}

	public Paciente getBySenha(String senha){
		return pacienteDAO.getBySenha(senha);
	}
	public void salvar(Paciente paciente){
		Integer idPaciente = paciente.getIdPaciente();
		if(idPaciente == 0 || idPaciente == null){
			pacienteDAO.salvar(paciente);	
		}else{
			pacienteDAO.alter(paciente);
		}
		
	}
	
	public void excluir(Paciente usuario){
		pacienteDAO.delete(usuario);
	}
	
	public List<Paciente> listar(){
		return pacienteDAO.listar();
		
	}

}
