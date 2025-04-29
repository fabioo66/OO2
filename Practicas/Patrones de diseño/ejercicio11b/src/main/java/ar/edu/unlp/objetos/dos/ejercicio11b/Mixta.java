package ar.edu.unlp.objetos.dos.ejercicio11b;

import java.util.ArrayList;
import java.util.List;

public class Mixta implements Topografia{
	private List<Topografia> topografias;
	
	public Mixta(List<Topografia> lista) {
		if (lista.size() != 4) {
			throw new RuntimeException("Una topografía mixta debe contener exactamente 4 elementos");
		}
		this.topografias = new ArrayList<Topografia>(lista);
	}

	@Override
	public double proporcionAgua() {
		return this.topografias.stream().mapToDouble(t -> t.proporcionAgua()).sum() / 4;
	}

	@Override
	public double proporcionTierra() {
		return this.topografias.stream().mapToDouble(t -> t.proporcionTierra()).sum() / 4;
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

	@Override
	public boolean esIgualPantano() {
		return false;
	}

}
