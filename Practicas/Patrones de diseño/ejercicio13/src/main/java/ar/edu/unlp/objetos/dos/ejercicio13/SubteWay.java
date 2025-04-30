package ar.edu.unlp.objetos.dos.ejercicio13;

public class SubteWay {
	private SandwichBuilder sandwichBuilder;
	
	public SubteWay() {
		this.sandwichBuilder = new BuilderClasico();
	}

	public SandwichBuilder getSandwichBuilder() {
		return sandwichBuilder;
	}

	public void setSandwichBuilder(SandwichBuilder sandwichBuilder) {
		this.sandwichBuilder = sandwichBuilder;
	}
	
	public Sandwich construirSanguche() {
		this.sandwichBuilder.reset();
		this.sandwichBuilder.construirPan();
		this.sandwichBuilder.construirAderezo();
		this.sandwichBuilder.construirPrincipal();
		this.sandwichBuilder.construirAdicional();
		return this.sandwichBuilder.getSandwich();
	}
}
