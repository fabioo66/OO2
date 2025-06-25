package ar.edu.unlp.objetos.dos.ejercicio20;

public class Arco implements Arma{

	@Override
	public int dañoContraCuero() {
		return 5;
	}

	@Override
	public int dañoContraAcero() {
		return 2;
	}

	@Override
	public int dañoContraHierro() {
		return 3;
	}

}
