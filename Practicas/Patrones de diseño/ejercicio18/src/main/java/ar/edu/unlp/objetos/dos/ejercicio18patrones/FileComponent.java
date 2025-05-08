package ar.edu.unlp.objetos.dos.ejercicio18patrones;

import java.time.LocalDate;

public interface FileComponent {
	
	public String prettyPrint();
	
	public String getNombre();
	
	public String getExtension();
	
	public String getTamaño();
	
	public LocalDate getFechaCreacion();
	
	public LocalDate getFechaModificacion();
	
	public  String getPermisos();
	
}
