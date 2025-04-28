package ar.edu.unlp.objetos.dos.ejercicio11b;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TopografiaTest {

    @Test
    public void testAgua() {
        Topografia agua = new Agua();
        assertEquals(1.0, agua.proporcionAgua(), 0.001);
        assertEquals(0.0, agua.proporcionTierra(), 0.001);
        assertTrue(agua.esIgual(new Agua()));
        assertFalse(agua.esIgual(new Tierra()));
    }

    @Test
    public void testTierra() {
        Topografia tierra = new Tierra();
        assertEquals(0.0, tierra.proporcionAgua(), 0.001);
        assertEquals(1.0, tierra.proporcionTierra(), 0.001);
        assertTrue(tierra.esIgual(new Tierra()));
        assertFalse(tierra.esIgual(new Agua()));
    }
    
    @Test
    public void testPantano() {
    	Topografia pantano = new Pantano();
    	assertEquals(0.7, pantano.proporcionAgua(), 0.001);
    	assertEquals(0.3, pantano.proporcionTierra(), 0.001);
    	assertFalse(pantano.esIgual(new Tierra()));
        assertFalse(pantano.esIgual(new Agua()));
        assertTrue(pantano.esIgual(new Pantano()));
    }

    @Test
    public void testMixtaSimple() {
        Topografia mixta = new Mixta(new Agua(), new Tierra(), new Tierra(), new Agua());
        assertEquals(0.5, mixta.proporcionAgua(), 0.001);
        assertEquals(0.5, mixta.proporcionTierra(), 0.001);
    }

    @Test
    public void testIgualdadEntreMixtas() {
        Topografia m1 = new Mixta(new Agua(), new Tierra(), new Tierra(), new Agua());
        Topografia m2 = new Mixta(new Agua(), new Tierra(), new Tierra(), new Agua());
        Topografia m3 = new Mixta(new Tierra(), new Tierra(), new Agua(), new Agua());

        assertTrue(m1.esIgual(m2));
        assertFalse(m1.esIgual(m3)); 
    }

    @Test
    public void testMixtaAnidada() {
        Topografia mixtaInterna = new Mixta(new Agua(), new Tierra(), new Tierra(), new Agua());
        Topografia mixtaExterna = new Mixta(mixtaInterna, new Tierra(), new Agua(), new Tierra());

        assertEquals(0.375, mixtaExterna.proporcionAgua(), 0.001);
        assertEquals(0.625, mixtaExterna.proporcionTierra(), 0.001);
    }
}