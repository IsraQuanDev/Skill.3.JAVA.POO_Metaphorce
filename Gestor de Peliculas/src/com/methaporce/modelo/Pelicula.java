package com.methaporce.modelo;  // Define el paquete al que pertenece la clase

public class Pelicula {
    private int id;  // Identificador único de la película
    private String nombre;  // Nombre de la película
    private boolean disponible;  // Estado de disponibilidad de la película

    // Constructor que inicializa los atributos de la película
    public Pelicula(int id, String nombre, boolean disponible) {
        this.id = id;
        this.nombre = nombre;
        this.disponible = disponible;
    }

    // Método para obtener el ID de la película
    public int getId() {
        return id;
    }

    // Método para obtener el nombre de la película
    public String getNombre() {
        return nombre;
    }

    // Método para verificar si la película está disponible
    public boolean isDisponible() {
        return disponible;
    }

    // Método para establecer el estado de disponibilidad de la película
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    // Método que devuelve una representación en cadena de la película
    @Override
    public String toString() {
        return "Pelicula{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", disponible=" + disponible +
                '}';
    }
}
