package ar.edu.unlp.objetos.dos.ejercicio10;

public class FeistelCipherAdapter implements Cifrador{
	private FeistelCipher feistelCipher;
    
    public FeistelCipherAdapter(String clave) {
        this.feistelCipher = new FeistelCipher(clave);
    }
	
	@Override
	public String cifrar(String mensaje) {
		return this.feistelCipher.encode(mensaje);
	}

	@Override
	public String descifrar(String mensajeCifrado) {
		return this.feistelCipher.encode(mensajeCifrado);
	}
}
