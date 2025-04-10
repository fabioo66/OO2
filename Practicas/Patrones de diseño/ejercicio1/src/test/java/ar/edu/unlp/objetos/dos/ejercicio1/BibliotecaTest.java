package ar.edu.unlp.objetos.dos.ejercicio1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BibliotecaTest {
	private Biblioteca biblioteca;

	@BeforeEach
	public void setUp() {
		biblioteca = new Biblioteca();
	}

	@Test
	public void testExportarSociosVacio() {
		String esperado = "[]";
		assertEquals(esperado, biblioteca.exportarSocios());
	}

	@Test
	public void testExportarUnSocio() {
		Socio socio = new Socio("Arya Stark", "needle@stark.com", "5234-5");
		biblioteca.agregarSocio(socio);

		String nl = System.lineSeparator();
		String esperado = "[" + nl +
			"\t{" + nl +
			"\t\t\"nombre\": \"Arya Stark\"," + nl +
			"\t\t\"email\": \"needle@stark.com\"," + nl +
			"\t\t\"legajo\": \"5234-5\"" + nl +
			"\t}" + nl +
			"]";

		assertEquals(esperado, biblioteca.exportarSocios());
	}

	@Test
	public void testExportarMultiplesSocios() {
		biblioteca.agregarSocio(new Socio("Arya Stark", "needle@stark.com", "5234-5"));
		biblioteca.agregarSocio(new Socio("Tyron Lannister", "tyron@thelannisters.com",  "2345-2"));

		String json = biblioteca.exportarSocios();
		String nl = System.lineSeparator();
		String esperado = "[" + nl +
			"\t{" + nl +
			"\t\t\"nombre\": \"Arya Stark\"," + nl +
			"\t\t\"email\": \"needle@stark.com\"," + nl +
			"\t\t\"legajo\": \"5234-5\"" + nl +
			"\t}," + nl +
			"\t{" + nl +
			"\t\t\"nombre\": \"Tyron Lannister\"," + nl +
			"\t\t\"email\": \"tyron@thelannisters.com\"," + nl +
			"\t\t\"legajo\": \"2345-2\"" + nl +
			"\t}" + nl +
			"]";

		assertEquals(esperado, json);
	}
}
