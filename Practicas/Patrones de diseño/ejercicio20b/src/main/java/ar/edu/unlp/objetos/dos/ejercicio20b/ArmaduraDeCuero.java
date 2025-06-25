package ar.edu.unlp.objetos.dos.ejercicio20b;

public class ArmaduraDeCuero implements Armadura{

	@Override
	public int recibirDaño(Arma arma) {
		return arma.dañoContraCuero();
	}

}
