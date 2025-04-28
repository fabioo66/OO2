package ar.edu.unlp.objetos.dos.ejercicio11b;

public interface Topografia {
	public double proporcionAgua();
	public double proporcionTierra();
	public boolean esIgual(Topografia topografia);
	public boolean esIgualAgua();
    public boolean esIgualTierra();
    public boolean esIgualMixta(Mixta otraMixta);
    public boolean esIgualPantano();
}
