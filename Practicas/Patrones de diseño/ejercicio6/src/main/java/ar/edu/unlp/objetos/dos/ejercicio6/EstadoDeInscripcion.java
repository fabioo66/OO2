package ar.edu.unlp.objetos.dos.ejercicio6;

public abstract class EstadoDeInscripcion {
	
	public String estadoToString(Excursion excursion) {
		return excursion.toString() + this.informacionAdicional(excursion);
	}

	protected abstract String informacionAdicional(Excursion excursion);

	public abstract void inscribirUsuario(Excursion excursion, Usuario usuario);
}
