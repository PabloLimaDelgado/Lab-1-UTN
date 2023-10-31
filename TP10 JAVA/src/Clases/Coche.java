/*13. Crea una clase Coche con atributos como marca, modelo y año de
fabricación */

package Clases;

public class Coche {
    public String marca;
    public int modelo;
    public int anioFabricacion;

    public Coche(String marca, int modelo, int anioFabricacion){
        this.marca = marca;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
    }

    /*14. Define un método en la clase Coche que permita acelerar el coche y
    otro para frenar. */

    public void acelerar(int aumentoDeVelocidad){
        System.out.println("El auto aumenta a " + aumentoDeVelocidad + "km por hora");
    }

    public void frenar(int disminucionDeVelocidad){
        System.out.println("El auto disminuye a " + disminucionDeVelocidad + "km por hora");
    }
}
