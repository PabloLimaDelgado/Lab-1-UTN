package Clases;
import java.util.ArrayList;
import Clases.Articulo;

public class Factura {
    ArrayList <Articulo> articulos = new ArrayList<>();
    private static int nroFactura = 1005;
    private final int currentNroFactura;
    public int iva;
    public String fechaEmision, cliente;

    public Factura(String cliente, String fechaEmision, int iva){
        this.currentNroFactura = nroFactura;
        this.cliente = cliente;
        this.fechaEmision = fechaEmision;
        this.iva = iva;
        nroFactura += 1;
    }

    public void mostrarDatosFactura(){
        System.out.println("-----------------------------------------");
        System.out.print("LOS DATOS DE LA FACTURA SON: \n" +
                        "El numero de factura es: " + currentNroFactura + "\n" +
                        "El nombre del cliente es: " + cliente + "\n" +
                        "La fecha de emision es: " + fechaEmision + "\n" +
                        "El IVA es: " + iva + "\n");
        System.out.println("Los articulos son: ");
        for (Articulo articulo: articulos){
            System.out.print(articulo.nombre + " - ");
        }
        System.out.println("\nEl subtotal es: "+ this.calcularSubtotal() + "$\n" +
                "El precio del IVA es: "+ this.precioDelIVa() + "$\n" +
                "El total de la factura es: " + this.totalFactura() + "\n" +
                "-----------------------------------------");
    }

    public void agregarArticulo(Articulo articulo){
        articulos.add(articulo);

        System.out.println("El articulo " + articulo.nombre + " fue agregado");
    }

    public int calcularSubtotal(){
        int counter = 0;

        for(Articulo articulo: articulos){
            counter += articulo.precio;
        }

        return counter;
    }

    public int precioDelIVa(){
        int subtotal = this.calcularSubtotal();

        int counterIVA = 0;
        for(Articulo articulo: articulos){
            counterIVA += articulo.precio*this.iva;
        }

        return counterIVA - subtotal;
    }

    public int totalFactura(){
        return  this.calcularSubtotal() + this.precioDelIVa();
    }
}
