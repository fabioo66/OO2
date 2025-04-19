package ar.edu.unlp.objetos.dos.ejercicio7;

public class Calculadora {
	private double valorAcumulado;
	private Estado estado;
	
	public Calculadora() {
		this.valorAcumulado = 0;
		this.estado = new EstadoInicial();
	}
	
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
	public String getResultado() {
		return this.estado.getResultado(this);
	}
	
	public void borrar() {
		this.estado.borrar(this);
	}
	
	public void setValor(double valor) {
		this.estado.setValor(this, valor);
	}
	
	public void mas() {
		this.estado.mas(this);
	}
	
	public void menos() {
		this.estado.menos(this);
	}
	
	public void por() {
		this.estado.por(this);
	}
	
	public void dividido() {
		this.estado.dividido(this);
	}
	
	public double getValorAcumulado() {
		return this.valorAcumulado;
	}
	
	public void setValorAcumulado (double unValor) {
    	this.valorAcumulado = unValor;
    }
	
	/*public void sumarValorAcumulado(double valor) {
		this.valorAcumulado += valor;
	}*/
}
