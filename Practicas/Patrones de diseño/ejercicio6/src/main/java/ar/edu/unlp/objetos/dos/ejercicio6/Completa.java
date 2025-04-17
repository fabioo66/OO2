package ar.edu.unlp.objetos.dos.ejercicio6;

public class Completa extends EstadoDeInscripcion{

	@Override
	public void inscribirUsuario(Excursion excursion, Usuario usuario) {
		excursion.agregarUsuarioEnEspera(usuario);
	}

	@Override
	protected String informacionAdicional(Excursion excursion) {
		return "";
	}
}
