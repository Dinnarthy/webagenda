package br.com.sisclinic.web;

import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="indexBean")
@RequestScoped
public class IndexBean {
	
	private String tipo;
	private Date data;
	
	
	


	public Date getData() {
		return data;
	}





	public void setData(Date data) {
		this.data = data;
	}





	public String getTipo() {
		return tipo;
	}





	public void setTipo(String tipo) {
		this.tipo = tipo;
	}





	public String carregarLogin(String tipo){
		this.tipo=tipo;
		return "login.xhtml";
			
		
		
		
		
	}

}
