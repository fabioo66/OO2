package ar.edu.unlp.objetos.dos.ejercicio20b;

import java.util.Arrays;

public class GuerreroBuilder extends PersonajeBuilder{

	@Override
	public void setArmadura() {
		this.getPersonaje().setArmadura(new ArmaduraDeAcero());
	}

	@Override
	public void setArma() {
		this.getPersonaje().setArma(new Espada());
	}

	@Override
	public void setHabilidades() {
		this.getPersonaje().setHabilidades(Arrays.asList("Combate cuerpo a cuerpo"));
	}
}
