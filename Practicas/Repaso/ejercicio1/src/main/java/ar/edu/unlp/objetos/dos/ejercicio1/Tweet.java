package ar.edu.unlp.objetos.dos.ejercicio1;

public class Tweet extends Post{
	private String texto;

	public Tweet(Usuario usuario, String texto) {
		super(usuario);
		this.texto = texto;
	}
}
