package ar.edu.unlp.objetos.dos.ejercicio2;

public class Lagarto implements Objeto{
	
	public Lagarto() {
		
	}

	@Override
	public String jugarContra(Objeto objeto) {
		return objeto.jugarContraLagarto();
	}

	@Override
	public String jugarContraTijera() {
		return "Gana tijera";
	}

	@Override
	public String jugarContraPapel() {
		return "Gana lagarto";
	}

	@Override
	public String jugarContraPiedra() {
		return "Gana piedra";
	}

	@Override
	public String jugarContraLagarto() {
		return "Empate";
	}

	@Override
	public String jugarContraSpock() {
		return "Gana lagarto";
	}
	
	
}
