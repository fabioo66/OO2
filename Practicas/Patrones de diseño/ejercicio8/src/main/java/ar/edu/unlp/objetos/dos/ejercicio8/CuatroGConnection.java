package ar.edu.unlp.objetos.dos.ejercicio8;

public class CuatroGConnection {
	private String symb;
	
	public CuatroGConnection() {
		this.symb = "4G";
	}

	public String transmit(String data, int crc) {
		return "4G: " + data + " " + crc;
	}

	public String symb() {
		return this.symb;
	}

}
