package ar.edu.unlp.objetos.dos.ejercicio18patrones;

public class DecoratorTamaño extends FileDecorator{

	public DecoratorTamaño(FileComponent component) {
		super(component);
	}
	
	public String prettyPrint() {
		return this.getComponent().prettyPrint() + " - " + this.getTamaño();
	}
}
