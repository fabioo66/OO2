package ar.edu.unlp.objetos.dos.PrimeraFecha_10_06_2023;

public class SeguroTerceroCompleto extends Seguro{

	public SeguroTerceroCompleto(Vehiculo vehiculo) {
		super(vehiculo);
	}

	@Override
	protected double costoDeVida() {
		return 5000 * this.getVehiculo().getCapacidad();
	}

	@Override
	protected double costoPorDaños() {
		if (this.getVehiculo().antiguedadMayorACuatro()) {
			return 4000 * this.getVehiculo().getAntiguedad();
		}else {
			return 10000;
		}
	}

	@Override
	protected double adicionalCobertura() {
		return 10000;
	}

}
