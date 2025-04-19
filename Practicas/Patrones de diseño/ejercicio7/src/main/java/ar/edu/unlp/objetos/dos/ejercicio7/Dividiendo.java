package ar.edu.unlp.objetos.dos.ejercicio7;

public class Dividiendo extends Operando{

	@Override
	public void setValor(Calculadora c, double valor) {
		if (valor == 0) {
			c.setEstado(new EstadoError());
		}else {
			c.setValorAcumulado(c.getValorAcumulado() / valor);
			c.setEstado(new EstadoInicial());
		}
	}
}
