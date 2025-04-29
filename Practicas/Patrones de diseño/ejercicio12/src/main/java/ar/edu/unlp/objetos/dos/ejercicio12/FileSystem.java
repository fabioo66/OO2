package ar.edu.unlp.objetos.dos.ejercicio12;

import java.util.List;

public class FileSystem {
	private Directorio raiz;
	
	public FileSystem(Directorio raiz) {
		this.raiz = raiz;
	}
	
	public int tamanoTotalOcupado() {
		return this.raiz.tamanoTotalOcupado();
	}
	
	public Archivo archivoMasGrande() {
		return this.raiz.archivoMasGrande();
	}
	
	public Archivo archivoMasNuevo() {
		return this.raiz.archivoMasNuevo();
	}
	
	public ElementoFileSystem buscar(String nombre) {
		return this.raiz.buscar(nombre);
	}

	public List<ElementoFileSystem> buscarTodos(String nombre) {
		return this.raiz.buscarTodos(nombre);
	}

	public String listadoDeContenido() {
		return this.raiz.listadoDeContenido();
	}
}
