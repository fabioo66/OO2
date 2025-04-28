package ar.edu.unlp.objetos.dos.ejercicio11;

public interface Topografia {
	public double proporcionAgua();
	public double proporcionTierra();
	public boolean esIgual(Topografia topografia);
	boolean esIgualAgua();
    boolean esIgualTierra();
    boolean esIgualMixta(Mixta otraMixta);
}
