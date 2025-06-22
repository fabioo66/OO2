package ar.edu.unlp.objetos.dos.SegundaFecha_01_07_2023;

public interface Estado {
	
	public void inicarTarea(TareaSimple tareaSimple);
	public void completarTarea(TareaSimple tareaSimple);
	public int calcularTiempoUtilizado(TareaSimple tareaSimple);
}
