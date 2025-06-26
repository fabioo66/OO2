package ar.edu.unlp.objetos.dos.Parcial_08_08_2022;

public abstract class Estado {

	public void aprobarEtapa(Proyecto proyecto) {
	}
	
	public void modificarMargenDeGanancia(Proyecto proyecto, double valor) {
	}
	
	public void cancelarProyecto(Proyecto proyecto) {
		proyecto.setObjetivo("Cancelado");
	}
}
