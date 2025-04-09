package ar.edu.unlp.objetos.dos.ejercicio2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JugadorTest {
    private Objeto piedra, tijera, papel, lagarto, spock;
    private Jugador jugadorPiedra, jugadorTijera, jugadorPapel, jugadorLagarto, jugadorSpock;

    @BeforeEach
    public void setUp() {
        piedra = new Piedra();
        tijera = new Tijera();
        papel = new Papel();
        lagarto = new Lagarto();
        spock = new Spock();

        jugadorPiedra = new Jugador(piedra);
        jugadorTijera = new Jugador(tijera);
        jugadorPapel = new Jugador(papel);
        jugadorLagarto = new Jugador(lagarto);
        jugadorSpock = new Jugador(spock);
    }

    @Test
    public void testEmpates() {
        assertEquals("Empate", jugadorPiedra.Jugar(jugadorPiedra));
        assertEquals("Empate", jugadorPapel.Jugar(jugadorPapel));
        assertEquals("Empate", jugadorTijera.Jugar(jugadorTijera));
        assertEquals("Empate", jugadorLagarto.Jugar(jugadorLagarto));
        assertEquals("Empate", jugadorSpock.Jugar(jugadorSpock));
    }

    @Test
    public void testVictorias() {
        assertEquals("Gana piedra", jugadorPiedra.Jugar(jugadorTijera));   // Piedra aplasta tijera
        assertEquals("Gana piedra", jugadorPiedra.Jugar(jugadorLagarto)); // Piedra aplasta lagarto
        assertEquals("Gana papel", jugadorPapel.Jugar(jugadorPiedra));    // Papel cubre piedra
        assertEquals("Gana papel", jugadorPapel.Jugar(jugadorSpock));     // Papel desaprueba Spock
        assertEquals("Gana tijera", jugadorTijera.Jugar(jugadorPapel));   // Tijera corta papel
        assertEquals("Gana tijera", jugadorTijera.Jugar(jugadorLagarto)); // Tijera decapita lagarto
        assertEquals("Gana lagarto", jugadorLagarto.Jugar(jugadorPapel)); // Lagarto come papel
        assertEquals("Gana lagarto", jugadorLagarto.Jugar(jugadorSpock)); // Lagarto envenena Spock
        assertEquals("Gana spock", jugadorSpock.Jugar(jugadorTijera));    // Spock rompe tijera
        assertEquals("Gana spock", jugadorSpock.Jugar(jugadorPiedra));    // Spock vaporiza piedra
    }

    @Test
    public void testDerrotas() {
        assertEquals("Gana piedra", jugadorTijera.Jugar(jugadorPiedra));   // Piedra aplasta tijera
        assertEquals("Gana piedra", jugadorLagarto.Jugar(jugadorPiedra)); // Piedra aplasta lagarto
        assertEquals("Gana papel", jugadorPiedra.Jugar(jugadorPapel));    // Papel cubre piedra
        assertEquals("Gana papel", jugadorSpock.Jugar(jugadorPapel));     // Papel desaprueba Spock
        assertEquals("Gana tijera", jugadorPapel.Jugar(jugadorTijera));   // Tijera corta papel
        assertEquals("Gana tijera", jugadorLagarto.Jugar(jugadorTijera)); // Tijera decapita lagarto
        assertEquals("Gana lagarto", jugadorPapel.Jugar(jugadorLagarto)); // Lagarto come papel
        assertEquals("Gana lagarto", jugadorSpock.Jugar(jugadorLagarto)); // Lagarto envenena Spock
        assertEquals("Gana spock", jugadorTijera.Jugar(jugadorSpock));    // Spock rompe tijera
        assertEquals("Gana spock", jugadorPiedra.Jugar(jugadorSpock));    // Spock vaporiza piedra
    }
}