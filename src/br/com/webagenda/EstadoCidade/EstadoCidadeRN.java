package br.com.webagenda.EstadoCidade;

import java.util.List;

public class EstadoCidadeRN {
	
	private EstadoCidadeDAO estadoCidadeDAO;
	
	public EstadoCidadeRN(){
		
		estadoCidadeDAO =DAOFactory.criarEstadoCidadeDAO();
	}
	
	public Cidade getByIdCidade(Long id) {
		return estadoCidadeDAO.getByIdCidade(id);
			
		}
		 
		
		public Estado getByIdEstado(Long id) {
		return estadoCidadeDAO.getByIdEstado(id);	
		}
		 
		
		public List consultaTodosEstados() {
			return estadoCidadeDAO.consultaTodosEstados();
		}
		 
		
		public List consultaCidades(Estado estado) {
			return estadoCidadeDAO.consultaCidades(estado);
		}
	

}
