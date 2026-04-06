package com.semana4.peliculas.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "PELICULAS")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PeliculaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    @Column(name = "id_peli")
    private Long id;

    @Column(name = "titulo_peli")
    private String titulo;

    @Column(name = "year_peli")
    private String year;

    @Column(name = "director_peli")
    private String director;

    @Column(name = "genero_peli")
    private String genero;

    @Column(name = "sinopsis_peli")
    private String sinopsis;
}
