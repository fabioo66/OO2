package ar.edu.unlp.objetos.dos.ejercicio18patrones;

public class DecoratorPermisos extends FileDecorator{

	public DecoratorPermisos(FileComponent component) {
		super(component);
	}
	
	public String prettyPrint() {
		return this.getComponent().prettyPrint() + " - " + this.getPermisos();
	}
}
