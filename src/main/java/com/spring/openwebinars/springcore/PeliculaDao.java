package com.spring.openwebinars.springcore;

import java.util.Collection;

public interface PeliculaDao {

    Pelicula findById(int id);
    Collection<Pelicula> findAll();
    void insert(Pelicula pelicula);
    void edit(Pelicula pelicula, Pelicula nueva);
    void delete(Pelicula pelicula);

}
