package com.duoc.pelicula;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PeliculaController {

    List<Pelicula> peliculas = new ArrayList<>();
    
    @GetMapping("/peliculas")
    public List<Pelicula> obtenerPeliculas() {

        peliculas.add(new Pelicula(1, "Leon the Professional", 1994, "Luc Besson", "Crimen", "Un asesino profesional entabla una relación con una niña tras la muerte de su familia."));
        peliculas.add(new Pelicula(2, "Django Unchained", 2012, "Quentin Tarantino", "Western", "Un esclavo liberado busca rescatar a su esposa con la ayuda de un cazarrecompensas."));
        peliculas.add(new Pelicula(3, "Reservoir Dogs", 1992, "Quentin Tarantino", "Crimen", "Un grupo de ladrones intenta descubrir quién los traicionó tras un robo fallido."));
        peliculas.add(new Pelicula(4, "Battle Royale", 2000, "Kinji Fukasaku", "Acción", "Estudiantes son obligados a luchar entre ellos hasta que solo quede uno con vida."));
        peliculas.add(new Pelicula(5, "2001: A Space Odyssey", 1968, "Stanley Kubrick", "Ciencia ficción", "Un viaje épico que explora la evolución humana y la inteligencia artificial."));

        return peliculas;
    }


    // Buscar por ID
    @GetMapping("/peliculas/{id}")
    public Pelicula obtenerId(@PathVariable int id) {
        for (Pelicula p : peliculas) 
            {
            if (p.getId() == id)
            {
                return p;
            }
        }
        return null;
    }
}