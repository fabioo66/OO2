package ar.edu.unlp.objetos.dos.ejercicio18patrones;

public class DecoratorFechaCreacion extends FileDecorator{

	public DecoratorFechaCreacion(FileComponent component) {
		super(component);
	}
	
	public String prettyPrint() {
		return this.getComponent().prettyPrint() + " - " + this.getFechaCreacion();
	}
}
