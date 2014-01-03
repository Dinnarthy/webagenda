package br.com.webagenda.EstadoCidade;

import java.util.List;



public interface EstadoCidadeDAO {

	
	
		
	public List consultaTodosEstados();
	 
	public List consultaCidades(Estado estado);
	 
	public Cidade getByIdCidade(Long id);
	 
	public Estado getByIdEstado(Long id);

	
}
