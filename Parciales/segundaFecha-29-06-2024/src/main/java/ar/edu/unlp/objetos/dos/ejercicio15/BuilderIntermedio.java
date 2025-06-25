package ar.edu.unlp.objetos.dos.ejercicio15;

public class BuilderIntermedio extends BuilderEquipo{

	@Override
	public void construirProcesador() {
		this.getEquipo().agregarComponente(this.getCatalogo().getComponente("Procesador intermedio"));
	}

	@Override
	public void construirMemoriaRam() {
		this.getEquipo().agregarComponente(this.getCatalogo().getComponente("16 GB"));
	}

	@Override
	public void construirDisco() {
		this.getEquipo().agregarComponente(this.getCatalogo().getComponente("SSD 500 GB"));
	}

	@Override
	public void construirTarjetaGrafica() {
		this.getEquipo().agregarComponente(this.getCatalogo().getComponente("GTX 1650"));
	}

	@Override
	public void construirGabinete() {
		this.getEquipo().agregarComponente(this.getCatalogo().getComponente("Gabinete intermedio"));
		this.getEquipo().agregarComponente(this.getCatalogo().getComponente("Fuente 800 w"));
	}

}
