package com.methaporce.vista;  // Define el paquete al que pertenece la clase

import com.methaporce.modelo.GestorPelicula;  // Importa la clase GestorPelicula
import com.methaporce.modelo.Pelicula;  // Importa la clase Pelicula

public class Main {
    public static void main(String[] args) {
        GestorPelicula gestor = new GestorPelicula();  // Crea una instancia del gestor de películas

        // Crear instancias de películas
        Pelicula pelicula1 = new Pelicula(1, "The Shawshank Redemption", true);
        Pelicula pelicula2 = new Pelicula(2, "The Godfather", false);
        Pelicula pelicula3 = new Pelicula(3, "The Dark Knight", true);

        // Agregar las películas al gestor
        gestor.agregarPelicula(pelicula1);
        gestor.agregarPelicula(pelicula2);
        gestor.agregarPelicula(pelicula3);

        // Mostrar la lista de todas las películas
        System.out.println("Lista de todas las películas:");
        for (Pelicula p : gestor.obtenerPeliculas()) {
            System.out.println(p);
        }

        // Eliminar la película con id 2
        gestor.eliminarPelicula(2);
        System.out.println("\nDespués de eliminar la película con id 2:");
        for (Pelicula p : gestor.obtenerPeliculas()) {
            System.out.println(p);
        }

        // Marcar la película con id 2 como disponible
        gestor.marcarPeliculaComoDisponible(2);
        System.out.println("\nDespués de marcar la película con id 2 como disponible:");
        for (Pelicula p : gestor.obtenerPeliculas()) {
            System.out.println(p);
        }

        // Mostrar la lista de películas no disponibles
        System.out.println("\nPelículas no disponibles:");
        for (Pelicula p : gestor.obtenerPeliculasNoDisponibles()) {
            System.out.println(p);
        }
    }
}
