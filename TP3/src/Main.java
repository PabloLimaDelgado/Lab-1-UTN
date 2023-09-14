import java.util.Locale;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        //EJERCICIO 1
        /*1. Programa Java que lea un número entero por teclado y calcule si es par o impar
        int num;

        System.out.print("Ingrese un número: ");
        num = obj.nextInt();

        System.out.print(num % 2 == 0? "Es par" : "Es impar"); */

        //EJERCICIO 2
        /*2. Programa que lea un número entero y muestre si el número es múltiplo de 10.
        int num;

        System.out.print("Ingrese un número: ");
        num = obj.nextInt();

        System.out.print(num % 10 == 0 ? "Es multiplo de 10" : "No es multiplo de 10"); */

        //EJERCICIO 3
        /*3. Programa que lea un carácter por teclado y compruebe si es una letra mayúscula.

        char caracter, caracterAux;

        System.out.print("Ingrese una letra: ");
        caracter = obj.next().charAt(0);

        caracterAux = Character.toUpperCase(caracter);
        System.out.println(caracter == caracterAux ? "El caracter esta en mayuscula" : "El caracter esta no en mayuscula"); */


        //EJERCICIO 4
        /*4. Programa java que comprueba si dos números enteros son iguales o no.
        Los números a comprobar se introducen por teclado.

        int a,b;
        System.out.print("Ingrese el primer número: ");
        a = obj.nextInt();
        System.out.print("Ingrese el segundo número: ");
        b = obj.nextInt();

        System.out.print(a == b ? "Los dos números son iguales" : "Los dos números no son iguales"); */

        //EJERCICIO 5
        /*5. Programa java para calcular el mayor de dos números enteros que se introducen por teclado.

        int a,b;
        System.out.print("Ingrese el primer número: ");
        a = obj.nextInt();
        System.out.print("Ingrese el segundo número: ");
        b = obj.nextInt();
        if(a >b){
            System.out.print("El número " + a + " es el mayor de ambos");
        }
        else {
            if (b > a) {
                System.out.println("El número " + b + " es el mayor de ambos");
            } else {
                System.out.println("Ambos números son iguales");
            } */

        //EJERCICIO 6
        /*6. Programa java para calcular si la última cifra de dos números enteros es la misma.

        System.out.println("Ingrese el primer número: ");
        int a = obj.nextInt();
        System.out.println("INGRESE el segundo número: ");
        int b = obj.nextInt();
        if(a%10 == b %10) {
            System.out.println("La última cifra de los dos números es la misma, la cual es:  " + a % 10);
        } else {
            System.out.print("La última cifra de los dos números no es la misma");
        } */

        //EJERCICIO 7
        /*7. Programa java para calcular si un número entero es múltiplo de tres y de cinco.

        System.out.print("Ingrese un número: ");
        int a = obj.nextInt();
        if (a%3==0 & a%5==0){
            System.out.println("El número ingresado es multiplo de 5 y de 3");
        } else if (a % 3 == 0){
            System.out.println("El número ingresado es multiplo de 3");
        } else if (a % 5 == 0) {
            System.out.println("El número ingresado es multiplo de 5");
        } else {
            System.out.println("El número ingresado es multiplo no es multiplo de 3 o de 5");
        } */

        //EJERCICIO 8
        /*8. Programa java para calcular si un número entero es múltiplo de dos o de tres.

        System.out.println("Ingrese un número: ");
        int a = obj.nextInt();
        if (a%3==0 & a%2==0){
            System.out.print("El número ingresado es multiplo de 2 y de 3");
        } else if (a % 3 == 0){
            System.out.println("El número ingresado es multiplo de 3");
        } else if (a % 2 == 0) {
            System.out.println("El número ingresado es multiplo de 2");
        } else {
            System.out.println("El número ingresado es multiplo no es multiplo de 3 o de 2");
        } */

        //EJERCICIO 9
        /*9. Programa que lea dos caracteres y compruebe si son iguales.

        char caracterOne, caracterTwo;

        System.out.print("Ingrese la primer letra: ");
        caracterOne = obj.next().charAt(0);

        System.out.print("Ingrese la segunda letra: ");
        caracterTwo = obj.next().charAt(0);

        System.out.print(caracterOne == caracterTwo ? "Los caracteres son iguales" : "Los caracteres no son iguales"); */

        //EJERCICIO 10
        /*10. Programa java que lea dos caracteres por teclado y compruebe si los dos son letras minúsculas

        char caracterOne, caracterTwo, caracterOneAux, caracterTwoAux;

        System.out.print("Ingrese la primer letra: ");
        caracterOne = obj.next().charAt(0);

        System.out.print("Ingrese la segunda letra: ");
        caracterTwo = obj.next().charAt(0);

        caracterOneAux = Character.toLowerCase(caracterOne);
        caracterTwoAux = Character.toLowerCase(caracterTwo);

        System.out.print(caracterOne == caracterOneAux && caracterTwo == caracterTwoAux ? "Ambos caracteres estan en minuscula" : "Ambos caracteres estan no estan en minuscula"); */

        //EJERCICIO 11
        /*11. Programa java que lea un carácter por teclado y compruebe si es un dígito numérico (cifra entre 0 y 9).

        char caracter;
        int numCaracter;

        System.out.print("Ingrese una primer letra: ");
        caracter = obj.next().charAt(0);

        numCaracter = (int) caracter;

        System.out.print(numCaracter > 47 && numCaracter < 58 ? "El char es un número" : "El char no es un número"); */

        //EJERCICIO 12
        /*12. Programa que lea dos números por teclado y muestre el resultado de la división del primer número por el segundo. Se debe comprobar que el divisor no puede ser cero.

        int num1, num2;
        double division;

        System.out.print("Ingrese el primer número: ");
        num1 = obj.nextInt();

        do{
            System.out.print("Ingrese el segundo número: ");
            num2 = obj.nextInt();

            if(num2 == 0){
                System.out.println("Error el divisor no puede ser cero");
            }
        }while(num2 == 0);

        division = (double) num1/num2;
        System.out.printf("%d / %d = %.2f", num1, num2, division); */

        //EJERCICIO 13
        /*13. Programa java para comprobar si un año es bisiesto.

        int anio;

        System.out.print("Ingrese el año para saber si es biciesto o no: ");
        anio = obj.nextInt();

        System.out.print(((anio%100 != 0 && anio%4 == 0) || anio%400 == 0) ? "El año es biciesto" : "El año no es biciesto"); */

        //EJERCICIO 14
        /* 14. Programa java para comprobar si un número entero de tres cifras es capicúa.

        int number, aux, firstNumber = 0, lastNumber = 0, counter = 0;

        do {
            System.out.print("Ingrese un número entero positivo: ");
            number = obj.nextInt();

            if(number <= 0 || number > 999){
                System.out.println("El número ingresado es incorrecto");
            }
        }while(number <= 0 || number > 999);

        while(number>0){
            aux = number % 10;
            number = number / 10;

            if(counter == 0) {
                firstNumber = aux;
            }
            else{
                lastNumber = aux;
            }
            counter += 1;
        }

        System.out.print(lastNumber == firstNumber ? "El número es capicua" : "El número no es capicua"); */

        //EJERCICIO 15
        /*15. Programa que lea por teclado tres números enteros H, M, S correspondientes a hora, minutos y segundos respectivamente,
        y comprueba si la hora que indican es una hora válida.

        int H, M, S;

        System.out.print("Ingrese la hora: ");
        H  = obj.nextInt();

        System.out.print("Ingrese los minutos: ");
        M = obj.nextInt();

        System.out.print("Ingrese los segundos: ");
        S = obj.nextInt();

        if(H < 0 || H > 24){
            System.out.print("La hora ingresada es incorrecta");
        } else if (M < 0 || M > 60) {
            System.out.print("Los minutos ingresados son incorrectos");
        } else if (S < 0 || S > 60){
            System.out.print("Los minutos segundos son incorrectos");
        } else {
            System.out.print("El horario ingresado es correcto");
        } */

        //EJERCICIO 16
        /*16. Programa que lea una variable entera mes y compruebe si el valor corresponde a un mes de 30 días, de 31 o de 28.
        Supondremos que febrero tiene 28 días. Se mostrará además el nombre del mes. Se debe comprobar que el valor introducido esté comprendido
        entre 1 y 12.

        int mes;

        System.out.print("Ingrese un número de mes para saber cuantos dias tiene: ");
        mes = obj.nextInt();

        if(mes == 2){
            System.out.print("El mes tiene 28 dias");
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            System.out.print("El mes tiene 30 dias");
        } else if (mes == 1 || mes == 3 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
            System.out.print("El mes tiene 31 dias");
        } else{
            System.out.print("El mes ingresado es incorrecto");
        } */

        //EJERCICIO 17
        /*17. Programa java para convertir una calificación numérica en alfabética.

        int nota;

        System.out.print("Ingrese la nota obtenida: ");
        nota = obj.nextInt();

        if (0 <= nota && nota < 5){
            System.out.println("Insuficiente");
        }
        else if (5 <= nota && nota < 6) {
            System.out.println("Suficiente");
        }
        else if (6 <= nota && nota < 7) {
            System.out.println("Bien");
        }
        else if (7 <= nota && nota < 9) {
            System.out.println("Notable");
        }
        else if (9 <= nota && nota < 10) {
            System.out.println("Sobresaliente");
        }
        else{
            System.out.println("Datos ingresados incorrectos");
        } */

        //EJERCICIO 18
        /*18. Ejemplo de uso de while: Programa Java que muestre los números del 1 al 100 utilizando la instrucción while.

        int num = 1;

        while (num <= 100){
            System.out.print(num + " ");
            num++;
        } */

        //EJERCICIO 19
        /*19. Ejemplo de uso de do-while. Programa Java que muestre los números del 1 al 100 utilizando la instrucción do..while.

        int num = 1;

        do {
            System.out.print(num + " ");
            num++;
        }while (num <= 100); */

        //EJERCICIO 20
        /*20. Ejemplo de uso de for. Programa Java que muestre los números del 1 al 100 utilizando la instrucción for.

        for(int i = 1 ; i <=100; i++){
            System.out.print(i + " ");
        } */

        //EJECICIO 21
        /*21. Ejemplo de uso de while. Programa Java que muestre los números del 100 al 1 utilizando la instrucción while.

        int num = 100;

        while (num >= 1) {
            System.out.print(num + " ");
            num--;
        } */

        //EJERCICIO 22
        /*22. Ejemplo de uso de do-while. Programa Java que muestre los números del 100 al 1 utilizando la instrucción do..while.

        int num = 100;

        do {
            System.out.print(num + " ");
            num--;
        }while (num >= 1); */

        //EJERCICIO 23
        /*Ejemplo de for. Programa Java que muestre los números del 100 al 1 utilizando la instrucción for.

        for(int i=100; i>0; i--){
            System.out.println(i);
        }*/

        //EJERCICIO 24
        /*24. Escribe un programa Java que pida por teclado el valor de un número N y muestre por pantalla todos los números
        desde 1 hasta N. Resuelve este ejercicio de tres formas distintas:

        1.Utilizando la estructura for
        2.Utilizando la estructura while
        3.Utilizando la estructura do .. while

        int number, i;
        System.out.print("Ingrese un numero: ");
        number = obj.nextInt();

        for(i=1; i<(number+1); i++){
            System.out.print(i + " ");
        }
        System.out.println("");

        i=0;
        while(i<number){
            i+=1;
            System.out.print(i + " ");
        }
        System.out.println("");

        i=0;
        do{
            i+=1;
            System.out.print(i + " ");
        }while(i<number);
        System.out.println(""); */

        //EJERCICIO 25
        /*25. Programa que pida que se introduzca por teclado el valor de un número entero N y muestre los
        números desde N hasta 1 ambos incluidos. Se debe resolver este ejercicio de tres formas distintas utilizando
        la estructura repetitiva:
            1. Utilizando la estructura for
            2. Utilizando la estructura while
            3. Utilizando la estructura do .. while

        int number,i;
        System.out.print("Ingrese un numero: ");
        number = obj.nextInt();

        for(i=number;i>0;i--) {
            System.out.print(i + " ");
        }
        System.out.println("");

        i=number;
        while(i>0){
            System.out.print(i + " ");
            i-=1;
        }
        System.out.println("");

        i=number;
        do{
            System.out.print(i + " ");
            i-=1;
        }while(i>0);
        System.out.println(""); */

        //EJERCICIO 26
        /*26. Programa que pida que se introduzcan dos números enteros por teclado y muestre los números desde el menor
        hasta el mayor de los números introducidos. Los dos números introducidos deben ser distintos. Si son iguales se
        mostrará un mensaje indicándolo y se vuelven a introducir.

        int num1,num2,i;
        boolean condicion;

        condicion= true;

        while(condicion){

            System.out.print("Ingrese el primer número: ");
            num1 = obj.nextInt();

            System.out.print("Ingrese el segundo número: ");
            num2 = obj.nextInt();

            if(num1<num2){
                condicion=false;

                for(i=num1;i<(num2+1);i++){
                    System.out.print(i + " ");
                }
            }else if(num2<num1){
                condicion=false
                ;
                for(i=num2;i<(num1+1);i++){
                    System.out.println(i + " ");
                }
            }else{
                System.out.println("Los numeros son iguales. Vuelva a introducirlos");
            }
        } */

        //EJERCICIO 27
        /*27. Programa que pida que se introduzcan dos números enteros A y B por teclado y muestre los números
        pares que hay entre A y B. A debe ser menor que B. Si no es así se mostrará un mensaje indicándolo y se
        vuelven a introducir.

        int a,b,i;
        boolean condicion;

        condicion=true;

        while(condicion) {

            System.out.print("Ingrese el valor de (a): ");
            a = obj.nextInt();

            System.out.print("Ingrese el valor de (b): ");
            b = obj.nextInt();

            if (a < b) {
                System.out.println("Los números pares que hay entre " + a + " y " + b + " son: ");
                for (i = a; i < (b + 1); i++) {
                    if (i % 2 == 0) {
                        System.out.print(i + " ");
                    }
                }
                condicion=false;
            }else{
                System.out.println("Números ingresados invalidos");
            }
        } */

        //EJERCICIO 28
         /*28. Programa que lea dos números enteros positivos N y M y muestre los múltiplos de N que hay desde
         1 hasta M. Por ejemplo si N = 4 y M = 500 el programa mostrará los múltiplos de 4 desde 1 hasta 500.
         El valor de N deberá ser menor que el valor de M. Si no se introducen valores válidos para N o M se mostrará el
         mensaje correspondiente y se vuelven a pedir.

        int n,m,i;
        boolean condicion;

        condicion=true;

        while(condicion){
            System.out.print("Ingrese el valor de (n): ");
            n = obj.nextInt();
            System.out.print("Ingrese el valor de (m): ");
            m = obj.nextInt();

            if(n<m){
                System.out.print("Los multiplos de "+ n+ " hasta "+m+" son: ");
                for(i=n;i<(m+1);i++){
                    if (i%n==0){
                        System.out.print(i+" ");
                    }
                }
                condicion=false;
            }else{
                System.out.println("El valor es incorrecto. Vuelva a introducir los numeros.");
            }
        } */

        //EJERCICIO 29;
        /* 29. Programa Java que convierte millas a kilómetros. El programa pide que se introduzca una cantidad de
        millas y calcula y muestra su equivalente en Kilómetros. El proceso se repite hasta que se introduzca un 0 como
        valor para las millas.

        1 Milla equivale a 1.6093 Kilómetros.

        El valor de los KM resultantes se debe mostrar con dos decimales.

        double km;
        int millas;
        boolean condicion;

        condicion=true;

        while(condicion){
            System.out.print("Ingrese la cantidad de millas (ingrese 0 para salir): ");
            millas = obj.nextInt();

            if(millas==0){
                System.out.print("Fin");
                condicion=false;

            }else{
                km=millas*1.6093;
                DecimalFormat df = new DecimalFormat("#.00");
                String km_formateado = df.format(km);
                System.out.println("La cantidad de "+millas+" millas, equivalen a "+km_formateado+" km");

            }
        } */


        }
}