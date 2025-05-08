package ar.edu.unlp.objetos.dos.ejercicio18patrones;

import java.time.LocalDate;

public abstract class FileDecorator implements FileComponent{
	private FileComponent component;
	
	public FileDecorator(FileComponent component) {
		this.component = component;
	}
		
	@Override
	public String prettyPrint() {
		return this.component.prettyPrint();
	}

	@Override
	public String getNombre() {
		return this.component.getNombre();
	}

	@Override
	public String getExtension() {
		return this.component.getExtension();
	}

	@Override
	public String getTamaño() {
		return this.component.getTamaño();
	}

	@Override
	public LocalDate getFechaCreacion() {
		return this.component.getFechaCreacion();
	}

	@Override
	public LocalDate getFechaModificacion() {
		return this.component.getFechaModificacion();
	}

	@Override
	public String getPermisos() {
		return this.component.getPermisos();
	}
	
	protected FileComponent getComponent() {
		return this.component;
	}
}
