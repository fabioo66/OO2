package ar.edu.unlp.objetos.dos.ejercicio14;

public class Automovil extends Prenda{
	private int modelo;
	private int kilometraje;
	private double costoCeroKm;
	
	public Automovil(int modelo, int kilometraje, double costoCeroKm) {
		super(0.7);
		this.modelo = modelo;
		this.kilometraje = kilometraje;
		this.costoCeroKm = costoCeroKm;
	}

	@Override
	public double calcularValor() {
		int anios = java.time.Year.now().getValue() - this.modelo;
		return this.costoCeroKm * Math.pow(0.9, anios);
	}
}
