package pe.org.cineplanet.jsf.bean;


import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import pe.org.cineplanet.model.jpa.Usuario;
import pe.org.cineplanet.svc.UsuarioService;
import pe.org.cineplanet.util.Message;
import pe.org.cineplanet.util.Seguridad;
import pe.org.cineplanet.util.StringUtils;

/**
 * 
 * @author Hever Pumallihua
 */

@Component("cambioClaveController")
@Scope("session")
public class CambioClaveController implements Serializable {

	private static final long serialVersionUID = 1L;
	private static final Logger logger = LoggerFactory
			.getLogger(CambioClaveController.class);
	
	@Autowired
	private LoginController loginController;
	@Autowired
	private UsuarioService usuarioService;

	private Usuario userSesion = null;
	private Message message = new Message();

	private String clave = "";
	private String nuevaClave = "";
	private String confirmarClave = "";

	public CambioClaveController() {

	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getNuevaClave() {
		return nuevaClave;
	}

	public void setNuevaClave(String nuevaClave) {
		this.nuevaClave = nuevaClave;
	}

	public String getConfirmarClave() {
		return confirmarClave;
	}

	public void setConfirmarClave(String confirmarClave) {
		this.confirmarClave = confirmarClave;
	}

	public void guardarClave() {

		validarSesion();

		try {
		
			if (!validarDatos())
				return;

			userSesion.setPassword(Seguridad.encrypt(nuevaClave));
			//userSesion.setClave(nuevaClave);
			usuarioService.edit(userSesion);
			FacesContext.getCurrentInstance().addMessage(
					null,
					new FacesMessage(FacesMessage.SEVERITY_INFO, "EXITO",
							"Su contraseña ha sido cambiado con exito"));
		} catch (Exception e) {
			logger.warn("ERROR AL GUARDAR CAMBIO DE CLAVE");
		}
	}

	public boolean validarDatos() throws Exception{

		if (clave.length() == 0) {
			FacesContext.getCurrentInstance().addMessage(
					null,
					new FacesMessage(FacesMessage.SEVERITY_WARN, "ADVERTENCIA",
							"Ingrese su contraseña anterior"));
			return false;
		}

		if (nuevaClave.length() == 0) {
			FacesContext.getCurrentInstance().addMessage(
					null,
					new FacesMessage(FacesMessage.SEVERITY_WARN, "ADVERTENCIA",
							"Ingrese su nueva contraseña"));
			return false;
		}

		if (confirmarClave.length() == 0) {
			FacesContext.getCurrentInstance().addMessage(
					null,
					new FacesMessage(FacesMessage.SEVERITY_WARN, "ADVERTENCIA",
							"Confirme su nueva contraseña"));
			return false;
		}

		if (verificarClaveActual()) {
			FacesContext.getCurrentInstance().addMessage(
					null,
					new FacesMessage(FacesMessage.SEVERITY_WARN, "ADVERTENCIA",
							"Verifique su contraseña actual"));
		}

		if (!nuevaClave.trim().equalsIgnoreCase(confirmarClave)) {
			FacesContext.getCurrentInstance().addMessage(
					null,
					new FacesMessage(FacesMessage.SEVERITY_WARN, "ADVERTENCIA",
							message.getMessage("msgConfirmarClave")));
			return false;
		}

		if (StringUtils.validarClave(nuevaClave)) {
			FacesContext.getCurrentInstance().addMessage(
					null,
					new FacesMessage(FacesMessage.SEVERITY_WARN, "ADVERTENCIA",
							message.getMessage("msgClaveError")));
			return false;
		}

		/*if (validarCuenta()) {
			FacesContext.getCurrentInstance().addMessage(
					null,
					new FacesMessage(FacesMessage.SEVERITY_WARN, "ADVERTENCIA",
							"Nombre de usuario / contraseña ya existe"));
			return false;
		}*/

		return true;
	}
	
	public boolean verificarClaveActual() throws Exception {

		String plainText = Seguridad.decrypt(userSesion.getPassword());
				
		if (plainText.equalsIgnoreCase(clave))
			return false;
		else
			return true;

	}

	/*public boolean validarCuenta() {

		Usuario usuario = usuarioService.findUsuarioByUsername(
				userSesion.getUsuario(), nuevaClave);

		if (usuario != null)
			return true;
		else
			return false;

	}*/

	public void validarSesion() {
		FacesContext context = FacesContext.getCurrentInstance();
		
		userSesion = (Usuario) context.getExternalContext().getSessionMap()
				.get(loginController.getUsername());

		if (userSesion == null) {
			String ctxPath = context.getExternalContext()
					.getRequestContextPath();
			try {
				context.getExternalContext().redirect(ctxPath + "/login.jsf");
			} catch (Exception e) {
				//e.printStackTrace();
			}
		}
	}

	public void limpiar() {
		clave = "";
		nuevaClave = "";
		confirmarClave = "";
	}

}
