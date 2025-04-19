package ar.edu.unlp.objetos.dos.ejercicio7;

public class EstadoError implements Estado{

	@Override
	public String getResultado(Calculadora c) {
		return "Error";
	}

	@Override
	public void borrar(Calculadora c) {
		c.setValorAcumulado(0);
		c.setEstado(new EstadoInicial());
	}

	@Override
	public void setValor(Calculadora c, double valor) {
	}

	@Override
	public void mas(Calculadora c) {
	}

	@Override
	public void menos(Calculadora c) {
	}

	@Override
	public void por(Calculadora c) {
	}

	@Override
	public void dividido(Calculadora c) {
	}

}
