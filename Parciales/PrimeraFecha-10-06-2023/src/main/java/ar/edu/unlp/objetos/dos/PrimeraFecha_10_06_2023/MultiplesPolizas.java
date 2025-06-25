package ar.edu.unlp.objetos.dos.PrimeraFecha_10_06_2023;

import java.util.List;

public class MultiplesPolizas implements Promocion{

	@Override
	public double calcularMontoConDescuento(List<Seguro> seguros) {
		if (seguros.size() >= 2) {
			return seguros.stream().mapToDouble(s -> s.calcularCosto() * 0.1).sum();
		}
		return seguros.stream().mapToDouble(s -> s.calcularCosto()).sum();
	}

}
