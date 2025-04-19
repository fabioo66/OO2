package ar.edu.unlp.objetos.dos.ejercicio7;

public class Multiplicando extends Operando{

	@Override
	public void setValor(Calculadora c, double valor) {
		c.setValorAcumulado(c.getValorAcumulado() * valor);
		c.setEstado(new EstadoInicial());
	}

}
