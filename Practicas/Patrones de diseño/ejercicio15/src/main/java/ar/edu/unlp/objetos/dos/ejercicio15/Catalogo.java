package ar.edu.unlp.objetos.dos.ejercicio15;

import java.util.ArrayList;
import java.util.List;

public class Catalogo {
	private List<Componente> componentes;
	
	public Catalogo(){
		this.componentes = new ArrayList<>();
	}
	
	public void agregarComponente(Componente componente) {
		this.componentes.add(componente);
	}
	
	public Componente getComponente(String descripcion) {
		return componentes.stream()
                .filter(c -> c.getDescripcion().equalsIgnoreCase(descripcion))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("No se encontró el componente: " + descripcion));
	}
}
