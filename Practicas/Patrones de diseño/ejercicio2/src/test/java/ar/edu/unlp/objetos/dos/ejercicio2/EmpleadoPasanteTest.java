package ar.edu.unlp.objetos.dos.ejercicio2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmpleadoPasanteTest {
	private EmpleadoPasante empleadoSinExamenes;
	private EmpleadoPasante empleadoConExamenes;
	
	@BeforeEach
	public void setUp() {
		empleadoSinExamenes = new EmpleadoPasante(0);
		empleadoConExamenes = new EmpleadoPasante(3);
	}
	
	@Test
	public void sueldoTest() {
		assertEquals(20000 - (0.13 * 20000 + 0.05 * 0), empleadoSinExamenes.sueldo(), 0.01);
        assertEquals(20000 + 6000 - (0.13 * 20000 + 0.05 * 6000), empleadoConExamenes.sueldo(), 0.01);
	}
}
