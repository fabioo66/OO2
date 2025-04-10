package ar.edu.unlp.objetos.dos.ejercicio2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmpleadoPlantaTest {
	private EmpleadoPlanta empleadoNoCasadoSinHijos;
	private EmpleadoPlanta empleadoCasadoConHijos;
	
	@BeforeEach
	public void setUp() {
		empleadoNoCasadoSinHijos = new EmpleadoPlanta(false, 0, 1);
		empleadoCasadoConHijos = new EmpleadoPlanta(true, 2, 3);
	}
	
	@Test
	public void sueldoTest() {
		assertEquals(50000 + 2000 - (0.13 * 50000 + 0.05 * 2000), empleadoNoCasadoSinHijos.sueldo(), 0.01);
		assertEquals(50000 + 5000 + (2 * 2000) + (3 * 2000) - (0.13 * 50000 + 0.05 * (5000 + 2 * 2000 + 3 * 2000)), empleadoCasadoConHijos.sueldo(), 0.01);
	}
}
