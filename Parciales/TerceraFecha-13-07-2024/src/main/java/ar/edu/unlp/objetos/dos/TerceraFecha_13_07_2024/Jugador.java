package ar.edu.unlp.objetos.dos.TerceraFecha_13_07_2024;

public class Jugador {
	private String nombre;
	private Bolsa bolsa;
	
	public Jugador(String nombre, int capacidad) {
		this.nombre = nombre;
		this.bolsa = new Bolsa("bolsaMain", 0, capacidad);
	}
	
	public boolean guardarObjeto(Item item) {
		return this.bolsa.guardarItem(item);
	}
	
	public Item buscarItem(String nombre) {
		return this.bolsa.buscarItemPorNombre(nombre);
	}
	
	public int espacioMaximo() {
		return this.bolsa.espacioMaximo();
	}
}
