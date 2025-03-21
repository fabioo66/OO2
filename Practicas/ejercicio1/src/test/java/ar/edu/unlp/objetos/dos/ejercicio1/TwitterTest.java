package ar.edu.unlp.objetos.dos.ejercicio1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TwitterTest {
	private Twitter twitter;
	private Usuario cape, bigote, fabio, capeFake;
	
	@BeforeEach
	public void setUp() {
		twitter = new Twitter();
		
		cape = new Usuario("cape");
		bigote = new Usuario("exBigote");
		fabio = new Usuario("fabioooo66");
		capeFake = new Usuario("cape");
		
		twitter.agregarUsuario(cape);
		twitter.agregarUsuario(fabio);
		twitter.agregarUsuario(bigote);
	}
	
	@Test
	public void agregarUsuarioTest() {
		assertEquals(3, twitter.getUsuarios().size());
		
		twitter.agregarUsuario(capeFake);
		assertEquals(3, twitter.getUsuarios().size());
	}
	
	@Test
	public void eliminarUsuario() {
		twitter.eliminarUsuario(bigote);
		assertEquals(2, twitter.getUsuarios().size());
	}
}
