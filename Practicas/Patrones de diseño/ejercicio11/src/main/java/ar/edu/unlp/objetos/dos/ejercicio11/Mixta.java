package ar.edu.unlp.objetos.dos.ejercicio11;

import java.util.ArrayList;
import java.util.List;

public class Mixta implements Topografia{
	private List<Topografia> topografias;
	
	public Mixta(Topografia t1, Topografia t2, Topografia t3, Topografia t4) {
		this.topografias = new ArrayList<Topografia>();
		this.topografias.add(t1);
		this.topografias.add(t2);
		this.topografias.add(t3);
		this.topografias.add(t4);
	}

	@Override
	public double proporcionAgua() {
		return this.topografias.stream().mapToDouble(t -> t.proporcionAgua()).sum() / 4;
	}

	@Override
	public double proporcionTierra() {
		return 1 - this.proporcionAgua();
	}

	@Override
	public boolean esIgual(Topografia topografia) {
		return topografia.esIgualMixta(this);
	}

	@Override
	public boolean esIgualAgua() {
		return false;
	}

	@Override
	public boolean esIgualTierra() {
		return false;
	}

	@Override
	public boolean esIgualMixta(Mixta otraMixta) {
		return java.util.stream.IntStream.range(0, 4)
	            .allMatch(i -> this.topografias.get(i).esIgual(otraMixta.getTopografias().get(i)));
	}
	
	public List<Topografia> getTopografias(){
		return this.topografias;
	}

}
