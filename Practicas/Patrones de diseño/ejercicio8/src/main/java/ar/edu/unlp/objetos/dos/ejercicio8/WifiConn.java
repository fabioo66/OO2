package ar.edu.unlp.objetos.dos.ejercicio8;

public class WifiConn implements Connection{
	private String pict;
	
	public WifiConn() {
		this.pict = "Wifi";
	}

	@Override
	public String sendData(String data, int crc) {
		return "Wifi: " + data + " " + crc;
	}

	@Override
	public String pict() {
		return this.pict;
	}

}
