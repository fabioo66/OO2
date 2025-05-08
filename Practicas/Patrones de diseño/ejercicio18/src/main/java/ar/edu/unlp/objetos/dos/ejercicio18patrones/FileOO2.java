package ar.edu.unlp.objetos.dos.ejercicio18patrones;

import java.time.LocalDate;

public class FileOO2 implements FileComponent{
	private String nombre;
	private String extension;
	private String tamaño;
	private LocalDate fechaCreacion;
	private LocalDate fechaModificacion;
	private String permisos;
	
	public FileOO2(String nombre, String extension, String tamaño, LocalDate fechaCreacion, LocalDate fechaModificacion, String permisos) {
		this.nombre = nombre;
		this.extension = extension;
		this.tamaño = tamaño;
		this.fechaCreacion = fechaCreacion;
		this.fechaModificacion = fechaModificacion;
		this.permisos = permisos;
	}

	@Override
	public String getNombre() {
		return nombre;
	}
	
	@Override
	public String getExtension() {
		return extension;
	}
	
	@Override
	public String getTamaño() {
		return tamaño;
	}
	
	@Override
	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}
	
	@Override
	public LocalDate getFechaModificacion() {
		return fechaModificacion;
	}
	
	@Override
	public String getPermisos() {
		return permisos;
	}
	
	@Override
	public String prettyPrint() {
		return this.getNombre();
	}
	
}
