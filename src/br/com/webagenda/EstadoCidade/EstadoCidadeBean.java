package br.com.webagenda.EstadoCidade;


import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;




import javax.faces.event.AjaxBehaviorEvent;

import org.hibernate.Session;

import br.com.webagenda.util.HibernateUtil;

@ManagedBean
@ViewScoped
public class EstadoCidadeBean implements Serializable {
	
	
	private List<Estado> estados;
	private List<Cidade> cidades;
	private Cidade cidade;
	private Estado estado;
	EstadoCidadeRN estadoCidadeRN ;
	public EstadoCidadeBean(){
		
		}
	
	@PostConstruct
	public void init(){
		System.out.print("Entrou no Consulta Estados");
		estadoCidadeRN = new EstadoCidadeRN();
		estados = estadoCidadeRN.consultaTodosEstados();
		
	}
	
	
	public void listaCidades(AjaxBehaviorEvent event){
		System.out.print("Entrou no Consulta Cidades");
		if(estados.equals(null)||estados.equals("")){
			FacesMessage msg = new FacesMessage("Atenção", "Um estado precisa ser escolhido!");  
			  
	        FacesContext.getCurrentInstance().addMessage(null, msg);
			
		}else{
			estadoCidadeRN =  new EstadoCidadeRN();
			cidades = estadoCidadeRN.consultaCidades(estado);
		}
		
		
		
	}

	public List getEstados() {
		return estados;
	}

	public void setEstados(List<Estado> estados) {
		this.estados = estados;
	}

	public List getCidades() {
		return cidades;
	}

	public void setCidades(List<Cidade> cidades) {
		this.cidades = cidades;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public EstadoCidadeRN getEstadoCidadeRN() {
		return estadoCidadeRN;
	}
	
	

	
	
}
