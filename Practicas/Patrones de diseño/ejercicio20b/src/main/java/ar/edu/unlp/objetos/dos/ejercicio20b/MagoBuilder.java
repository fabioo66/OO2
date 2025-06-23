package ar.edu.unlp.objetos.dos.ejercicio20b;

import java.util.Arrays;

public class MagoBuilder extends PersonajeBuilder{

	@Override
	public void setArmadura() {
		this.getPersonaje().setArmadura(new ArmaduraDeCuero());
	}

	@Override
	public void setArma() {
		this.getPersonaje().setArma(new Baston());
	}

	@Override
	public void setHabilidades() {
		this.getPersonaje().setHabilidades(Arrays.asList("Magia", "Combate a distancia"));
	}
}
