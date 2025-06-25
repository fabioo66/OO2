package ar.edu.unlp.objetos.dos.TerceraFecha_13_07_2024;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class Bolsa extends Item{
	private int capacidad;
	private List<Item> items;

	public Bolsa(String nombre, int espacioQueOcupa, int capacidad) {
		super(nombre, espacioQueOcupa);
		this.capacidad = capacidad;
		this.items = new ArrayList<>();
	}

	@Override
	public boolean guardarItem(Item item) {
		if (capacidad >= item.getEspacioQueOcupa()) {
			this.capacidad -= item.getEspacioQueOcupa();
			this.items.add(item);
			return true;
		}else {
			return this.items.stream().anyMatch(i -> i.guardarItem(item) == true);
		}
	}

	@Override
	public Item buscarItemPorNombre(String nombre) {
	    return this.items.stream()
	        .map(i -> {
	            if (i.getNombre().equals(nombre)) {
	                return i;
	            } else {
	                return i.buscarItemPorNombre(nombre); // llamada recursiva
	            }
	        })
	        .filter(Objects::nonNull)
	        .findFirst()
	        .orElse(null);
	}

	@Override
	public int espacioMaximo() {
	    int maxSubBolsas = this.items.stream()
	                                 .mapToInt(Item::espacioMaximo)
	                                 .max()
	                                 .orElse(0);
	    return Math.max(this.capacidadDisponible(), maxSubBolsas);
	}



	@Override
	public int capacidadDisponible() {
		return this.capacidad + this.items.stream()
	        .mapToInt(Item::capacidadDisponible).sum();
	}

}
