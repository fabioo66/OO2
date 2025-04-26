package ar.edu.unlp.objetos.dos.ejercicio9;

import java.time.LocalDate;

public class Flexible implements PoliticaDeCancelacion{

	@Override
	public double calcularReembolso(LocalDate fecha, LocalDate fechaCancelacion, double montoAPagar) {
		return fechaCancelacion.isBefore(fecha) ? montoAPagar : 0;
	}

}
