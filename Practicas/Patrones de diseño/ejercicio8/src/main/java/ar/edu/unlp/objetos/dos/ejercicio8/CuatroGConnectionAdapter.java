package ar.edu.unlp.objetos.dos.ejercicio8;

public class CuatroGConnectionAdapter implements Connection{

	@Override
	public String sendData(String data, int crc) {
		CuatroGConnection connection = new CuatroGConnection();
		return connection.transmit(data, crc);
	}

	@Override
	public String pict() {
		CuatroGConnection connection = new CuatroGConnection();
		return connection.symb();
	}

}
