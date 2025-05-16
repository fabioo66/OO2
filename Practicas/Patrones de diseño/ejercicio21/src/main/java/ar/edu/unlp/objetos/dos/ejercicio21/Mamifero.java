package ar.edu.unlp.objetos.dos.ejercicio21;

import java.time.LocalDate;

public class Mamifero implements MamiferoInterface{
	private String identificador;
	private String especie;
	private LocalDate fechaNacimiento;
	private MamiferoInterface padre;
	private MamiferoInterface madre;
	
	public Mamifero() {
		
	}
	
	public Mamifero(String identificador) {
		this.identificador = identificador;
	}
	
	@Override
	public String getIdentificador() {
		return identificador;
	}
	
	@Override
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	
	@Override
	public String getEspecie() {
		return especie;
	}
	
	@Override
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	
	@Override
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	
	@Override
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	@Override
	public MamiferoInterface getPadre() {
		return this.padre;
	}
	
	@Override
	public void setPadre(MamiferoInterface padre) {
		this.padre = padre;
	}
	
	@Override
	public MamiferoInterface getMadre() {
		return this.madre;
	}
	
	@Override
	public void setMadre(MamiferoInterface madre) {
		this.madre = madre;
	}
	
	@Override
	public MamiferoInterface getAbueloMaterno() {
		return this.madre.getPadre();
	}
	
	@Override
	public MamiferoInterface getAbuelaMaterna() {
		return this.madre.getMadre();
	}
	
	@Override
	public MamiferoInterface getAbueloPaterno() {
		return this.padre.getPadre();
	}
	
	@Override
	public MamiferoInterface getAbuelaPaterna() {
		return this.padre.getMadre();
	}

	@Override
	public boolean tieneComoAncestroA(MamiferoInterface unMamifero) {
		return this.padre.equals(unMamifero)
		        || this.madre.equals(unMamifero)
		        || this.padre.tieneComoAncestroA(unMamifero)
		        || this.madre.tieneComoAncestroA(unMamifero);
	}
}
