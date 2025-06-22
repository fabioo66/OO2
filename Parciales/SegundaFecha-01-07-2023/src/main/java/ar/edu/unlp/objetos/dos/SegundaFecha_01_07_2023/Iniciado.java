package ar.edu.unlp.objetos.dos.SegundaFecha_01_07_2023;

public class Iniciado implements Estado {

	@Override
	public void inicarTarea(TareaSimple tareaSimple) {
	}

	@Override
	public void completarTarea(TareaSimple tareaSimple) {
		tareaSimple.setFin(System.currentTimeMillis());
		tareaSimple.setEstado(new Completado());
	}

	@Override
	public int calcularTiempoUtilizado(TareaSimple tareaSimple) {
		return 0;
	}

}
