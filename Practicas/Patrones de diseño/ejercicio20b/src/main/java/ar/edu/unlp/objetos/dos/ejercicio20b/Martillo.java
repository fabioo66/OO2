package ar.edu.unlp.objetos.dos.ejercicio20b;

public class Martillo implements Arma{

	@Override
	public int dañoContraCuero() {
		return 13;
	}

	@Override
	public int dañoContraAcero() {
		return 10;
	}

	@Override
	public int dañoContraHierro() {
		return 8;
	}

}
