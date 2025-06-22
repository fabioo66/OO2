package ar.edu.unlp.objetos.dos.SegundaFecha_01_07_2023;

import java.util.ArrayList;
import java.util.List;

public class TareaCompleja extends Tarea{
	private List<Tarea> tareas;

	public TareaCompleja(String nombre, String descripcion) {
		super(nombre, descripcion);
		this.tareas = new ArrayList<>();
	}

	@Override
	public void inicarTarea() {
		this.tareas.stream()
				   .forEach(tarea -> tarea.inicarTarea());
	}

	@Override
	public void completarTarea() {
		this.tareas.stream()
				   .forEach(tarea -> tarea.completarTarea());
	}

	@Override
	public int calcularDuracionEstimada() {
		return this.tareas.stream()
				   .mapToInt(tarea -> tarea.calcularDuracionEstimada())
				   .sum();
	}

	@Override
	public int calcularTiempoUtilizado() {
		return this.tareas.stream()
				   .mapToInt(tarea -> tarea.calcularTiempoUtilizado())
				   .sum();
	}

}
