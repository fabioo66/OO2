package ar.edu.unlp.objetos.dos.ejercicio2;

public class Tijera implements Objeto {

	public Tijera() {
		
	}
	
	@Override
	public String jugarContra(Objeto objeto) {
		return objeto.jugarContraTijera();
	}

	@Override
	public String jugarContraTijera() {
		return "Empate";
	}

	@Override
	public String jugarContraPapel() {
		return "Gana tijera";
	}

	@Override
	public String jugarContraPiedra() {
		return "Gana piedra";
	}

	@Override
	public String jugarContraLagarto() {
		return "Gana tijera";
	}

	@Override
	public String jugarContraSpock() {
		return "Gana spock";
	}
	
	
	
}
