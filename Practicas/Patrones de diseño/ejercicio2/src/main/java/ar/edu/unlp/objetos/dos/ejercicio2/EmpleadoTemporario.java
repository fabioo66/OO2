package ar.edu.unlp.objetos.dos.ejercicio2;

public class EmpleadoTemporario extends Empleado{
	private int horasTrabajadas;
	
	public EmpleadoTemporario(boolean estaCasado, int cantidadHijos, int horasTrabajadas) {
        super(estaCasado, cantidadHijos);
        this.horasTrabajadas = horasTrabajadas;
    }
	
	@Override
	protected double basico() {
		return 20000 + this.horasTrabajadas * 300;
	}
	
	@Override
	protected double adicional() {
		return this.adicionalPorMatrimonio() + this.adicionalPorHijos();
	}
}