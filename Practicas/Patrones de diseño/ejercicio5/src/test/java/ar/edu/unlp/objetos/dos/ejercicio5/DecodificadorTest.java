package ar.edu.unlp.objetos.dos.ejercicio5;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DecodificadorTest {
	private Decodificador decodificador;
	private Pelicula thor;
	private Pelicula rocky;
	private Pelicula capitanAmerica;
	private Pelicula ironMan;
	private Pelicula dunkirk;
	private Pelicula rambo;
	
	@BeforeEach
	public void setUp() {
		this.decodificador = new Decodificador();

		this.thor = new Pelicula("Thor", 2007, 7.9);
		this.rocky = new Pelicula("Rocky", 1976, 8.1);
		this.capitanAmerica = new Pelicula("Capitan america", 2016, 7.8);
		this.ironMan = new Pelicula("Iron man", 2010, 7.9);
		this.dunkirk = new Pelicula("Dunkirk", 2017, 7.9);
		this.rambo = new Pelicula("Rambo", 1979, 7.8);
		
		this.thor.agregarSimilar(this.capitanAmerica);
		this.thor.agregarSimilar(this.ironMan);
		this.capitanAmerica.agregarSimilar(this.ironMan);
		this.rocky.agregarSimilar(this.rambo);
		
		this.decodificador.agregarPeliculaReproducida(this.thor);
		this.decodificador.agregarPeliculaReproducida(this.rocky);
		
		this.decodificador.agregarPeliculaGrilla(this.thor);
		this.decodificador.agregarPeliculaGrilla(this.rocky);
		this.decodificador.agregarPeliculaGrilla(this.capitanAmerica);
		this.decodificador.agregarPeliculaGrilla(this.ironMan);
		this.decodificador.agregarPeliculaGrilla(this.dunkirk);
		this.decodificador.agregarPeliculaGrilla(this.rambo);
	}
	
	@Test
	public void sugerenciaPorNovedadTest() {
		this.decodificador.setEstrategiaDeSugerencia(new SugerenciaPorNovedad());
		
		List<Pelicula> sugerencias = this.decodificador.sugerirPeliculas();
		
		assertTrue(sugerencias.contains(this.dunkirk));
		assertTrue(sugerencias.contains(this.capitanAmerica));
		assertTrue(sugerencias.contains(this.ironMan));
	}
	
	@Test
	public void sugerenciaPorSimilaridadTest() {
		this.decodificador.setEstrategiaDeSugerencia(new SugerenciaPorSimilaridad());
		
		List<Pelicula> sugerencias = this.decodificador.sugerirPeliculas();
		
		assertTrue(sugerencias.contains(this.rambo));
		assertTrue(sugerencias.contains(this.capitanAmerica));
		assertTrue(sugerencias.contains(this.ironMan));
	}
	
	@Test
	public void sugerenciaPorPuntaje() {
		this.decodificador.setEstrategiaDeSugerencia(new SugerenciaPorPuntaje());
		
		List<Pelicula> sugerencias = this.decodificador.sugerirPeliculas();
		
		assertTrue(sugerencias.contains(this.dunkirk));
		assertTrue(sugerencias.contains(this.capitanAmerica));
		assertTrue(sugerencias.contains(this.ironMan));
	}
}
