package ar.edu.unlp.objetos.dos.ejercicio22;

public class MixingTank {
	private I2CDriver driver;
	
	public MixingTank(I2CDriver driver) {
		this.driver = driver;
	}
	
	public boolean heatPower(int percentage) {
		return false;
	}
	
	public boolean mixerPower(int percentage) {
		return false;
	}
	
	public boolean purge() {
		return false;
	}
	
	public double upTo() {
		return 0;
	}
	
	public double temperature() {
		return 0;
	}
}
