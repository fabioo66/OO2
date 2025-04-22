package ar.edu.unlp.objetos.dos.ejercicio5;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SugerenciaPorPuntaje implements EstrategiaDeSugerencia{

    @Override
    public List<Pelicula> sugerirPeliculas(Decodificador decodificador){
        return decodificador.getGrillaPeliculas().stream()
            .filter(pelicula -> !decodificador.fueReproducida(pelicula))
            .sorted(Comparator.comparingDouble(Pelicula::getPuntaje).reversed()
                .thenComparing(Pelicula::getAnioDeEstreno, Comparator.reverseOrder()))
            .limit(3)
            .collect(Collectors.toList());
    }
}
