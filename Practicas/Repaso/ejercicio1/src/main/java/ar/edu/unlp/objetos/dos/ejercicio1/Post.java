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
	
	public List<Retweet> getRetweets(){
		return this.retweets;
	}

	public void agregarRetweet(Retweet retweet) {
		this.retweets.add(retweet);
	}
	
	private void eliminarRetweets() {
		this.retweets.clear();
	}

	public void eliminarReferencias() {
		this.retweets.stream().
			forEach(retweet -> retweet.getUsuario().eliminarRetweet(retweet));
		this.eliminarRetweets();
	}
}
