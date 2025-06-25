package ar.edu.unlp.objetos.dos.PrimeraFecha_10_06_2023;

public class SeguroTodoRiesgo extends Seguro{

	public SeguroTodoRiesgo(Vehiculo vehiculo) {
		super(vehiculo);
	}

	@Override
	protected double costoDeVida() {
		return 9000 * this.getVehiculo().getAntiguedad();
	}

	@Override
	protected double costoPorDaños() {
		return 100000/this.getVehiculo().edadConductor();
	}

	@Override
	protected double adicionalCobertura() {
		return 1000 * this.getVehiculo().getAntiguedad();
	}

}
