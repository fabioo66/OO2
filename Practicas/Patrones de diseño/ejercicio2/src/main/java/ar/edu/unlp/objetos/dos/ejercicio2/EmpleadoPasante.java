package ar.edu.unlp.objetos.dos.ejercicio2;

public class EmpleadoPasante extends Empleado{
	private int examenesRendidos;
	
	public EmpleadoPasante(int examenesRendidos) {
        super(false, 0); 
        this.examenesRendidos = examenesRendidos;
    }
	
	@Override
	protected double basico() {
		return 20000;
	}
	
	@Override
	protected double adicional() {
		return this.examenesRendidos * 2000;
	}
}
