package ar.edu.unlp.objetos.dos.ejercicio6;

public class Provisoria implements EstadoDeInscripcion{
	
	@Override
	public void inscribirUsuario(Excursion excursion, Usuario usuario) {
		excursion.agregarUsuario(usuario);
		if (excursion.cupoMinimoAlcanzado()) {
			excursion.setEstadoDeInscripcion(new Definitiva());
		}
	}

	@Override
	public String informacionAdicional(Excursion excursion) {
		return "cantidad de usuarios faltantes para alcanzar el cupo mínimo " + excursion.usuariosFaltantesCupoMinimo();
	}
}
