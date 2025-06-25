package ar.edu.unlp.objetos.dos.PrimeraFecha_10_06_2023;

import java.util.List;

public class CampañaExcepcional implements Promocion{

	@Override
	public double calcularMontoConDescuento(List<Seguro> seguros) {
        if (seguros.isEmpty()) return 0;

        double total = seguros.stream()
                             .mapToDouble(Seguro::calcularCosto)
                             .sum();

        double min = seguros.stream()
                           .mapToDouble(Seguro::calcularCosto)
                           .min()
                           .orElse(0);

        return total - (min * 0.5);
    }
}
