package br.com.webagenda.usuario;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;


@ManagedBean(name="usuarioController")
@SessionScoped
public class UsuarioController {
	
	private Usuario usuario;
	
	public UsuarioController(){
		usuario = new Usuario();
		SecurityContext context = SecurityContextHolder.getContext();
		if( context instanceof SecurityContext){
			Authentication authentication = context.getAuthentication();
			if (authentication instanceof Authentication){
                usuario.setUsername(((User)authentication.getPrincipal()).getUsername());
            }
		}
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
