package ar.edu.unlp.objetos.dos.ejercicio8;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DispositivoTest {
	private Dispositivo dispositivo;
	
	@BeforeEach
	public void setUp() {
		this.dispositivo = new Dispositivo();
	}
	
	@Test
    public void testSendWithDefaultCRCAndConnection() {
        String result = dispositivo.send("test");
        // El CRC se calcula con CRC16, y la conexión es Wifi
        CRC16_Calculator crcCalc = new CRC16_Calculator();
        int expectedCrc = (int) crcCalc.crcFor("test");
        assertEquals("Wifi: test " + expectedCrc, result);
    }

    @Test
	void testConfigurarCRC() {
		assertEquals("CRC has changed", this.dispositivo.configurarCRC(new CRC32_Calculator()));
		assertEquals("CRC has changed", this.dispositivo.configurarCRC(new CRC16_Calculator()));
	}

    @Test
    public void testConectarConNuevaConexion() {
        Connection nuevaConexion = new CuatroGConnectionAdapter();
        String result = dispositivo.conectarCon(nuevaConexion);
        assertEquals("Connection has changed", result);

        // Confirmar que se usa el nuevo pictograma (esto lo imprime, pero el método retorna el string también)
        assertEquals(nuevaConexion, dispositivo.getConnection());
        assertEquals("4G: hola " + (int) new CRC16_Calculator().crcFor("hola"),
                dispositivo.send("hola"));
    }
}