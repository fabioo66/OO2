package ar.edu.unlp.objetos.dos.PrimeraFecha_10_06_2023;

public class Vehiculo {
	private double valor;
	private int capacidad;
	private int antiguedad;
	private Persona conductor;
	
	public Vehiculo(double valor, int capacidad, int antiguedad, Persona conductor) {
		this.valor = valor;
		this.capacidad = capacidad;
		this.antiguedad = antiguedad;
		this.conductor = conductor;
	}
	
	public Persona getConductor() {
		return this.conductor;
	}
	
	public int edadConductor() {
		return this.conductor.getEdad();
	}
	
	public double getValor() {
		return this.valor;
	}
	
	public int getCapacidad() {
		return this.capacidad;
	}
	
	public int getAntiguedad() {
		return this.antiguedad;
	}
	
	public boolean antiguedadMayorACuatro() {
		return this.antiguedad > 4;
	}
}
