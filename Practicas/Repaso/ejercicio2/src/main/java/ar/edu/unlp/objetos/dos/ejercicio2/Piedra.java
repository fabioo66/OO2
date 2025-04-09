package ar.edu.unlp.objetos.dos.ejercicio2;

public class Piedra implements Objeto{
	
	public Piedra() {
		
	}

	@Override
	public String jugarContra(Objeto objeto) {
		return objeto.jugarContraPiedra();
	}

	@Override
	public String jugarContraTijera() {
		return "Gana piedra";
	}

	@Override
	public String jugarContraPapel() {
		return "Gana papel";
	}

	@Override
	public String jugarContraPiedra() {
		return "Empate";
	}

	@Override
	public String jugarContraLagarto() {
		return "Gana piedra";
	}

	@Override
	public String jugarContraSpock() {
		return "Gana spock";
	}
}