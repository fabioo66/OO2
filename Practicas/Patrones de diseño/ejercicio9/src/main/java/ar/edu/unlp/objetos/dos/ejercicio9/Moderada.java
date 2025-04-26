package ar.edu.unlp.objetos.dos.ejercicio9;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Moderada implements PoliticaDeCancelacion{

	@Override
	public double calcularReembolso(LocalDate fecha, LocalDate fechaCancelacion, double montoAPagar) {
		long dias = ChronoUnit.DAYS.between(fechaCancelacion, fecha);
		
		if (dias >= 7) {
			return montoAPagar;
		}else if (dias >= 2) {
			return montoAPagar / 2;
		}else {
			return 0;
		}
	}

}
