package ar.edu.unlp.objetos.dos.ejercicio10;

public class Mensajero {
	private Cifrador cifrador;
	
	public void setCifrador(Cifrador cifrador) {
		this.cifrador = cifrador;
	}
	
	public void enviar(String mensaje) {
        String mensajeCifrado = cifrador.cifrar(mensaje);
        System.out.println("Mensaje enviado: " + mensajeCifrado);
    }

    public void recibir(String mensajeCifrado) {
        String mensaje = cifrador.descifrar(mensajeCifrado);
        System.out.println("Mensaje recibido: " + mensaje);
    }
}
