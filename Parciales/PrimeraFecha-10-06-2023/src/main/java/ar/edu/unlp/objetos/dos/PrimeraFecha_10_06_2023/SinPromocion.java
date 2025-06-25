package ar.edu.unlp.objetos.dos.PrimeraFecha_10_06_2023;

import java.util.List;

public class SinPromocion implements Promocion{

	@Override
	public double calcularMontoConDescuento(List<Seguro> seguros) {
		return seguros.stream().mapToDouble(s -> s.calcularCosto()).sum();
	}

}
