package ar.edu.unlp.objetos.dos.ejercicio2;

public class Spock implements Objeto{
	
	public Spock() {
		
	}

	@Override
	public String jugarContra(Objeto objeto) {
		return objeto.jugarContraSpock();
	}

	@Override
	public String jugarContraTijera() {
		return "Gana spock";
	}

	@Override
	public String jugarContraPapel() {
		return "Gana papel";
	}

	@Override
	public String jugarContraPiedra() {
		return "Gana spock";
	}

	@Override
	public String jugarContraLagarto() {
		return "Gana lagarto";
	}

	@Override
	public String jugarContraSpock() {
		return "Empate";
	}
	
	

}
