/*8. Crea una clase Libro con atributos como título, autor y año de
publicación. */
package Clases;

public class Libro {
    public String titulo, autor;
    public int anioPublicacion;

    public Libro(String titulo, String autor, int anioPublicacion){
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    /*9. Implementa un método en la clase Libro que permita mostrar la
    información del libro en la consola.*/

    public void leerDatos(){
        System.out.print("Los datos del libro son: \n"
                        + "Titulo: " + titulo + "\n"
                        + "Autor: " + autor + "\n"
                        + "Año de publicacion: " + anioPublicacion + "\n");
    }

}
