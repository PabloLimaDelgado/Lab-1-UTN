package Clases;

//EJERCICIO 1
/*1. Crea una clase Perro con atributos como nombre, raza y edad.*/
public class Perro {
    private String nombre;
    public String raza;
    int edad;

    public Perro(String nombre, String raza, int edad){
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    //EJERCICIO 3
    /*3. Crea un método en la clase Perro llamado ladrar que imprima "Guau,
    guau" en la consola.*/

    public String ladrar(){
        String ladrido;
        ladrido = "Guau, guau.";
        return ladrido;
    }
}
