package ar.edu.unlp.objetos.dos.ejercicio14;

public abstract class Prenda {
	private double coeficienteDeLiquidez;
	
	public Prenda(double coeficienteDeLiquidez) {
		this.coeficienteDeLiquidez = coeficienteDeLiquidez;
	}
	
	public abstract double calcularValor();
	
	public double calcularValorPrendario() {
		return this.coeficienteDeLiquidez * this.calcularValor();
	}
}
