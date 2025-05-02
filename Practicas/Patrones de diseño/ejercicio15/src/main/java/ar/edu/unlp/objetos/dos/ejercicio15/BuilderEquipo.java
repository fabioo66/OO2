package ar.edu.unlp.objetos.dos.ejercicio15;

public abstract class BuilderEquipo {
	private Equipo equipo;
	private Catalogo catalogo;
	
	public void reset() {
		this.equipo = new Equipo();
		this.catalogo = new Catalogo();
	}
	
	public abstract void construirProcesador();
	public abstract void construirMemoriaRam();
	public abstract void construirDisco();
	public abstract void construirTarjetaGrafica();
	public abstract void construirGabinete();

	public Equipo getEquipo() {
		return this.equipo;
	}
	
	public Catalogo getCatalogo() {
		return this.catalogo;
	}
}
