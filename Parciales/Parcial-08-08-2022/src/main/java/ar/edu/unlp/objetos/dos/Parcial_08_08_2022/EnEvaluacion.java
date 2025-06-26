package ar.edu.unlp.objetos.dos.Parcial_08_08_2022;

public class EnEvaluacion extends Estado{

	@Override
	public void aprobarEtapa(Proyecto proyecto) {
		proyecto.setEstado(new Confirmado());
	}

}
