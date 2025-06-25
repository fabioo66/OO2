package ar.edu.unlp.objetos.dos.ejercicio20;

public abstract class PersonajeBuilder {
	private Personaje personaje;

	public void reset() {
		this.personaje = new Personaje();
	}
	
	public void setNombre(String nombre) {
		this.personaje.setNombre(nombre);
	}
	
	public void setVida() {
		this.personaje.setVida(100);
	}
	
	public abstract void setArmadura();
	public abstract void setArma();
	public abstract void setHabilidades();
	
	public Personaje getPersonaje() {
		return this.personaje;
	}
}
