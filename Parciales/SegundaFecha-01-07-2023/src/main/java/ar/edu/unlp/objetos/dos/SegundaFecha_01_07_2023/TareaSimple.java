package ar.edu.unlp.objetos.dos.SegundaFecha_01_07_2023;

public class TareaSimple extends Tarea{
	private int duracionEstimada;
	private long inicio;
	private long fin;
	private Estado estado;

	public TareaSimple(String nombre, String descripcion, int duracionEstimada) {
		super(nombre, descripcion);
		this.duracionEstimada = duracionEstimada;
		this.estado = new Pendiente();
	}

	@Override
	public void inicarTarea() {
		this.estado.inicarTarea(this);
	}

	@Override
	public void completarTarea() {
		this.estado.completarTarea(this);
	}

	@Override
	public int calcularDuracionEstimada() {
		return this.duracionEstimada;
	}

	@Override
	public int calcularTiempoUtilizado() {
		return this.estado.calcularTiempoUtilizado(this);
	}

	protected void setEstado(Estado estado) {
		this.estado = estado;
	}

	public void setInicio(long inicio) {
		this.inicio = inicio;
	}

	public void setFin(long timeMillis) {
		this.fin = timeMillis;
	}

	public long getFin() {
		return this.fin;
	}
	
	public long getInicio() {
		return this.inicio;
	}
}
