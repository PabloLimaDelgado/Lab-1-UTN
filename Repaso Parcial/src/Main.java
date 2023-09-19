import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        /*A.Programa java para calcular si la última cifra de dos números enteros es la misma.
        Para realizar esto el programa lee por teclado dos números enteros y debe obtener la última cifra de cada uno de los
        números. Mediante una instrucción condicional if .. else mostrará un mensaje por pantalla indicando si los dos
        números acaban con la misma cifra  o no.
        Para obtener la última cifra de un número se utiliza el operador % (resto).
        La última cifra de cada número se obtiene calculando el resto de la división del
        número entre 10. Por ejemplo, si uno de los números es 123 su última cifra se calcula 123 % 10 = 3

        int num1,num2;

        System.out.print("Ingrese el primer número entero: ");
        num1 = obj.nextInt();

        System.out.print("Ingrese el primer segundo entero: ");
        num2= obj.nextInt();

        if(num1 % 10 == num2 % 10){
            System.out.print("La última cifra de los números es la misma");
        }else{
            System.out.print("La última cifra de los números no es misma");
        } */

        /*B.Programa java para comprobar si un número entero de tres cifras es capicúa.
        El programa pide que se introduzca un número entero y comprueba si el número es capicúa o no lo es. Si el número introducido
        no tiene tres cifras se muestra un mensaje indicándolo y el programa finaliza.
        Un número es capicúa si se puede leer igual de izquierda a derecha que de derecha a izquierda. Por ejemplo,
        los números 1221, 35053, 969 ... son capicúa.
        Como el programa pide que el número introducido sea de tres ciftras, para comprobar si es capicúa solo
        tendremos que comprobar si la primera cifra y la última son iguales.

        int capicua_num;

        System.out.print("Ingrese el número capicua: ");
        capicua_num = obj.nextInt();

        if(capicua_num > 1000 || capicua_num < 100){
            System.out.print("El número no es de 3 cifras");
        }else{
            if(capicua_num / 100 == capicua_num % 10){
                System.out.print("El número es capicua");
            }else{
                System.out.print("El número no es capicua");
            }
        } */
    }
}