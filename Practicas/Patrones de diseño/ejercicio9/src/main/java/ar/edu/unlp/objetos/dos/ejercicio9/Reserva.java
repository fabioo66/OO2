package ar.edu.unlp.objetos.dos.ejercicio9;

import java.time.LocalDate;

public class Reserva {
	private int cantidadDias;
	private LocalDate fechaInicio;
	private Usuario conductor;
	private AutoEnAlquiler autoEnAlquiler;
	
	public Reserva(int cantidadDias, Usuario conductor, AutoEnAlquiler autoEnAlquiler, LocalDate fechaInicio) {
		this.cantidadDias = cantidadDias;
		this.fechaInicio = fechaInicio;
		this.conductor = conductor;
		this.autoEnAlquiler = autoEnAlquiler;
	}
	
	public double montoAPagar() {
		return this.cantidadDias * this.autoEnAlquiler.getPrecioPorDia();
	}
	
	public double montoAReembolsar(LocalDate fechaCancelacion) {
		return this.autoEnAlquiler.getPoliticaDeCancelacion().calcularReembolso(fechaInicio, fechaCancelacion, this.montoAPagar());
	}
}
