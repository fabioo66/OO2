package ar.edu.unlp.objetos.dos.Parcial_08_08_2022;

public class EnConstruccion extends Estado{

	@Override
	public void aprobarEtapa(Proyecto proyecto) {
		if (proyecto.costoDelProyecto() != 0) {
			proyecto.setEstado(new EnEvaluacion());
		}else {
			throw new RuntimeException("Error");
		}
	}
	
	public void modificarMargenDeGanancia(Proyecto proyecto, double valor) {
		if (proyecto.getMargen() > 0.8 && proyecto.getMargen() < 0.10) {
			proyecto.setMargen(valor);
		}
	}

}
