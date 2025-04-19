package ar.edu.unlp.objetos.dos.ejercicio7;

public class EstadoInicial implements Estado{

	@Override
	public String getResultado(Calculadora c) {
		return Double.toString(c.getValorAcumulado());
	}

	@Override
	public void borrar(Calculadora c) {
		c.setValorAcumulado(0);
		c.setEstado(new EstadoInicial());
	}

	@Override
	public void setValor(Calculadora c, double valor) {
		c.setValorAcumulado(valor);
	}

	@Override
	public void mas(Calculadora c) {
		c.setEstado(new Sumando());
	}

	@Override
	public void menos(Calculadora c) {
		c.setEstado(new Restando());
	}

	@Override
	public void por(Calculadora c) {
		c.setEstado(new Multiplicando());
	}

	@Override
	public void dividido(Calculadora c) {
		c.setEstado(new Dividiendo());
	}
}
