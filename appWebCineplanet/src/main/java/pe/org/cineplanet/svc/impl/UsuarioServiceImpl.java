package pe.org.cineplanet.svc.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.org.cineplanet.dao.UsuarioDao;
import pe.org.cineplanet.model.jpa.Usuario;
import pe.org.cineplanet.svc.UsuarioService;

/**
 * 
 * @author Hever Pumallihua
 */
@Service
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	private UsuarioDao usuarioDao;

	@Transactional
	public Usuario find(Long id) {
		return usuarioDao.find(id);
	}

	@Transactional
	public Usuario save(Usuario obj) {
		return usuarioDao.save(obj);
	}
	
	@Transactional
	public Usuario edit(Usuario obj) {
		return usuarioDao.edit(obj);		
	}

	public List<Usuario> getListaUsuario() {
		return usuarioDao.getListaUsuario();
	}
	
	public List<Usuario> getListaUsuario(Long idRol, Long idCampania) {
		return usuarioDao.getListaUsuario(idRol, idCampania);
	}

	/*public Usuario findUsuarioByUsername(String username, String clave) {
		return usuarioDao.findUsuarioByUsername(username, clave);
	}*/
	
	public Usuario findByUsername(String username) {
		return usuarioDao.findByUsername(username);
	}
	
	public Usuario findByUserAndPwAndRol(String username, String clave, Long idRol, Long idCampania) {
		return usuarioDao.findByUserAndPwAndRol(username,clave,idRol, idCampania);
	}
	
	public Long getIdMax(){
		return usuarioDao.getIdMax();
	}

	public Usuario findByDniAndCampaniaAndRol(String dni, Long idRol,Long idCampania) {
		return usuarioDao.findByDniAndCampaniaAndRol(dni, idRol, idCampania);		
	}
	
	public Usuario validarUsrJiAndTe(String username, String dni, String anioCampania) {
		return usuarioDao.validarUsrJiAndTe(username, dni, anioCampania);
	}
	
	public Usuario getUsuarioByDniAndAnio(String dni, String anioCampania) {
		return usuarioDao.getUsuarioByDniAndAnio(dni, anioCampania);
	}
	
	public List<Usuario> getListByUsername(String username) {
		return usuarioDao.getListByUsername(username);
	}
	
}
