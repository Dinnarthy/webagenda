package br.com.webagenda.paciente;

import java.util.List;

public interface PacienteDAO {
	
	public void salvar(Paciente user);
	public void delete(Paciente user);
	public void alter(Paciente user);
	
	public Paciente getById(Integer idUsuario);
	
	public Paciente getByEmail(String email);
	
	public Paciente getByNome(String nome);
	
	public Paciente getBySenha(String senha);
	
	public List<Paciente>listar();

}
