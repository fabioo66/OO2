package ar.edu.unlp.objetos.dos.ejercicio2;

public class EmpleadoPlanta extends Empleado{
	private int aniosAntiguedad;
	
	public EmpleadoPlanta(boolean estaCasado, int cantidadHijos, int aniosAntiguedad) {
        super(estaCasado, cantidadHijos);
        this.aniosAntiguedad = aniosAntiguedad;
    }
	
	@Override
	protected double basico() {
		return 50000;
	}
	
	@Override
	protected double adicional() {
		return this.adicionalPorMatrimonio() + this.adicionalPorHijos() + 2000 * this.aniosAntiguedad;
	}
}
