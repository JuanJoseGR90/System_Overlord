package com.spring.openwebinars.springcore;

public class Pelicula {

    private String titulo, anyo, genero;

    public Pelicula() {
    }

    public Pelicula(String titulo, String anyo, String genero) {
        this.titulo = titulo;
        this.anyo = anyo;
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAnyo() {
        return anyo;
    }

    public void setAnyo(String anyo) {
        this.anyo = anyo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "titulo='" + titulo + '\'' +
                ", anyo='" + anyo + '\'' +
                ", genero='" + genero + '\'' +
                '}';
    }
}
