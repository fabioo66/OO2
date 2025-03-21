package ar.edu.unlp.objetos.dos.ejercicio2;

public class Papel implements Objeto {

	public Papel() {
		
	}
	
	@Override
	public String jugarContra(Objeto objeto) {
		return objeto.jugarContraPapel();
	}

	@Override
	public String jugarContraTijera() {
		return "Gana tijera";
	}

	@Override
	public String jugarContraPapel() {
		return "Empate";
	}

	@Override
	public String jugarContraPiedra() {
		return "Gana papel";
	}

	@Override
	public String jugarContraLagarto() {
		return "Gana lagarto";
	}

	@Override
	public String jugarContraSpock() {
		return "Gana papel";
	}
}
