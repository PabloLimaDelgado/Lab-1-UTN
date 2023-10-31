/*12. Crea una clase Rectángulo con atributos de ancho y alto y métodos
para calcular su área y perímetro. */
package Clases;

public class Rectangulo {
    public double ancho, alto;

    public Rectangulo(double ancho, double alto){
        this.ancho = ancho;
        this.alto = alto;
    }

    public double area(){
        return ancho * alto;
    }

    public double perimetro(){
        return (ancho*2) + (alto*2);
    }
}
