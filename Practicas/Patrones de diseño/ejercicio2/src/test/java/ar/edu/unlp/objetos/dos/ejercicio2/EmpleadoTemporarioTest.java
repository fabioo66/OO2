package ar.edu.unlp.objetos.dos.ejercicio2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmpleadoTemporarioTest {
	private EmpleadoTemporario empleadoSinFamilia;
	private EmpleadoTemporario empleadoConFamilia;

	@BeforeEach
	public void setUp() {
		empleadoSinFamilia = new EmpleadoTemporario(false, 0, 10); // 10 horas
		empleadoConFamilia = new EmpleadoTemporario(true, 2, 20); // casado con 2 hijos, 20 horas
	}
	
	@Test
	public void sueldoTest() {
		assertEquals(20000 + 300 * 10 + 0 - (0.13 * (20000 + 300 * 10) + 0.05 * 0),empleadoSinFamilia.sueldo(),0.01);
		assertEquals(20000 + 300 * 20 + 5000 + 2000 * 2 - (0.13 * (20000 + 300 * 20) + 0.05 * (5000 + 2000 * 2)),empleadoConFamilia.sueldo(),0.01);
	}
}