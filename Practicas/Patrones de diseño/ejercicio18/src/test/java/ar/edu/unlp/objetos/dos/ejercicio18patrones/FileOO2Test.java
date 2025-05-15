package ar.edu.unlp.objetos.dos.ejercicio18patrones;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FileOO2Test {
	private FileOO2 fileOO2;
	
	@BeforeEach
	public void setUp() {
		this.fileOO2 = new FileOO2("fabio", ".py", "50 kb", LocalDate.of(2025, 2, 10), LocalDate.of(2025, 5, 3), "escritura, lectura, modificacion");
	}
	
	@Test
	public void ejemploUnoTest() {
		assertEquals("fabio", fileOO2.prettyPrint());
		
		FileDecorator extension = new DecoratorExtension(this.fileOO2);
		assertEquals("fabio - .py", extension.prettyPrint());
	}
	
	@Test
	public void ejemploDosTest() {
		FileDecorator fechaDeCreacion = new DecoratorFechaCreacion(this.fileOO2);
		FileDecorator extension = new DecoratorExtension(fechaDeCreacion);
		assertEquals("fabio - 2025-02-10 - .py", extension.prettyPrint());
	}
	
	@Test
	public void ejemploTresTest() {
		FileDecorator tamaño = new DecoratorTamaño(this.fileOO2);
		FileDecorator permisos = new DecoratorPermisos(tamaño);
		FileDecorator extension = new DecoratorExtension(permisos);
		assertEquals("fabio - 50 kb - escritura, lectura, modificacion - .py", extension.prettyPrint());
	}
}
