package com.duoc.pelicula.dto;



public class PeliculaResponse {

    
    private int id;
    private String titulo;

    public PeliculaResponse(int id, String titulo) {
        this.id = id;
        this.titulo = titulo;
    }

    public int getId() { return id; }
    public String getTitulo() { return titulo; }
}