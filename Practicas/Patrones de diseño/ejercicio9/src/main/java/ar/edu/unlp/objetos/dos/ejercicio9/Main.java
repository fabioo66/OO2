package ar.edu.unlp.objetos.dos.ejercicio9;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		AutoEnAlquiler auto = new AutoEnAlquiler(5000, 4, "Toyota"); 
		auto.setPoliticaDeCancelacion(new Flexible());
		
		Reserva reserva = new Reserva(7, new Usuario("Fabio"), auto, LocalDate.of(2025, 4, 26));
		//cancelacion con plazo finalizado
		System.out.println(reserva.montoAReembolsar(LocalDate.of(2025, 4, 28)));
		//cancelacion antes de finalizar
		System.out.println(reserva.montoAReembolsar(LocalDate.of(2025, 4, 24)));
		
		auto.setPoliticaDeCancelacion(new Moderada());
		//cancelacion una semana antes
		System.out.println(reserva.montoAReembolsar(LocalDate.of(2025, 4, 18)));
		//cancelacion 4 dias antes
		System.out.println(reserva.montoAReembolsar(LocalDate.of(2025, 4, 22)));
		//cancelacion 1 dia ante
		System.out.println(reserva.montoAReembolsar(LocalDate.of(2025, 4, 25)));
	}

}
