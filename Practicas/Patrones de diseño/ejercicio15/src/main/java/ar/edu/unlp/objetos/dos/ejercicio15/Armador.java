package ar.edu.unlp.objetos.dos.ejercicio15;

public class Armador {
	private BuilderEquipo builderEquipo;
	
	public Armador() {
		this.builderEquipo = new BuilderBasico();
	}

	public BuilderEquipo getBuilderEquipo() {
		return builderEquipo;
	}

	public void setBuilderEquipo(BuilderEquipo builderEquipo) {
		this.builderEquipo = builderEquipo;
	}
	
	public Equipo construirEquipo() {
		this.builderEquipo.reset();
		this.builderEquipo.construirProcesador();
		this.builderEquipo.construirMemoriaRam();
		this.builderEquipo.construirDisco();
		this.builderEquipo.construirTarjetaGrafica();
		this.builderEquipo.construirGabinete();
		return this.builderEquipo.getEquipo();
	}
}
