package ar.edu.unlp.objetos.dos.Parcial_08_08_2022;

public class EnEvaluacion extends Estado{

	@Override
	public void aprobarEtapa(Proyecto proyecto) {
		proyecto.setEstado(new Confirmado());
	}
	
	public void modificarMargenDeGanancia(Proyecto proyecto, double valor) {
		if (proyecto.getMargen() > 0.11 && proyecto.getMargen() < 0.15) {
			proyecto.setMargen(valor);
		}
	}

}
