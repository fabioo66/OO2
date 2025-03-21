package ar.edu.unlp.objetos.dos.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public abstract class Post {
	private List<Retweet> retweets;
	private Usuario usuario;
	
	public Post(Usuario usuario) {
		this.retweets = new ArrayList<>();
		this.usuario = usuario;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void agregarRetweet(Retweet retweet) {
		this.retweets.add(retweet);
	}
	
	private void eliminarRetweets() {
		this.retweets.clear();
	}

	/*public void eliminarReferencias() {
		this.retweets.stream().
			forEach(retweet -> retweet.getUsuario().eliminarRetweet(retweet));
		this.eliminarRetweets();
	}*/
	
	public void eliminarReferencias() {
	    // Primero eliminamos las referencias de los retweets anidados
	    this.retweets.forEach(retweet -> retweet.eliminarReferencias());
	    
	    // Luego eliminamos las referencias en los usuarios
	    this.retweets.forEach(retweet -> retweet.getUsuario().eliminarRetweet(retweet));

	    // Finalmente, vaciamos la lista de retweets de este post
	    this.eliminarRetweets();
	}
}
