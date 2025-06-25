package ar.edu.unlp.objetos.dos.PrimeraFecha_10_06_2023;

import java.util.ArrayList;
import java.util.List;

public class Persona {
	private int edad;
	private Promocion promocion;
	private List<Seguro> seguros;
	
	public Persona(int edad, Promocion promocion) {
		this.edad = edad;
		this.promocion = promocion;
		this.seguros = new ArrayList<>();
	}

	public int getEdad() {
		return this.edad;
	}
	
	public void setStrategy(Promocion promocion) {
		this.promocion = promocion;
	}
}
