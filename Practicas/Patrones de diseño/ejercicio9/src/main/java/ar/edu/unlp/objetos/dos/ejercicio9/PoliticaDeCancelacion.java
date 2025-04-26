package ar.edu.unlp.objetos.dos.ejercicio9;

import java.time.LocalDate;

public interface PoliticaDeCancelacion {
	
	public double calcularReembolso(LocalDate fecha, LocalDate fechaCancelacion, double montoAPagar);
}
