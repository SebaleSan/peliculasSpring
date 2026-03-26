package com.duoc.pelicula.service;

import com.duoc.pelicula.model.Pelicula;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PeliculaService {

    private List<Pelicula> peliculas = new ArrayList<>();
    private int contador = 6;

    public PeliculaService() {
        peliculas.add(new Pelicula(1, "Leon the Professional", 1994, "Luc Besson", "Crimen", "Un asesino profesional entabla una relación con una niña tras la muerte de su familia."));
        peliculas.add(new Pelicula(2, "Django Unchained", 2012, "Quentin Tarantino", "Western", "Un esclavo liberado busca rescatar a su esposa con la ayuda de un cazarrecompensas."));
        peliculas.add(new Pelicula(3, "Reservoir Dogs", 1992, "Quentin Tarantino", "Crimen", "Un grupo de ladrones intenta descubrir quién los traicionó tras un robo fallido."));
        peliculas.add(new Pelicula(4, "Battle Royale", 2000, "Kinji Fukasaku", "Acción", "Estudiantes son obligados a luchar entre ellos hasta que solo quede uno con vida."));
        peliculas.add(new Pelicula(5, "2001: A Space Odyssey", 1968, "Stanley Kubrick", "Ciencia ficción", "Un viaje épico que explora la evolución humana y la inteligencia artificial."));
    }

    public List<Pelicula> obtenerTodas() {
        return peliculas;
    }

    public Pelicula obtenerPorId(int id) {
        for (Pelicula p : peliculas) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    public Pelicula crear(Pelicula pelicula) {
    pelicula.setId(contador++);
    peliculas.add(pelicula);
    return pelicula;
}
}
