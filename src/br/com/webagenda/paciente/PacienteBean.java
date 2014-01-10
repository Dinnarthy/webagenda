package br.com.webagenda.paciente;



import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;




@ManagedBean(name="pacienteBean")
@ViewScoped
public class PacienteBean {
	
	private boolean campo=true;
	
	public PacienteBean(){
		
	}
	
	public void salvar(ActionEvent actionEvent){
		FacesContext context = FacesContext.getCurrentInstance();  
        
        context.addMessage(null, new FacesMessage("Cadastro Paciente", "Cadastrado com sucesso. "));
        campo=true;
	}
	
	
		
	public void habilitaCampo(){
		campo = false;
	}
	 
	
	
	public void desabilitaCampo(){
		campo = true;
	}
	
	

	public boolean isCampo() {
		return campo;
	}

	public void setCampo(boolean campo) {
		this.campo = campo;
	}
	
	

}
