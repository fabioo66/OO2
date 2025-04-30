package ar.edu.unlp.objetos.dos.ejercicio14;

import java.time.LocalDate;

public class ScriptGarantias {

	public static void main(String[] args) {
		Alquiler alquiler = new Alquiler(LocalDate.of(2025, 6, 25), LocalDate.of(2028, 6, 25), 240000);
		System.out.println("Valor alquiler = " + alquiler.calcularValor());
		Automovil automovil = new Automovil(2011, 300000, 15000);
		System.out.println("Valor automovil = " + automovil.calcularValor());
		
		PrendaCombinada prendaCombinada = new PrendaCombinada();
		prendaCombinada.agregarPrenda(alquiler);
		prendaCombinada.agregarPrenda(automovil);
		System.out.println("Valor Prendario = " + prendaCombinada.calcularValorPrendario());
	}
}
