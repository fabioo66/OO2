package ar.edu.unlp.objetos.dos.ejercicio9;

public class AutoEnAlquiler {
	private double precioPorDia;
	private int cantidadPlazas;
	private String marca;
	private PoliticaDeCancelacion politicaDeCancelacion;
	
	public AutoEnAlquiler(double precioPorDia, int cantidadPlazas, String marca) {
		this.precioPorDia = precioPorDia;
		this.cantidadPlazas = cantidadPlazas;
		this.marca = marca;
	}
	
	public void setPoliticaDeCancelacion(PoliticaDeCancelacion politicaDeCancelacion) {
		this.politicaDeCancelacion = politicaDeCancelacion;
	}

	public double getPrecioPorDia() {
		return this.precioPorDia;
	}
	
	public PoliticaDeCancelacion getPoliticaDeCancelacion() {
		return this.politicaDeCancelacion;
	}

}
