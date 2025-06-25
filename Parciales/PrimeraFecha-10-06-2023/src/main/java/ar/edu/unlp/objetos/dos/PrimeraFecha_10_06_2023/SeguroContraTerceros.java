package ar.edu.unlp.objetos.dos.PrimeraFecha_10_06_2023;

public class SeguroContraTerceros extends Seguro{

	public SeguroContraTerceros(Vehiculo vehiculo) {
		super(vehiculo);
	}

	@Override
	protected double costoDeVida() {
		return 100 * this.getVehiculo().edadConductor();
	}

	@Override
	protected double costoPorDaños() {
		return 1000 + (this.getVehiculo().getValor() * 0.01);
	}

	@Override
	protected double adicionalCobertura() {
		return 0;
	}

}
