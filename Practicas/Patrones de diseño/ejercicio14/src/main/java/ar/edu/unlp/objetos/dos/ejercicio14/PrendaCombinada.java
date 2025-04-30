package ar.edu.unlp.objetos.dos.ejercicio14;

import java.util.ArrayList;
import java.util.List;

public class PrendaCombinada extends Prenda{
	private List<Prenda> prendas;

	public PrendaCombinada() {
		super(0.5);
		this.prendas = new ArrayList<>();
	}

	@Override
	public double calcularValor() {
		return this.prendas.stream().mapToDouble(p -> p.calcularValor()).sum();
	}
	
	public void agregarPrenda(Prenda prenda) {
		this.prendas.add(prenda);
	}
}
