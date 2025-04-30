package ar.edu.unlp.objetos.dos.ejercicio14;

public class Inmueble extends Prenda{
	private String direccion;
	private int superficie;
	private double costoMetrosCuadrados;
	
	public Inmueble(String direccion, int superficie, double costoMetrosCuadrados) {
		super(0.2);
		this.direccion = direccion;
		this.superficie = superficie;
		this.costoMetrosCuadrados = costoMetrosCuadrados;
	}

	@Override
	public double calcularValor() {
		return this.superficie * this.costoMetrosCuadrados;
	}
}
