package ar.edu.unlp.objetos.dos.ejercicio13;

public class Script {

	public static void main(String[] args) {
		SubteWay director = new SubteWay();
		
		Sandwich clasico = director.construirSanguche();
		System.out.println(clasico.calcularPrecio());

		director.setSandwichBuilder(new BuilderVegetariano());
		Sandwich vegetariano = director.construirSanguche();
		System.out.println(vegetariano.calcularPrecio());
		
		director.setSandwichBuilder(new BuilderVegano());
		Sandwich vegano = director.construirSanguche();
		System.out.println(vegano.calcularPrecio());
		
		director.setSandwichBuilder(new BuilderSinTacc());
		Sandwich sinTacc = director.construirSanguche();
		System.out.println(sinTacc.calcularPrecio());
	}
}
