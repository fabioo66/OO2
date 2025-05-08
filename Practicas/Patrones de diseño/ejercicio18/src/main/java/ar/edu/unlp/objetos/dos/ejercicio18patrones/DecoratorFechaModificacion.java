package ar.edu.unlp.objetos.dos.ejercicio18patrones;

public class DecoratorFechaModificacion extends FileDecorator{

	public DecoratorFechaModificacion(FileComponent component) {
		super(component);
	}
	
	public String prettyPrint() {
		return this.getComponent().prettyPrint() + " - " + this.getFechaModificacion();
	}
}
