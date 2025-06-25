package ar.edu.unlp.objetos.dos.ejercicio20;

public class Baston implements Arma{

	@Override
	public int dañoContraCuero() {
		return 2;
	}

	@Override
	public int dañoContraAcero() {
		return 1;
	}

	@Override
	public int dañoContraHierro() {
		return 1;
	}

}
