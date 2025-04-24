package ar.edu.unlp.objetos.dos.ejercicio8;

public class Dispositivo {
	private Ringer ringer;
	private Display display;
	private Connection connection;
	private CRC_Calculator crcCalculator;
	
	public Dispositivo() {
		this.ringer = new Ringer();
		this.display = new Display();
		this.connection = new WifiConn();
		this.crcCalculator = new CRC16_Calculator();
	}
	
	public String send(String data) {
		int crc = (int) this.crcCalculator.crcFor(data);
		return this.connection.sendData(data, crc);
	}

	public String conectarCon(Connection connection) {
		this.connection = connection;
		this.display.showBanner(this.connection.pict());
		this.ringer.ring();
		return "Connection has changed";
	}

	public String configurarCRC(CRC_Calculator crcCalculator) {
		this.crcCalculator = crcCalculator;
		return "CRC has changed";
	}
	
	public Connection getConnection() {
		return this.connection;
	}
}
