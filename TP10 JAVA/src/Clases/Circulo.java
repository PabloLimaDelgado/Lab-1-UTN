package Clases;
//EJERCICIO 4
/*4. Crea una clase Círculo con un atributo de radio y métodos para calcular
su área y circunferencia.*/
public class Circulo {
    private float radio;

    public Circulo(float radio){
        this.radio = radio;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public float area(){
        return (float) (Math.PI *  Math.pow(radio, 2));
    }

    public double circunferencia(){
        return 2 * Math.PI * radio;
    }
}
