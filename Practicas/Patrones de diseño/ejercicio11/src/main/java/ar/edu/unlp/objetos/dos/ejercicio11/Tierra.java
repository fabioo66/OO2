package ar.edu.unlp.objetos.dos.ejercicio11;

public class Tierra implements Topografia{

	@Override
	public double proporcionAgua() {
		return 0;
	}

	@Override
	public double proporcionTierra() {
		return 1;
	}

	@Override
	public boolean esIgual(Topografia topografia) {
	    return topografia.esIgualTierra();
	}

	@Override
	public boolean esIgualAgua() {
		return false;
	}

	@Override
	public boolean esIgualTierra() {
		return true;
	}

	@Override
	public boolean esIgualMixta(Mixta otraMixta) {
		return false;
	}

}
