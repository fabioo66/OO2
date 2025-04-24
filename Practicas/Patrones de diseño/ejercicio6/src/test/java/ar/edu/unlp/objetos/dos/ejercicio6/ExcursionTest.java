package ar.edu.unlp.objetos.dos.ejercicio6;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ExcursionTest {
	private Excursion excursion;
	private List<Usuario> listaInscriptos;
	private List<Usuario> listaEnEspera;

	private Usuario usuario1;
	private Usuario usuario2;
	private Usuario usuario3;

	@BeforeEach
	public void setUp() {
		this.excursion = new Excursion("Dos días en kayak bajando el Paraná", LocalDate.of(2023, 10, 1), LocalDate.of(2023, 10, 2), "La Plata", 20000, 1, 2);

		this.usuario1 = new Usuario("Juan", "Pérez", "juanperez@gmail.com");
		this.usuario2 = new Usuario("María", "Gómez", "mariagomez@gmail.com");
		this.usuario3 = new Usuario("Pedro", "López", "pedrolopez@gmail.com");
	}

	@Test
	public void cambioAEstadoDefinitivaTest() {
		assertTrue(this.excursion.getEstadoDeInscripcion() instanceof Provisoria);
		
		this.excursion.inscribirUsuario(this.usuario1);
		
		assertTrue(this.excursion.getEstadoDeInscripcion() instanceof Definitiva);
	}
	
	@Test
	public void cambioAEstadoCompletaTest() {
		this.excursion.inscribirUsuario(this.usuario1);
		this.excursion.inscribirUsuario(this.usuario2);
		
		assertTrue(this.excursion.getEstadoDeInscripcion() instanceof Completa);
	}
	
	@Test
	public void agregarEnEsperaTest() {
		assertEquals(0, this.excursion.getEnEspera().size());
		
		this.excursion.inscribirUsuario(this.usuario1);
		this.excursion.inscribirUsuario(this.usuario2);
		this.excursion.inscribirUsuario(this.usuario3);
		
		assertEquals(1, this.excursion.getEnEspera().size());
	}
	
	@Test
	public void obtenerInformacionProvisoriaTest() {
		String info = this.excursion.obtenerInformacion();
		assertTrue(info.contains("cupo mínimo"));
		assertTrue(info.contains("usuarios faltantes"));
	}
	
	@Test
	public void obtenerInformacionDefinitivaTest() {
		this.excursion.inscribirUsuario(this.usuario1);
		String info = this.excursion.obtenerInformacion();
		assertTrue(info.contains("cupo maximo"));
	}
	
	@Test
	public void obtenerInformacionCompletaTest() {
		this.excursion.inscribirUsuario(usuario1);
		this.excursion.inscribirUsuario(usuario2);
		String info = this.excursion.obtenerInformacion();
		assertFalse(info.contains("usuarios faltantes"));
		assertFalse(info.contains(usuario1.getEmail()));
		assertTrue(info.contains("Excursion [nombre="));
	}
}
