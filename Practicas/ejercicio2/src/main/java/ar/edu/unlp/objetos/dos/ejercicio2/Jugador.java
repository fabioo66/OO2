package ar.edu.unlp.objetos.dos.ejercicio2;

public class Jugador {
	
	private Objeto objeto;
	
	public Jugador(Objeto objeto) {
		this.objeto = objeto;
	}
	
	private Objeto getObjeto() {
		return this.objeto;
	}
	
	public String Jugar(Jugador jugador2) {
		return this.objeto.jugarContra(jugador2.getObjeto());
	}
	
}
