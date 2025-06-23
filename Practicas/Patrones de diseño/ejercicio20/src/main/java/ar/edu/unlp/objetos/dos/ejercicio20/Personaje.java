package ar.edu.unlp.objetos.dos.ejercicio20;

import java.util.List;

public class Personaje {
	private String nombre;
	private int vida;
	private List<String> habilidades;
	private Armadura armadura;
	private Arma arma;
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getVida() {
		return vida;
	}
	
	public void setVida(int vida) {
		this.vida = vida;
	}
	
	public List<String> getHabilidades() {
		return habilidades;
	}
	
	public void setHabilidades(List<String> habilidades) {
		this.habilidades = habilidades;
	}

	public Armadura getArmadura() {
		return armadura;
	}

	public void setArmadura(Armadura armadura) {
		this.armadura = armadura;
	}

	public Arma getArma() {
		return arma;
	}

	public void setArma(Arma arma) {
		this.arma = arma;
	}
	
	public void enfrentar(Personaje rival) {
	    if (this.isAlive() && rival.isAlive()) {
	        rival.recibirDaño(this.arma);
	        if (rival.isAlive()) {
	            this.recibirDaño(rival.getArma());
	        }
	    } else {
	        throw new RuntimeException("Personaje con vida insuficiente para el combate");
	    }
	}
	
	protected void recibirDaño(Arma arma) {
	    int daño = this.armadura.recibirDaño(arma);
	    this.vida = Math.max(this.vida - daño, 0);
	}
	
	public boolean isAlive() {
		return this.vida > 0;
	}
}
