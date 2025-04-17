package ar.edu.unlp.objetos.dos.ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class Pelicula {
    private String titulo;
    private int anioDeEstreno;
    private double puntaje;
    private List<Pelicula> similares;

    public Pelicula(String titulo, int anioDeEstreno, double puntaje) {
        this.titulo = titulo;
        this.anioDeEstreno = anioDeEstreno;
        this.puntaje = puntaje;
        this.similares = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }   

    public int getAnioDeEstreno() {
        return anioDeEstreno;
    }

    public double getPuntaje() {
        return puntaje;
    }

    public List<Pelicula> getSimilares() {
        return similares;
    }
    
    public void agregarSimilar(Pelicula pelicula) {
    	if (!this.similares.contains(pelicula)) {
    		this.similares.add(pelicula);
    		pelicula.agregarSimilar(this);
    	}
    }
}
