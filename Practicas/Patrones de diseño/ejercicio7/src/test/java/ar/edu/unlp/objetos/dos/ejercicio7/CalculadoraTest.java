package ar.edu.unlp.objetos.dos.ejercicio7;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
	private Calculadora calculadora;
	
	@BeforeEach
	public void setUp() {
		this.calculadora = new Calculadora();
	}
	
	@Test
	public void estadoInicialTest() {
		assertEquals("0.0", this.calculadora.getResultado());
		this.calculadora.setValor(500);
		assertEquals("500.0", this.calculadora.getResultado());
	}
	
	@Test
	public void sumandoTest() {
		this.calculadora.setValor(2);
		this.calculadora.mas();
		this.calculadora.setValor(2);
		assertEquals("4.0", this.calculadora.getResultado());
	}

	@Test
	public void restandoTest() {
		this.calculadora.setValor(10);
		this.calculadora.menos();
		this.calculadora.setValor(5);
		assertEquals("5.0", this.calculadora.getResultado());
	}
	
	@Test
	public void multiplicandoTest() {
		this.calculadora.setValor(4);
		this.calculadora.por();
		this.calculadora.setValor(4);
		assertEquals("16.0", this.calculadora.getResultado());
	}
	
	@Test
	public void dividiendoTest() {
		this.calculadora.setValor(4);
		this.calculadora.dividido();
		this.calculadora.setValor(2);
		assertEquals("2.0", this.calculadora.getResultado());
		
		this.calculadora.setValor(4);
		this.calculadora.dividido();
		this.calculadora.setValor(0);
		assertEquals("Error", this.calculadora.getResultado());
	}
	
	@Test
	public void sumaAMediasTest() {
		this.calculadora.setValor(2);
		this.calculadora.mas();
		assertEquals("Error", this.calculadora.getResultado());
	}
	
	@Test
	public void restaAMediasTest() {
		this.calculadora.setValor(2);
		this.calculadora.menos();
		assertEquals("Error", this.calculadora.getResultado());
	}
	
	@Test
	public void multiplicacionAMediasTest() {
		this.calculadora.setValor(2);
		this.calculadora.por();
		assertEquals("Error", this.calculadora.getResultado());
	}
	
	@Test
	public void divisionAMedias() {
		this.calculadora.setValor(2);
		this.calculadora.dividido();
		assertEquals("Error", this.calculadora.getResultado());
	}
	
	@Test
	public void sumaIncorrectaTest() {
		this.calculadora.setValor(2);
		this.calculadora.mas();
		this.calculadora.por();
		assertEquals("Error", this.calculadora.getResultado());
	}
	
	@Test
	public void restaIncorrectaTest() {
		this.calculadora.setValor(2);
		this.calculadora.menos();
		this.calculadora.por();
		assertEquals("Error", this.calculadora.getResultado());
	}
	
	@Test
	public void multiplicacionIncorrectaTest() {
		this.calculadora.setValor(2);
		this.calculadora.por();
		this.calculadora.por();
		assertEquals("Error", this.calculadora.getResultado());
	}
	
	@Test
	public void divisionIncorrectaTest() {
		this.calculadora.setValor(2);
		this.calculadora.dividido();
		this.calculadora.por();
		assertEquals("Error", this.calculadora.getResultado());
	}
	
	@Test
    public void borrarEnEstadoInicialTest() {
        calculadora.setValor(100);
        calculadora.borrar();
        assertEquals("0.0", this.calculadora.getResultado());
    }

    @Test
    public void borrarEnEstadoOperandoTest() {
        calculadora.setValor(10);
        calculadora.mas();
        calculadora.borrar();
        assertEquals("0.0", this.calculadora.getResultado());
    }

    @Test
    public void borrarEnEstadoErrorTest() {
        calculadora.setValor(10);
        calculadora.dividido();
        calculadora.setValor(0);
        calculadora.borrar();
        assertEquals("0.0", this.calculadora.getResultado());
    }
}
