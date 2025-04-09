package ar.edu.unlp.objetos.dos.ejercicio1;

public class Retweet extends Post{
	private Post post;
	
	public Retweet(Usuario usuario, Post post) {
		super(usuario);
		this.post = post;
	}
}
