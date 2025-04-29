package ar.edu.unlp.objetos.dos.ejercicio11;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
    public void testMixtaSimple() {
    	List<Topografia> lista = new ArrayList<>();
    	lista.add(new Agua());
    	lista.add(new Tierra());
    	lista.add(new Tierra());
    	lista.add(new Agua());
        Topografia mixta = new Mixta(lista);
        assertEquals(0.5, mixta.proporcionAgua(), 0.001);
        assertEquals(0.5, mixta.proporcionTierra(), 0.001);
    }

    @Test
    public void testIgualdadEntreMixtas() {
        Topografia m1 = new Mixta(Arrays.asList(new Agua(), new Tierra(), new Tierra(), new Agua()));
        Topografia m2 = new Mixta(Arrays.asList(new Agua(), new Tierra(), new Tierra(), new Agua()));
        Topografia m3 = new Mixta(Arrays.asList(new Tierra(), new Tierra(), new Agua(), new Agua()));

        assertTrue(m1.esIgual(m2));
        assertFalse(m1.esIgual(m3)); 
    }

    @Test
    public void testMixtaAnidada() {
        Topografia mixtaInterna = new Mixta(Arrays.asList(new Agua(), new Tierra(), new Tierra(), new Agua()));
        Topografia mixtaExterna = new Mixta(Arrays.asList(mixtaInterna, new Tierra(), new Agua(), new Tierra()));

        assertEquals(0.375, mixtaExterna.proporcionAgua(), 0.001);
        assertEquals(0.625, mixtaExterna.proporcionTierra(), 0.001);
    }

    @Test
    public void testMixtaConTresElementos() {
        List<Topografia> lista = Arrays.asList(new Agua(), new Tierra(), new Tierra());
        assertThrows(RuntimeException.class, () -> new Mixta(lista));
    }

    @Test
    public void testMixtaConCincoElementos() {
        List<Topografia> lista = Arrays.asList(new Agua(), new Tierra(), new Tierra(), new Agua(), new Tierra());
        assertThrows(RuntimeException.class, () -> new Mixta(lista));
    }

    @Test
    public void testMixtaConMasDeCincoElementos() {
        List<Topografia> lista = Arrays.asList(
            new Agua(), new Tierra(), new Tierra(), new Agua(), new Tierra(), new Agua());
        assertThrows(RuntimeException.class, () -> new Mixta(lista));
    }
}