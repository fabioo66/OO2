package ar.edu.unlp.objetos.dos.ejercicio15;

public class BuilderBasico extends BuilderEquipo{

	@Override
	public void construirProcesador() {
		this.getEquipo().agregarComponente(this.getCatalogo().getComponente("Procesador basico"));
	}

	@Override
	public void construirMemoriaRam() {
		this.getEquipo().agregarComponente(this.getCatalogo().getComponente("8 GB"));
	}

	@Override
	public void construirDisco() {
		this.getEquipo().agregarComponente(this.getCatalogo().getComponente("HDD 500 GB"));
	}

	@Override
	public void construirTarjetaGrafica() {
	}

	@Override
	public void construirGabinete() {
		this.getEquipo().agregarComponente(this.getCatalogo().getComponente("Gabinete estandar"));
	}
}
