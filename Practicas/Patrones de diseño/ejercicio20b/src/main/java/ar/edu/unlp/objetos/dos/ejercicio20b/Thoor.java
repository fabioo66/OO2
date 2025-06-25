package ar.edu.unlp.objetos.dos.ejercicio20b;

import java.util.Arrays;

public class Thoor extends PersonajeBuilder{

	@Override
	public void setArmadura() {
		this.getPersonaje().setArmadura(new ArmaduraDeHierro());
	}

	@Override
	public void setArma() {
		this.getPersonaje().setArma(new Martillo());
	}

	@Override
	public void setHabilidades() {
		this.getPersonaje().setHabilidades(Arrays.asList("Lanzar rayos", "Combate a distancia"));
	}

}
