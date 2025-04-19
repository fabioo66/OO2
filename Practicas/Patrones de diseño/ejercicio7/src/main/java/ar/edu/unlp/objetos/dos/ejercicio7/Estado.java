package ar.edu.unlp.objetos.dos.ejercicio7;

public interface Estado {
	
	public String getResultado(Calculadora c);
	public void borrar(Calculadora c);
	public void setValor(Calculadora c, double valor);
	public void mas(Calculadora c);
	public void menos(Calculadora c);
	public void por(Calculadora c);
	public void dividido(Calculadora c);
}
