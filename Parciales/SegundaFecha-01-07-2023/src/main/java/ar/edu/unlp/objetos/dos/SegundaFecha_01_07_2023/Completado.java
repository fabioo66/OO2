package ar.edu.unlp.objetos.dos.SegundaFecha_01_07_2023;

public class Completado implements Estado {

	@Override
	public void inicarTarea(TareaSimple tareaSimple) {
	}

	@Override
	public void completarTarea(TareaSimple tareaSimple) {
	}

	@Override
	public int calcularTiempoUtilizado(TareaSimple tareaSimple) {
		return (int) (tareaSimple.getFin() - tareaSimple.getInicio());
	}

}
