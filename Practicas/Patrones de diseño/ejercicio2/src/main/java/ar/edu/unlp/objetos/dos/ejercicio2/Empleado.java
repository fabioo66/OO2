package ar.edu.unlp.objetos.dos.ejercicio2;

public abstract class Empleado {
	private boolean estaCasado;
    private int cantidadHijos;
    
    public Empleado(boolean estaCasado, int cantidadHijos) {
        this.estaCasado = estaCasado;
        this.cantidadHijos = cantidadHijos;
    }
    
    protected abstract double basico();
    protected abstract double adicional();
    
    public double sueldo() {
    	return this.basico() + this.adicional() - this.descuento(this.basico(), this.adicional());
    }
    
    protected double descuento(double basico, double adicional) {
        return 0.13 * basico + 0.05 * adicional;
    }
    
    protected double adicionalPorMatrimonio() {
        return this.estaCasado ? 5000 : 0;
    }

    protected double adicionalPorHijos() {
        return 2000 * this.cantidadHijos;
    }
    
	public boolean isEstaCasado() {
		return estaCasado;
	}
	
	public void setEstaCasado(boolean estaCasado) {
		this.estaCasado = estaCasado;
	}
	
	public int getCantidadHijos() {
		return cantidadHijos;
	}
	
	public void setCantidadHijos(int cantidadHijos) {
		this.cantidadHijos = cantidadHijos;
	}
}
