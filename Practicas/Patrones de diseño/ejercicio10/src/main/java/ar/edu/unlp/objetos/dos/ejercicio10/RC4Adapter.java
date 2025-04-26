package ar.edu.unlp.objetos.dos.ejercicio10;

public class RC4Adapter implements Cifrador{
	private RC4 rc4;
	private String clave;
	
	public RC4Adapter(String clave) {
		this.rc4 = new RC4();
		this.clave = clave;
	}

	@Override
	public String cifrar(String mensaje) {
		return this.rc4.encriptar(mensaje, this.clave);
	}

	@Override
	public String descifrar(String mensaje) {
		return this.rc4.desencriptar(mensaje, this.clave);
	}

}
