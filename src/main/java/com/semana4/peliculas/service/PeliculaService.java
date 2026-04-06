package com.semana4.peliculas.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.semana4.peliculas.dto.PeliculaResponseDTO;
import com.semana4.peliculas.entity.PeliculaEntity;
import com.semana4.peliculas.repository.PeliculaRepository;


@Service
public class PeliculaService {

    private final PeliculaRepository peliculaRepository;

	public PeliculaService(PeliculaRepository usuarioRepository) {

		this.peliculaRepository = usuarioRepository;
	}

	// public List<PeliculaResponseDTO> obtenerTodas() {

	// 	return peliculaRepository.findAll().stream().map(this::toDTO).toList();
	// }


	public List<PeliculaResponseDTO> obtenerTodas() {
    List<PeliculaEntity> entidades = peliculaRepository.findAll();
	
    return entidades.stream().map(this::toDTO).toList();
}

	public PeliculaResponseDTO obtenerPorId(Long id) {

		Optional<PeliculaEntity> usuario = peliculaRepository.findById(id);
		return usuario.map(this::toDTO).orElse(null);
	}

	private PeliculaResponseDTO toDTO(PeliculaEntity pelicula) {

		return new PeliculaResponseDTO(pelicula.getId(),pelicula.getTitulo(), pelicula.getYear(), pelicula.getDirector(), pelicula.getGenero(), pelicula.getSinopsis());
	}

  


    
}
