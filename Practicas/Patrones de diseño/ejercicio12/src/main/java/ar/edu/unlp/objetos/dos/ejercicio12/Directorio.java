package ar.edu.unlp.objetos.dos.ejercicio12;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class Directorio extends ElementoFileSystem{
	private List<ElementoFileSystem> contenido;
	
	public Directorio(String nombre, LocalDate fechaDeCreacion) {
		super(nombre, fechaDeCreacion);
		this.contenido = new ArrayList<>();
	}

	@Override
	public int tamanoTotalOcupado() {
		return 32 * 1024 + this.contenido.stream().mapToInt(e -> e.tamanoTotalOcupado()).sum();
	}
	
	@Override
	public Archivo archivoMasGrande() {
		return this.contenido.stream()
					.map(ElementoFileSystem::archivoMasGrande)
					.filter(Objects::nonNull)
					.max(Comparator.comparingInt(Archivo::getTamano))
					.orElse(null);
	}
	
	@Override
	public Archivo archivoMasNuevo() {
		return this.contenido.stream().map(ElementoFileSystem::archivoMasNuevo).max((e1, e2)-> e1.getFechaDeCreacion().compareTo(e2.getFechaDeCreacion())).orElse(null);
	}
	
	@Override
	public ElementoFileSystem buscar(String nombre) {
		if (this.getNombre().equals(nombre)) {
			return this;
		}else {
			return this.contenido.stream()
			        .map(e -> e.buscar(nombre))
			        .filter(Objects::nonNull)
			        .findFirst()
			        .orElse(null);
		}
	    //no anda
		//return this.getNombre().equals(nombre) ? this : this.contenido.stream().map(e -> e.buscar(nombre)).findFirst().orElse(null);
	}
	
	//no se si anda
	public List<ElementoFileSystem> buscarTodos(String nombre){
		return this.contenido.stream()
				.map(e -> e.buscar(nombre))
				.filter(Objects::nonNull)
				.toList();
	}

	public List<ElementoFileSystem> getContenido(){
		return this.contenido;
	}

	public String listadoDeContenidoDesde(String pathActual) {
		StringBuilder sb = new StringBuilder();
		String nuevoPath = pathActual + this.getNombre();
		sb.append(nuevoPath).append("\n");

		this.contenido.forEach(e -> {
			sb.append(e.listadoDeContenidoDesde(nuevoPath + "/"));
		});

		return sb.toString();
	}
}
