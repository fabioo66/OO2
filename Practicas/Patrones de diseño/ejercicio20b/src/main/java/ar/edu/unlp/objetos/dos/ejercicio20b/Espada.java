package ar.edu.unlp.objetos.dos.ejercicio20b;

public class Espada implements Arma{

	@Override
	public int dañoContraCuero() {
		return 8;
	}

	@Override
	public int dañoContraAcero() {
		return 3;
	}

	@Override
	public int dañoContraHierro() {
		return 5;
	}
}
