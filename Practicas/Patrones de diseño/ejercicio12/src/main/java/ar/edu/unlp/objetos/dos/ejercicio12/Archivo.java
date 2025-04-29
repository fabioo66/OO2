package ar.edu.unlp.objetos.dos.ejercicio12;

import java.time.LocalDate;

public class Archivo extends ElementoFileSystem{
	private int tamano;
	
	public Archivo(String nombre, LocalDate fechaDeCreacion, int tamano) {
		super(nombre, fechaDeCreacion);
		this.tamano = tamano;
	}

	@Override
	public int tamanoTotalOcupado() {
		return this.tamano;
	}
	
	@Override
	public Archivo archivoMasGrande() {
		return this;
	}

	@Override
	public Archivo archivoMasNuevo() {
		return this;
	}
	
	@Override
	public Archivo buscar(String nombre) {
		return this.getNombre().equals(nombre) ? this : null;
	}

	@Override
	public String listadoDeContenidoDesde(String path) {
		return path + this.getNombre() + "\n";
	}
	
	public int getTamano() {
		return this.tamano;
	}
}
