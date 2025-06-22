package ar.edu.unlp.objetos.dos.TerceraFecha_13_07_2024;

public class ItemHoja extends Item{

	public ItemHoja(String nombre, int espacioQueOcupa) {
		super(nombre, espacioQueOcupa);
	}

	@Override
	public boolean guardarItem(Item item) {
		return false;
	}

	@Override
	public Item buscarItemPorNombre(String nombre) {
		return null;
	}

	@Override
	public int espacioMaximo() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int capacidadDisponible() {
		// TODO Auto-generated method stub
		return 0;
	}

}
