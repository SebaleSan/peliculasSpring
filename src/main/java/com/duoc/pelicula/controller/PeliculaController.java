package com.duoc.pelicula.controller;

import com.duoc.pelicula.dto.PeliculaRequest;
import com.duoc.pelicula.dto.PeliculaResponse;
import com.duoc.pelicula.model.Pelicula;
import com.duoc.pelicula.service.PeliculaService;

import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/peliculas")
public class PeliculaController {

    private final PeliculaService service;

    public PeliculaController(PeliculaService service) {
        this.service = service;
    }

    @GetMapping
    public List<Pelicula> obtenerPeliculas() {
        return service.obtenerTodas();
    }

    @GetMapping("/{id}")
    public Pelicula obtenerId(@PathVariable int id) {
        return service.obtenerPorId(id);
    }

    //  NUEVO POST con DTO
    @PostMapping
    public PeliculaResponse crear(@RequestBody PeliculaRequest request) {

     Pelicula pelicula = new Pelicula(
              0, // temporal, el service lo reemplaza
             request.getTitulo(),
              request.getAnio(),
               request.getDirector(),
              request.getGenero(),
             request.getSinopsis()
        );

      Pelicula guardada = service.crear(pelicula);

     return new PeliculaResponse(guardada.getId(), guardada.getTitulo());
}
}