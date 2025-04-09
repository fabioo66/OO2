package ar.edu.unlp.objetos.dos.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Twitter {
	private List<Usuario> usuarios;
	
	public Twitter() {
		usuarios = new ArrayList<>();
	}
	
	public List<Usuario> getUsuarios(){
		return this.usuarios;
	}
	
	public void eliminarUsuario(Usuario usuario) {
		usuario.eliminarPosts();
		this.usuarios.remove(usuario);
	}

	public void agregarUsuario(Usuario usuario) {
		if (!this.existeUsuario(usuario.getScreenName())) {
			this.usuarios.add(usuario);
		}
	}

	private boolean existeUsuario(String screenName) {
		return this.usuarios.stream().
			anyMatch(usuario -> usuario.getScreenName().equals(screenName));
	}
}
