package ar.edu.unlp.objetos.dos.ejercicio11b;

public class Agua implements Topografia{

	@Override
	public double proporcionAgua() {
		return 1;
	}

	@Override
	public double proporcionTierra() {
		return 0;
	}

	@Override
	public boolean esIgual(Topografia topografia) {
		return topografia.esIgualAgua();
	}

	@Override
	public boolean esIgualAgua() {
		return true;
	}

	@Override
	public boolean esIgualTierra() {
		return false;
	}

	@Override
	public boolean esIgualMixta(Mixta otraMixta) {
		return false;
	}

	@Override
	public boolean esIgualPantano() {
		// TODO Auto-generated method stub
		return false;
	}

}
