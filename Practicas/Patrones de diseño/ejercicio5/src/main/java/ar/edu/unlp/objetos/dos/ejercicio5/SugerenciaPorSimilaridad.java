package ar.edu.unlp.objetos.dos.ejercicio5;

import java.util.List;
import java.util.stream.Collectors;

public class SugerenciaPorSimilaridad extends EstrategiaDeSugerencia{

    @Override
    public List<Pelicula> sugerirPeliculas(Decodificador decodificador) {
        return decodificador.getPeliculasReproducidas().stream()
            .flatMap(pelicula -> pelicula.getSimilares().stream())
            .filter(pelicula -> !decodificador.fueReproducida(pelicula))
            .distinct()
            .sorted((p1, p2) -> Integer.compare(p2.getAnioDeEstreno(), p1.getAnioDeEstreno()))
            .limit(3)
            .collect(Collectors.toList());
    }
}
