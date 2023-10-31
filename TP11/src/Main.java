import java.util.ArrayList;
import java.lang.String;
import java.util.*;
import Clases.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rm = new Random();
        //EJERCICIO 1
        /*1. Diseñar un programa que lea y guarde marcas de Autos en un ArrayList de tipo
        String. El programa pedirá una marca de Auto en un bucle, el mismo se guardará
        en la lista y después se le preguntará al usuario si quiere guardar otro Auto o si
        quiere salir. Si decide salir, se mostrará todos los autos guardados en el ArrayList.

        ArrayList <String> marcaAutos = new ArrayList<>();

        boolean salir = false;
        String marcaAuto;

        while (!salir){
            System.out.print("Ingrese el nombre de la marca del auto o true para salir: ");
            marcaAuto = sc.nextLine();

            if(marcaAuto.equals("true")){
                salir = true;
                break;
            }else {
                marcaAutos.add(marcaAuto);
            }
        }

        System.out.println("Los autos son: ");
        for (String marca: marcaAutos){
            System.out.println(marca);
        } */

        //EJERCICIO 2
        /*2. Define una clase EquipoDeFútbol que utiliza un ArrayList para mantener una lista de jugadores. La
clase debe permitir agregar nuevos jugadores, eliminar jugadores y listar la plantilla.

        EquipoDeFutbol jugador1 = new EquipoDeFutbol(10, 36, "Messi", "Inter de Miami");
        EquipoDeFutbol jugador2 = new EquipoDeFutbol(18, 19, "Barco", "Boca");
        EquipoDeFutbol jugador3 = new EquipoDeFutbol(7, 38, "Ronaldo", "Al illal");

        jugador1.agregarJugador(jugador1);
        jugador1.agregarJugador(jugador2);
        jugador1.agregarJugador(jugador3);

        jugador1.mostrarPlantilla();

        jugador1.eliminarJugador(jugador1);

        jugador1.mostrarPlantilla(); */

        //EJERCICIO 3
        /*3. Crear una clase llamada Factura que represente una factura comercial. La clase debe tener los
        siguientes atributos:
        • Número de factura: Un número único para identificar la factura.
        • Fecha de emisión: La fecha en la que se emitió la factura.
        • Cliente: El cliente al que se le emite la factura.
        • Artículos: Una lista de artículos vendidos en la factura.
        • Precio unitario: El precio unitario de cada artículo.
        • Cantidad: La cantidad de cada artículo vendido.
        • Subtotal: El subtotal de la factura sin impuestos.
        • IVA: El impuesto sobre el valor añadido (IVA) de la factura.
        • Total: El total de la factura, incluyendo el IVA.
        •
        La clase debe tener los siguientes métodos:
        • Constructor: Un constructor que inicializa los atributos de la factura.
        • Agregar artículo: Un método que agrega un artículo a la factura.
        • Calcular subtotal: Un método que calcula el subtotal de la factura.
        • Calcular IVA: Un método que calcula el IVA de la factura.
        • Calcular total: Un método que calcula el total de la factura


        Factura factura1 = new Factura("Pablo Lima", "22/11/2001", 3);
        Factura factura2 = new Factura("Franco Reta", "24/10/2023", 5);

        Articulo articulo1 = new Articulo("Cafetera", 1000);
        Articulo articulo2 = new Articulo("Papas fritas", 10);

        factura1.agregarArticulo(articulo1);
        factura1.agregarArticulo(articulo2);

        factura1.mostrarDatosFactura(); */

        //EJERCICIO 4
        /*4. Escriba una aplicación que:
        a) lea 20 números decimales ingresados por teclado por el usuario y los coloque en un
        ArrayList.
        b) determine y muestre el mayor de los números en el arreglo
        c) determine y muestre el menor de los números del arreglo calcule y muestre el rango
                (diferencia entre el mayor y el menor) de los elementos en el arreglo

        ArrayList <Integer> decimalNum = new ArrayList<>();
        Integer num, maxNum = 0, minNum = 10000000;

        for (int i=0; i < 20; i++){
            System.out.print("Ingrese un número decimal: ");
            num = (Integer) sc.nextInt();

            decimalNum.add(num);
        }

        System.out.println("El array es: ");
        for (int numero : decimalNum){
            System.out.print(numero + " ");
            if(numero > maxNum){
                maxNum = numero;
            }
            if(numero < minNum){
                minNum = numero;
            }
        }

        System.out.println("\nEl mayor número del arreglo es: " + maxNum + "\n" +
                            "El menor número del arreglo es: " + minNum + "\n" +
                            "La diferencia entre el mayor y el menor es: "+ (maxNum-minNum)); */

        //EJERCICIO 5
        /* 5. Escriba una aplicación para almacenar en un ArrayList<Integer>
                aleatoriamente 20 números enteros positivos pares del 1 al 100, de los
        cuales se desea saber:
        a) su promedio aritmético
        b) cuántos de los números son iguales al promedio aritmético
        c) cuántos de los números son mayores que el promedio aritmético
        d) cuántos de los números son menores que el promedio aritmético */

        ArrayList <Integer> decimalNum = new ArrayList<>();
        Integer num, counter = 0, counterNumPromedio = 0, counterNumMax = 0,  counterNumMin = 0;
        Double promedio;

        for (int i=0; i < 20; i++){
            num = (Integer) rm.nextInt(100);
            decimalNum.add(num);

            counter += num;
        }

        promedio = (double) (counter / 20);

        System.out.println("El array es: ");
        for (int numero : decimalNum){
            System.out.print(numero + " ");
            if(promedio == (double) numero){
                counterNumPromedio += 1;
            }else if(promedio < (double) numero) {
                counterNumMax += 1;
            }else{
                counterNumMin += 1;
            }
        }
        System.out.print("\nEl promedio es: " + promedio);
        System.out.print("\nLa cantidad de números mayor al promedio es " + counterNumMax + "\n" +
                            "La cantidad de números menor al promedio es " + counterNumMin + "\n" +
                            "La cantidad de números igual al promedio es " + counterNumPromedio + "\n");
    }
}