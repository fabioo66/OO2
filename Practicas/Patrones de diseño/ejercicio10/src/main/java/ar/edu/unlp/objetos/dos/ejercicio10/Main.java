package ar.edu.unlp.objetos.dos.ejercicio10;

public class Main {

	public static void main(String[] args) {

		Mensajero mensajero = new Mensajero();
		
		mensajero.setCifrador(new FeistelCipherAdapter("pepitoGamer1234"));
		mensajero.enviar("Hola como andas");
		
		mensajero.setCifrador(new RC4Adapter("narutouzumaki"));
		mensajero.enviar("Hola como andas");
	}

}
