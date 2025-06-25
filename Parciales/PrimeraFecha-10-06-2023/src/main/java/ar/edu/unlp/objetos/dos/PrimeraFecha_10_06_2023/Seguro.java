package ar.edu.unlp.objetos.dos.PrimeraFecha_10_06_2023;

public abstract class Seguro {
	private Vehiculo vehiculo;

	public Seguro(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}
	
	public Vehiculo getVehiculo() {
		return this.vehiculo;
	}

	protected abstract double costoDeVida();
	protected abstract double costoPorDaños();
	protected abstract double adicionalCobertura();
	
	// Template method
	protected double costoCobertura() {
		return (this.vehiculo.getValor() * 0.5) + this.adicionalCobertura();
	}
	
	// Template method
	public double calcularCosto() {
		return this.costoDeVida() + this.costoPorDaños() + this.costoCobertura();
	}
}
