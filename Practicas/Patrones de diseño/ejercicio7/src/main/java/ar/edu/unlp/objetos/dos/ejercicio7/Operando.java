package ar.edu.unlp.objetos.dos.ejercicio7;

public abstract class Operando implements Estado{

	@Override
	public String getResultado(Calculadora c) {
		c.setEstado(new EstadoError());
		return "Error";
	}

	@Override
	public void borrar(Calculadora c) {
		c.setValorAcumulado(0);
		c.setEstado(new EstadoInicial());
	}

	@Override
	public abstract void setValor(Calculadora c, double valor);

	@Override
	public void mas(Calculadora c) {
		c.setEstado(new EstadoError());
	}

	@Override
	public void menos(Calculadora c) {
		c.setEstado(new EstadoError());
	}

	@Override
	public void por(Calculadora c) {
		c.setEstado(new EstadoError());
	}

	@Override
	public void dividido(Calculadora c) {
		c.setEstado(new EstadoError());
	}

}
