package ar.edu.unlp.objetos.dos.ejercicio21;

import java.time.LocalDate;

public class MamiferoNull implements MamiferoInterface{

	@Override
	public String getIdentificador() {
		return "?";
	}

	@Override
	public void setIdentificador(String identificador) {
	}

	@Override
	public String getEspecie() {
		return "?";
	}

	@Override
	public void setEspecie(String especie) {
	}

	@Override
	public LocalDate getFechaNacimiento() {
		return null;
	}

	@Override
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
	}

	@Override
	public Mamifero getPadre() {
		return null;
	}

	@Override
	public void setPadre(MamiferoInterface padre) {
	}

	@Override
	public Mamifero getMadre() {
		return null;
	}

	@Override
	public void setMadre(MamiferoInterface madre) {
	}

	@Override
	public Mamifero getAbueloMaterno() {
		return null;
	}

	@Override
	public Mamifero getAbuelaMaterna() {
		return null;
	}

	@Override
	public Mamifero getAbueloPaterno() {
		return null;
	}

	@Override
	public Mamifero getAbuelaPaterna() {
		return null;
	}

	@Override
	public boolean tieneComoAncestroA(MamiferoInterface unMamifero) {
		return false;
	}
}
