package ar.edu.unlp.objetos.dos.ejercicio6;

public class Completa implements EstadoDeInscripcion{

	@Override
	public void inscribirUsuario(Excursion excursion, Usuario usuario) {
		excursion.agregarUsuarioEnEspera(usuario);
	}

	@Override
	public String informacionAdicional(Excursion excursion) {
		return "";
	}
}
