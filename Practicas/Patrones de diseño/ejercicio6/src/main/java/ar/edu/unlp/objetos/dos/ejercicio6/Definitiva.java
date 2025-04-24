package ar.edu.unlp.objetos.dos.ejercicio6;

public class Definitiva implements EstadoDeInscripcion{

	@Override
	public void inscribirUsuario(Excursion excursion, Usuario usuario) {
		excursion.agregarUsuario(usuario);
		if (excursion.cupoMaximoAlcanzado()) {
			excursion.setEstadoDeInscripcion(new Completa());
		}
	}

	@Override
	public String informacionAdicional(Excursion excursion) {
		return "cantidad de usuarios faltantes para alcanzar el cupo maximo " + excursion.usuariosFaltantesCupoMaximo();
	}
}
