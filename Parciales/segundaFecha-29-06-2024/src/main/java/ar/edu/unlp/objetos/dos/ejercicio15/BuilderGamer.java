package ar.edu.unlp.objetos.dos.ejercicio15;

public class BuilderGamer extends BuilderEquipo{

	@Override
	public void construirProcesador() {
		this.getEquipo().agregarComponente(this.getCatalogo().getComponente("Procesador Gamer"));
		this.getEquipo().agregarComponente(this.getCatalogo().getComponente("Pad termico"));
		this.getEquipo().agregarComponente(this.getCatalogo().getComponente("Cooler"));
	}

	@Override
	public void construirMemoriaRam() {
		this.getEquipo().agregarComponente(this.getCatalogo().getComponente("32 GB"));
		this.getEquipo().agregarComponente(this.getCatalogo().getComponente("32 GB"));
	}

	@Override
	public void construirDisco() {
		this.getEquipo().agregarComponente(this.getCatalogo().getComponente("SSD 500gb"));
		this.getEquipo().agregarComponente(this.getCatalogo().getComponente("SSD 1 TB"));
	}

	@Override
	public void construirTarjetaGrafica() {
		this.getEquipo().agregarComponente(this.getCatalogo().getComponente("RTX 4090"));
	}

	@Override
	public void construirGabinete() {
		this.getEquipo().agregarComponente(this.getCatalogo().getComponente("Gabinete Gamer"));
		//Dice el chat que asi no da decimales
		double consumo = this.getEquipo().calcularConsumo();
		int consumoFinal = (int) Math.ceil(consumo * 1.5); // Redondea hacia arriba
		this.getEquipo().agregarComponente(this.getCatalogo().getComponente("fuente " + consumoFinal + " w"));
		
		/* Mi solucion:
		 double consumoEsperado = this.getEquipo().calcularConsumo() + (this.getEquipo().calcularConsumo() * 0.50);
		 this.getEquipo().agregarComponente(this.getCatalogo().getComponente("fuente " + consumoEsperado + " w"));
		 */
	}

}
