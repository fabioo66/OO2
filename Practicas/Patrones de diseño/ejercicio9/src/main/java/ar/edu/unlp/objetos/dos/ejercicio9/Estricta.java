package ar.edu.unlp.objetos.dos.ejercicio9;

import java.time.LocalDate;

public class Estricta implements PoliticaDeCancelacion{

	@Override
	public double calcularReembolso(LocalDate fecha, LocalDate fechaCancelacion, double montoAPagar) {
		return 0;
	}

}
