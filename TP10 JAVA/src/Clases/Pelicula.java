/*15. Crea una clase Película con atributos como título, director y
duración en minutos. Implementa un método para mostrar la información
de la película. */

package Clases;

public class Pelicula {
    public String titulo, director;
    public int duracionMinutos;

    public Pelicula(String titulo, String director, int duracionMinutos){
        this.titulo = titulo;
        this.director = director;
        this.duracionMinutos = duracionMinutos;
    }

    public void infoPelicula(){
        System.out.println(
                "La info de la pelicula es: \n"+
                        "Titulo: " + titulo + "\n" +
                        "Director: " + director + "\n" +
                        "Duracion en minutos: " + duracionMinutos
        );
    }
}
