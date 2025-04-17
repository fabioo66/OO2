package ar.edu.unlp.objetos.dos.ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class Decodificador {
	private List<Pelicula> grillaPeliculas;
	private List<Pelicula> peliculasReproducidas;
	private EstrategiaDeSugerencia estrategiaDeSugerencia;
	
	public Decodificador() {
		this.grillaPeliculas = new ArrayList();
		this.peliculasReproducidas = new ArrayList();
	}
	
	public void setEstrategiaDeSugerencia(EstrategiaDeSugerencia estrategiaDeSugerencia) {
		this.estrategiaDeSugerencia = estrategiaDeSugerencia;
	}
	
	public boolean fueReproducida(Pelicula pelicula) {
		return this.peliculasReproducidas.contains(pelicula);
	}

	public void agregarPeliculaGrilla(Pelicula pelicula) {
		this.grillaPeliculas.add(pelicula);
	}
	
	public void agregarPeliculaReproducida(Pelicula pelicula) {
		this.peliculasReproducidas.add(pelicula);
	}

	public List<Pelicula> sugerirPeliculas() {
		return this.estrategiaDeSugerencia.sugerirPeliculas(this);
	}

	public List<Pelicula> getGrillaPeliculas() {
		return this.grillaPeliculas;
	}

	public List<Pelicula> getPeliculasReproducidas() {
		return this.peliculasReproducidas;
	}

	public EstrategiaDeSugerencia getEstrategiaDeSugerencia() {
		return estrategiaDeSugerencia;
	}
}
