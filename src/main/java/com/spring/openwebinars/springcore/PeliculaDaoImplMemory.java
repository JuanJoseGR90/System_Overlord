package com.spring.openwebinars.springcore;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class PeliculaDaoImplMemory implements PeliculaDao {

    private List<Pelicula> peliculas = new ArrayList<>();

    @Override
    public Pelicula findById(int id) {
        return peliculas.get(id);
    }

    @Override
    public Collection<Pelicula> findAll() {
        return peliculas;
    }

    @Override
    public void insert(Pelicula pelicula) {
        peliculas.add(pelicula);
    }

    @Override
    public void edit(Pelicula pelicula, Pelicula nueva) {
        peliculas.remove(pelicula);
        peliculas.add(nueva);
    }

    @Override
    public void delete(Pelicula pelicula) {
        peliculas.remove(pelicula);
    }

    public void init() {
        insert(new Pelicula("La guerra de las galaxias", "1977", "Ciencia Ficción"));
        insert(new Pelicula("La lista de Schindler", "1993", "Drama"));
        insert(new Pelicula("El Padrino", "1972", "Drama"));
        insert(new Pelicula("Apocalypse Now", "1979", "Bélico"));
        insert(new Pelicula("Gladiator", "2000", "Acción"));
        insert(new Pelicula("El Gran Dictador"," 1940", "Comedia"));
    }
}
