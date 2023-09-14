import java.util.Formattable;
import java.util.Scanner;
import java.lang.String;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //EJERCICIO 1
        /*1.Programa Java que lea dos números enteros por teclado y los muestre por pantalla.

        int num1, num2;

        System.out.print("Ingrese el primer número: ");
        num1 = sc.nextInt();

        System.out.print("Ingrese el segundo número: ");
        num2 = sc.nextInt();

        System.out.println("La suma de los números "+num1+" y "+num2+" es: "+ (num1+num2)); */

        //EJERCICIO 2
        /*2.Programa Java que lea un nombre y muestre por pantalla:

        String name;

        System.out.print("Ingrese un nombre: ");
        name = sc.nextLine();
        System.out.println("El nombre es: " + name); */

        //EJERCICIO 3
        /*3.Escribe un programa Java que lee un número entero por teclado y obtiene y muestra por pantalla
        el doble y el triple de ese número.

        int num;

        System.out.print("Ingrese un número entero: ");
        num = sc.nextInt();

        System.out.println("El doble de ese número es: " + (num*2));
        System.out.println("El triple de ese número es: " + (num*3)); */

        //EJERCICIO 4
        /*4. Programa que lea una cantidad de grados centígrados y la pase a grados Fahrenheit.
        La fórmula correspondiente para pasar de grados centígrados a fahrenheit es:
        F = 32 + ( 9 * C / 5)

        double centrigrados, fahrenheit;

        System.out.print("Ingrese la temperatura en grados celcius: ");
        centrigrados = sc.nextDouble();

        fahrenheit = 32 + (9 * centrigrados / 5);

        System.out.println("La tempertura en Fahrenheit es: "+ fahrenheit); */

        //EJERCICIO 5
        /*5.Programa que lee por teclado el valor del radio de una circunferencia y calcula y muestra
        por pantalla la longitud y el área de la circunferencia

        double radio, longitud, circunferencia;

        System.out.print("Ingrese el valor del radio: ");
        radio = sc.nextDouble();

        System.out.println("El valor de la longitud es: " + (2 * Math.PI * radio));
        System.out.println("El valor del área es: " + (Math.PI  * Math.pow(radio, 2))); */

        //EJERCICIO 6
        /*6.Programa que pase una velocidad en Km/h a m/s. La velocidad se lee por teclado.

        double velocidad, velocidadAux;
        System.out.print("Ingrese la velocidad en Km/h: ");
        velocidad = sc.nextDouble();

        velocidadAux = velocidad * 1000 * 1/3600;

        System.out.println("La velicdad en m/s es: " + (velocidadAux)); */

        //EJERCICIO 7
        /*7. Programa lea la longitud de los catetos de un triángulo rectángulo y calcule
        la longitud de la hipotenusa según el teorema de Pitágoras.

        double cateto1, cateto2, hipotenusa;

        System.out.print("Ingrese el cateto 1: ");
        cateto1 = sc.nextDouble();

        System.out.print("Ingrese el cateto 2: ");
        cateto2 = sc.nextDouble();

        hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
        System.out.printf("La hipotenusa del triangulo es: " + "%.2f",hipotenusa); */

        //EJERCICIO 8
        /*8. Programa que tome como dato de entrada un número que corresponde a la
        longitud del radio una esfera y nos calcula y escribe el volumen de la esfera que se
        corresponden con dicho radio.

        double radio, volumen;
        System.out.print("Ingrese el radio de la esfera: ");
        radio = sc.nextDouble();

        volumen = radio * Math.PI * Math.pow(radio, 3);

        System.out.printf("El volumen de la esfera: " + "%.2f",volumen); */

        //EJERCICIO 9
        /*9. Programa Java que calcule el área de un triángulo en función de las longitudes de sus
        lados (a, b, c), según la siguiente fórmula:

        double a, b, c, p;

        System.out.print("Ingrese el lado a del triangulo: ");
        a = sc.nextDouble();

        System.out.print("Ingrese el lado b del triangulo: ");
        b = sc.nextDouble();

        System.out.print("Ingrese el lado c del triangulo: ");
        c = sc.nextDouble();

        p = (a + b + c ) / 2;

        System.out.print("El área del triangulo es: " + (Math.sqrt(p*(p-a)*(p-b)*(p-c)))); */

        //EJERCICIO 10
        /*10. Programa Java que lea un número entero de 3 cifras y muestre por separado las cifras del número.

        int number, aux, contador = 1;
        System.out.print("Ingrese un número: ");
        number = sc.nextInt();

        while(number <= 99 || number >= 999){
            System.out.print("Ingrese otro número: ");
            number = sc.nextInt();
        }

        while(number>0){
            aux = number % 10;
            number = number / 10;

            System.out.println("El digito "+contador+" es: "+ aux);
            contador += 1;
        }*/

        //EJERCICIO 11
        /*11. Programa que lea un número entero N de 5 cifras y muestre sus cifras igual que en el ejemplo.
        Por ejemplo para un número N = 12345   La salida debe ser:
            1
            12
            123
            1234
            12345

        int number;

        System.out.print("Ingrese la altura del número: ");
        number = sc.nextInt();

        for (int i=1; i<number+2; i++){
            for (int j=1; j<i; j++){
                System.out.print(j);
            }
            System.out.println(" ");
        } */

        //EJERCICIO 12
        /*12. Programa Java que lea un número entero N de 5 cifras y muestre sus cifras igual que en el ejemplo.
        Por ejemplo para un número N = 12345    La salida debe ser:
            5
            45
            345
            2345
            12345

        int number, aux;

        System.out.print("Ingrese la altura del número: ");
        number = sc.nextInt();

        aux = number;

        for(int i=1; i<=number; i++){
            for (int j=1; j <= i; j++){
                System.out.print(aux);
                aux += 1;
            }
            aux = number - i;
            System.out.println(" ");
        }*/

        //EJERCICIO 13
        /*13.Programa que pida por teclado la fecha de nacimiento de una persona (dia, mes, año) y calcule su número de la suerte.
                El número de la suerte se calcula sumando el día, mes y año de la fecha de nacimiento y a continuación sumando las cifras obtenidas en la suma.

                Por ejemplo:

        Si la fecha de nacimiento es 12/07/1980
        Calculamos el número de la suerte así: 12+7+1980 = 1999  1+9+9+9 = 28
        Número de la suerte: 28

        int dia, mes, anio, sumaNacimiento, aux, contador = 0;

        System.out.print("Ingrese el dia que nacio: ");
        dia = sc.nextInt();

        System.out.print("Ingrese el mes que nacio: ");
        mes = sc.nextInt();

        System.out.print("Ingrese el año que nacio: ");
        anio = sc.nextInt();

        sumaNacimiento = dia + anio + mes;

        while(sumaNacimiento > 0){
            aux = sumaNacimiento % 10;
            sumaNacimiento = sumaNacimiento / 10;

            contador += aux;
        }

        System.out.print("El número de la suerte es: " + contador); */

        //EJERCICIO 14
        /*14.Programa que calcule el precio de venta de un producto conociendo el precio por unidad (sin IVA)
        del producto, el número de productos vendidos y el porcentaje de IVA aplicado. Los datos anteriores se leerán
        por teclado.

        int numProductos, IVA;
        double precioXUnidad, precioConIva, precioSinIva;

        System.out.print("Ingrese el precio por unidad: ");
        precioXUnidad = sc.nextDouble();

        System.out.print("Ingrese la cantidad de productos: ");
        numProductos = sc.nextInt();

        System.out.print("Ingrese el IVA: ");
        IVA = sc.nextInt();

        precioConIva = numProductos * precioXUnidad;

        precioSinIva = precioConIva - ((precioConIva*IVA)/100);

        System.out.print("El precio sin iva es: " + precioSinIva); */

        //EJERCICIO 15
        /*15.Programa que lea dos variables enteras N y m y le quite a N sus m últimas cifras.
            Por ejemplo, si N = 123456 y m = 2 el nuevo valor de N será 1234.

        int  N, m, count = 1;

        System.out.print("Ingrese el numero N: ");
        N = sc.nextInt();

        System.out.print("Ingrese el numero m: ");
        m = sc.nextInt();

        for (int i=1; i<=m; i++){
            count *= 10;
        }

        System.out.print("El nuevo valor de N es: " + N / count); */

        //EJERCICIO 16
        /*16.Programa que lee una temperatura en grados centígrados y nos
        calcula y muestra por pantalla su valor equivalente en grados Reamur y Kelvin.

        float celcius;

        System.out.print("Ingrese la temperatura en celcius: ");
        celcius = sc.nextFloat();

        System.out.printf("La temperatura en Reamur es: %.2f\n", celcius * 0.80);
        System.out.printf("La temperatura en Kelvin es: %.2f\n", (celcius + 273.15)); */

    }
}