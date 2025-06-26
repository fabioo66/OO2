package ar.edu.unlp.objetos.dos.Parcial_08_08_2022;

import java.time.LocalDate;

public class Proyecto {
	private String nombre;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private String objetivo;
	private double margen;
	private int numeroIntegrantes;
	private double montoPorIntegrantes;
	private Estado estado;
	
	public Proyecto(String nombre, LocalDate fechaInicio, LocalDate fechaFin, String objetivo, double margen, int numeroIntegrantes, double montoPorIntegrantes, Estado estado) {
		this.nombre = nombre;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.objetivo = objetivo;
		this.margen = margen;
		this.numeroIntegrantes = numeroIntegrantes;
		this.montoPorIntegrantes = montoPorIntegrantes;
		this.estado = new EnConstruccion();
	}
	
	protected void setEstado(Estado estado) {
		this.estado = estado;
	}
	
	public void aprobarEtapa() {
		this.estado.aprobarEtapa(this);
	}
	
	public double costoDelProyecto() {
		return this.montoPorIntegrantes * this.numeroIntegrantes;
	}
	
	public double precioDelProyecto() {
		return this.costoDelProyecto() * this.margen;
	}
	
	public void modificarMargenDeGanancia(double valor) {
		this.estado.modificarMargenDeGanancia(this, valor);
	}
	
	public void cancelarProyecto() {
		this.estado.cancelarProyecto(this);
	}
	
	public double getMargen() {
		return this.margen;
	}

	public void setMargen(double valor) {
		this.margen = valor;
	}

	public void setObjetivo(String string) {
		this.objetivo = string;
	}
}
