package ar.edu.unlp.objetos.dos.ejercicio18patrones;

public class DecoratorNombre extends FileDecorator{
	
	public DecoratorNombre(FileComponent component) {
		super(component);
	}
	
	public String prettyPrint() {
		return super.prettyPrint();
	}
}
