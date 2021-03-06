package pe.org.cineplanet.dao;


import java.util.List;

import pe.org.cineplanet.model.jpa.Usuario;

/**
 * 
 * @author Hever Pumallihua
 */
public interface UsuarioDao {
	
	public abstract Usuario find(Long id);
	
	public abstract Usuario save(Usuario obj);
	
	public abstract Usuario edit(Usuario obj);
	
	public abstract List<Usuario> getListaUsuario();
	
	public abstract List<Usuario> getListaUsuario(Long idRol, Long idCampania);
	
	//public abstract Usuario findUsuarioByUsername(String username, String clave); 
	
	public abstract Usuario findByUsername(String username);
	
	public abstract Usuario findByUserAndPwAndRol(String username, String clave, Long idRol, Long idCampania); 
	
	public abstract Usuario findByDniAndCampaniaAndRol(String dni, Long idRol, Long idCampania);
	
	public abstract Long getIdMax();
	
	public abstract Usuario validarUsrJiAndTe(String username, String dni, String anioCampania);
	
	public abstract Usuario getUsuarioByDniAndAnio(String dni, String anioCampania);
	
	public abstract List<Usuario> getListByUsername(String username);

}
