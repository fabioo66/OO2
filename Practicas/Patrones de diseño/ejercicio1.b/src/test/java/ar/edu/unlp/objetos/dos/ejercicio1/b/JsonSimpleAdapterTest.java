package ar.edu.unlp.objetos.dos.ejercicio1.b;

import static org.junit.jupiter.api.Assertions.*;

import org.json.simple.parser.JSONParser;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.json.simple.parser.ParseException;

public class JsonSimpleAdapterTest {
	private Biblioteca biblioteca;

	@BeforeEach
	public void setUp() {
		this.biblioteca = new Biblioteca();
		this.biblioteca.setExporter(new JsonSimpleAdapter()); 
	}

	@Test
	public void testExportarSociosVacio() {
		String esperado = "[]";
		assertEquals(esperado, biblioteca.exportarSocios());
	}

	@Test
	public void testExportarUnSocio() throws ParseException {
		biblioteca.agregarSocio(new Socio("Arya Stark", "needle@stark.com", "5234-5"));

		String generado = biblioteca.exportarSocios();
		String esperado = "[{\"nombre\":\"Arya Stark\",\"email\":\"needle@stark.com\",\"legajo\":\"5234-5\"}]";

		JSONParser parser = new JSONParser();
		assertEquals(parser.parse(esperado), parser.parse(generado));
	}

	@Test
	public void testExportarMultiplesSocios() throws ParseException {
		biblioteca.agregarSocio(new Socio("Arya Stark", "needle@stark.com", "5234-5"));
		biblioteca.agregarSocio(new Socio("Tyron Lannister", "tyron@thelannisters.com", "2345-2"));

		String generado = biblioteca.exportarSocios();
		String esperado = "[" +
			"{\"nombre\":\"Arya Stark\",\"email\":\"needle@stark.com\",\"legajo\":\"5234-5\"}," +
			"{\"nombre\":\"Tyron Lannister\",\"email\":\"tyron@thelannisters.com\",\"legajo\":\"2345-2\"}" +
			"]";

		JSONParser parser = new JSONParser();
		assertEquals(parser.parse(esperado), parser.parse(generado));
	}
}
