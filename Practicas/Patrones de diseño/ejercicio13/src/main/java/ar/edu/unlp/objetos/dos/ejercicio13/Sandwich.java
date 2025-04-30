package ar.edu.unlp.objetos.dos.ejercicio13;

public class Sandwich {
	private String pan;
	private String aderezo;
	private String principal;
	private String adicional;
	private double precioPan;
	private double precioAderezo;
	private double precioPrincipal;
	private double precioAdicional;
	
	public double calcularPrecio() {
		return this.precioPan + this.precioAderezo + this.precioPrincipal + this.precioAdicional;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public void setAderezo(String aderezo) {
		this.aderezo = aderezo;
	}

	public void setPrincipal(String principal) {
		this.principal = principal;
	}

	public void setAdicional(String adicional) {
		this.adicional = adicional;
	}

	public void setPrecioPan(double precioPan) {
		this.precioPan = precioPan;
	}

	public void setPrecioAderezo(double precioAderezo) {
		this.precioAderezo = precioAderezo;
	}

	public void setPrecioPrincipal(double precioPrincipal) {
		this.precioPrincipal = precioPrincipal;
	}

	public void setPrecioAdicional(double precioAdicional) {
		this.precioAdicional = precioAdicional;
	}
}
