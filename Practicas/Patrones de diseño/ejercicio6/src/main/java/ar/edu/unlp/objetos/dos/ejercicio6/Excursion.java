package ar.edu.unlp.objetos.dos.ejercicio6;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Excursion {
	private String nombre;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private String puntoDeEncuentro;
	private double costo;
	private int cupoMinimo;
	private int cupoMaximo;
	private List<Usuario> inscriptos;
	private List<Usuario> enEspera;
	private EstadoDeInscripcion estadoDeInscripcion;
	
	public Excursion(String nombre, LocalDate fechaInicio, LocalDate fechaFin, String puntoDeEncuentro, double costo, int cupoMinimo, int cupoMaximo) {
		this.nombre = nombre;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.puntoDeEncuentro = puntoDeEncuentro;
		this.costo = costo;
		this.cupoMinimo = cupoMinimo;
		this.cupoMaximo = cupoMaximo;
		this.inscriptos = new ArrayList<>();
		this.enEspera = new ArrayList<>();
		this.estadoDeInscripcion = new Provisoria();
	}
	
	public void setEstadoDeInscripcion(EstadoDeInscripcion estadoDeInscripcion) {
		this.estadoDeInscripcion = estadoDeInscripcion;
	}

	public EstadoDeInscripcion getEstadoDeInscripcion() {
		return estadoDeInscripcion;
	}

	public List<Usuario> getInscriptos() {
		return this.inscriptos;
	}

	public List<Usuario> getEnEspera() {
		return this.enEspera;
	}

	public void inscribirUsuario(Usuario usuario) {
		this.estadoDeInscripcion.inscribirUsuario(this, usuario);
	}

	public void obtenerInformacion() {
		this.estadoDeInscripcion.estadoToString(this);
	}

	public void agregarUsuario(Usuario usuario) {
		this.inscriptos.add(usuario);
	}

	public void agregarUsuarioEnEspera(Usuario usuario) {
		this.enEspera.add(usuario);
	}

	public int getCupoMinimo() {
		return cupoMinimo;
	}

	public boolean cupoMinimoAlcanzado() {
		return this.inscriptos.size() >= this.cupoMinimo;
	}

	public boolean cupoMaximoAlcanzado() {
		return this.inscriptos.size() >= this.cupoMaximo;
	}

	public int usuariosFaltantesCupoMinimo() {
		return this.cupoMinimo - this.inscriptos.size();
	}

	public int usuariosFaltantesCupoMaximo() {
		return this.cupoMaximo - this.inscriptos.size();
	}

	public String mailUsuariosInscriptos() {
		StringBuilder sb = new StringBuilder();
		this.inscriptos.stream().forEach(usuario -> sb.append(usuario.getEmail()).append("\n"));
		return sb.toString();
	}

	public String toString() {
		return "Excursion [nombre=" + this.nombre + ", costo=" + this.costo + ", fechaInicio=" + this.fechaInicio + ", fechaFin=" + this.fechaFin + ", puntoDeEncuentro=" + this.puntoDeEncuentro + "]";
	}
}
