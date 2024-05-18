# Skill.3.JAVA.POO_Metaphorce
## Aplicación de Gestión de Películas

Esta es una aplicación simple de gestión de películas desarrollada en Java. Permite realizar operaciones básicas como agregar, eliminar y listar películas, así como marcar películas como disponibles o no disponibles.

## Estructura del Proyecto

El proyecto está estructurado en dos paquetes principales:
- `com.methaporce.modelo`: Contiene las clases del modelo, `Pelicula` y `GestorPelicula`.
- `com.methaporce.vista`: Contiene la clase `Main` que sirve como punto de entrada de la aplicación.

## Clases y Funcionalidades

### Clase `Pelicula`
Esta clase representa una película y tiene los siguientes atributos y métodos:
- **Atributos**:
  - `id`: Identificador único de la película.
  - `nombre`: Nombre de la película.
  - `disponible`: Indica si la película está disponible o no.
- **Métodos**:
  - `getId()`: Devuelve el ID de la película.
  - `getNombre()`: Devuelve el nombre de la película.
  - `isDisponible()`: Devuelve el estado de disponibilidad de la película.
  - `setDisponible(boolean disponible)`: Establece el estado de disponibilidad de la película.
  - `toString()`: Devuelve una representación en cadena de la película.

### Clase `GestorPelicula`
Esta clase gestiona una colección de películas y proporciona métodos para realizar operaciones básicas:
- **Métodos**:
  - `agregarPelicula(Pelicula pelicula)`: Agrega una película a la colección.
  - `eliminarPelicula(int id)`: Elimina una película de la colección según su ID.
  - `obtenerPeliculas()`: Devuelve una lista de todas las películas.
  - `obtenerPeliculasDisponibles()`: Devuelve una lista de las películas disponibles.
  - `obtenerPeliculasNoDisponibles()`: Devuelve una lista de las películas no disponibles.
  - `marcarPeliculaComoDisponible(int id)`: Marca una película como disponible según su ID.

### Clase `Main`
Esta clase contiene el método `main` que sirve como punto de entrada de la aplicación. En este método se crean instancias de `Pelicula`, se agregan al `GestorPelicula`, y se realizan varias operaciones para demostrar la funcionalidad de la aplicación.

## Ejecución

Para ejecutar la aplicación, sigue estos pasos:
1. Clona el repositorio:
   ```sh
   git clone https://github.com/tu-usuario/nombre-del-repositorio.git
