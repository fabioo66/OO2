package ar.edu.unlp.objetos.dos.ejercicio15;

import java.util.ArrayList;
import java.util.List;

public class Equipo {
	private List<Componente> componentes;
	
	public Equipo() {
		this.componentes = new ArrayList<>();
	}
	
	public void agregarComponente(Componente componente) {
		this.componentes.add(componente);
	}
	
	public double calcularConsumo() {
		return this.componentes.stream().mapToDouble(c -> c.getConsumo()).sum();
	}
	
	public double calcularPrecio() {
		double precioTotal = this.componentes.stream().mapToDouble(c -> c.getPrecio()).sum();
		return precioTotal + (precioTotal * 0.21);
	}
}
