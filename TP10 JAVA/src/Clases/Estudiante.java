/*6. Crea una clase Estudiante con atributos como nombre, edad y número de
identificación. */

package Clases;

public class Estudiante {
    public String nombre;
    public  int edad;
    private int id;

    /*7. Define un constructor para la clase Estudiante que permita inicializar sus
atributos al crear un objeto. */
    public Estudiante(String nombre,int edad,int id){
        this.nombre = nombre;
        this.edad = edad;
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}
