package ar.edu.unlp.objetos.dos.SegundaFecha_01_07_2023;

public class Pendiente implements Estado{

	@Override
	public void inicarTarea(TareaSimple tareaSimple) {
		tareaSimple.setEstado(new Iniciado());
		tareaSimple.setInicio(System.currentTimeMillis());
	}

	@Override
	public void completarTarea(TareaSimple tareaSimple) {
	}

	@Override
	public int calcularTiempoUtilizado(TareaSimple tareaSimple) {
		return 0;
	}

}
