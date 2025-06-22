package ar.edu.unlp.objetos.dos.SegundaFecha_01_07_2023;

public abstract class Tarea {
	private String nombre;
	private String descripcion;
	
	public Tarea(String nombre, String descripcion) {
		this.nombre = nombre;
		this.descripcion = descripcion;
	}
	
	public abstract void inicarTarea();
	public abstract void completarTarea();
	public abstract int calcularDuracionEstimada();
	public abstract int calcularTiempoUtilizado();
	
	// Template method
	public double avanceDeUnaTarea() {
		return this.calcularTiempoUtilizado() / this.calcularDuracionEstimada();
	}
}
