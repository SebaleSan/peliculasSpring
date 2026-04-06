package com.semana4.peliculas.repository;
import com.semana4.peliculas.entity.*;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PeliculaRepository extends JpaRepository<PeliculaEntity, Long> {
}


