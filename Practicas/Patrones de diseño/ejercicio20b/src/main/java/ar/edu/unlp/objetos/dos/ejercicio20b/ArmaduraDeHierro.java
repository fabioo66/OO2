package ar.edu.unlp.objetos.dos.ejercicio20b;

public class ArmaduraDeHierro implements Armadura{

	@Override
	public int recibirDaño(Arma arma) {
		return arma.dañoContraHierro();
	}

}
