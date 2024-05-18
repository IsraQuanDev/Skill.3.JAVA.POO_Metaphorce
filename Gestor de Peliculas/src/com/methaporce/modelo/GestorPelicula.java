package com.methaporce.modelo;  // Define el paquete al que pertenece la clase

import java.util.ArrayList;  // Importa la clase ArrayList
import java.util.List;  // Importa la interfaz List

public class GestorPelicula {
    private List<Pelicula> peliculas;  // Lista que almacena las películas

    // Constructor que inicializa la lista de películas
    public GestorPelicula() {
        this.peliculas = new ArrayList<>();
    }

    // Método para agregar una película a la colección
    public void agregarPelicula(Pelicula pelicula) {
        peliculas.add(pelicula);
    }

    // Método para eliminar una película de la colección según su ID
    public void eliminarPelicula(int id) {
        peliculas.removeIf(p -> p.getId() == id);
    }

    // Método para obtener una lista de todas las películas
    public List<Pelicula> obtenerPeliculas() {
        return new ArrayList<>(peliculas);
    }

    // Método para obtener una lista de las películas disponibles
    public List<Pelicula> obtenerPeliculasDisponibles() {
        List<Pelicula> disponibles = new ArrayList<>();  // Lista temporal para las películas disponibles
        for (Pelicula pelicula : peliculas) {  // Recorre todas las películas
            if (pelicula.isDisponible()) {  // Si la película está disponible
                disponibles.add(pelicula);  // Añadirla a la lista de disponibles
            }
        }
        return disponibles;  // Devolver la lista de películas disponibles
    }

    // Método para obtener una lista de las películas no disponibles
    public List<Pelicula> obtenerPeliculasNoDisponibles() {
        List<Pelicula> noDisponibles = new ArrayList<>();  // Lista temporal para las películas no disponibles
        for (Pelicula pelicula : peliculas) {  // Recorre todas las películas
            if (!pelicula.isDisponible()) {  // Si la película no está disponible
                noDisponibles.add(pelicula);  // Añadirla a la lista de no disponibles
            }
        }
        return noDisponibles;  // Devolver la lista de películas no disponibles
    }

    // Método para marcar una película como disponible según su ID
    public void marcarPeliculaComoDisponible(int id) {
        for (Pelicula pelicula : peliculas) {  // Recorre todas las películas
            if (pelicula.getId() == id) {  // Si se encuentra la película con el ID especificado
                pelicula.setDisponible(true);  // Marcarla como disponible
                break;  // Salir del bucle
            }
        }
    }
}
