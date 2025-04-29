package ar.edu.unlp.objetos.dos.ejercicio12;

import java.time.LocalDate;
import java.util.List;

public abstract class ElementoFileSystem {
	private String nombre;
	private LocalDate fechaDeCreacion;
	
	public ElementoFileSystem(String nombre, LocalDate fechaDeCreacion) {
		this.nombre = nombre;
		this.fechaDeCreacion = fechaDeCreacion;
	}
	
	public abstract int tamanoTotalOcupado();
	public abstract Archivo archivoMasGrande();
	public abstract Archivo archivoMasNuevo();
	public abstract ElementoFileSystem buscar(String nombre);
	public abstract String listadoDeContenidoDesde(String path);

	public String listadoDeContenido() {
		return this.listadoDeContenidoDesde("/");
	}

	public String getNombre() {
		return this.nombre;
	}

	public LocalDate getFechaDeCreacion() {
		return this.fechaDeCreacion;
	}
}
