package ar.edu.unlp.objetos.dos.TerceraFecha_13_07_2024;

public abstract class Item {
	private String nombre;
	private int espacioQueOcupa;
	
	public Item(String nombre, int espacioQueOcupa) {
		this.espacioQueOcupa = espacioQueOcupa;
		this.nombre = nombre;
	}
	
	public int getEspacioQueOcupa() {
		return this.espacioQueOcupa;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public abstract boolean guardarItem(Item item);
	public abstract Item buscarItemPorNombre(String nombre);
	public abstract int espacioMaximo();
	public abstract int capacidadDisponible();
}
