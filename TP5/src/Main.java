import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import  java.lang.String;
import  java.util.Scanner;

public class Main {

    //BURBUJA
    public static void burbuja(int[] A) {
        int i, j, aux;
        for (i = 0; i < A.length - 1; i++) {
            for (j = 0; j < A.length - i - 1; j++) {
                if (A[j + 1] < A[j]) {
                    aux = A[j + 1];
                    A[j + 1] = A[j];
                    A[j] = aux;
                }
            }
        }
    }

    //SELECCION
    public static void seleccion(int A[]) {
        int i, j, menor, pos, tmp;
        for (i = 0; i < A.length - 1; i++) {
            menor = A[i];
            pos = i;
            for (j = i + 1; j < A.length; j++){
                if (A[j] < menor) {
                    menor = A[j];
                    pos = j;
                }
            }
            if (pos != i){
                tmp = A[i];
                A[i] = A[pos];
                A[pos] = tmp;
            }
        }
    }

    //INSERCIÓN
    public static void insercionDirecta(int A[]){
        int p, j;
        int aux;
        for (p = 1; p < A.length; p++){
            aux = A[p];
            j = p - 1;
            while ((j >= 0) && (aux < A[j])){
                A[j + 1] = A[j];
                j--;
            }
            A[j + 1] = aux;
        }
    }

    //POR MEZCLA O QUICKSORT
    /*public static void quicksort(int A[], int izq, int der) {

        int pivote=A[izq];
        int i=izq;
        int j=der;
        int aux;

        while(i < j){
            while(A[i] <= pivote && i < j) i++;
            while(A[j] > pivote) j--;
            if (i < j) {
                aux= A[i];
                A[i]=A[j];
                A[j]=aux;
            }
        }

        A[izq]=A[j];
        A[j]=pivote;

        if(izq < j-1)
            quicksort(A,izq,j-1);
        if(j+1 < der)
            quicksort(A,j+1,der);

    }*/

    //SHELL
    /*public static void shell(int A[]) {

        int salto, aux, i;
        boolean cambios;

        for (salto = A.length / 2; salto != 0; salto /= 2) {
            cambios = true;
            while (cambios) {
                cambios = false;
                for (i = salto; i < A.length; i++)
                {
                    if (A[i - salto] > A[i]) {
                        aux = A[i];
                        A[i] = A[i - salto];
                        A[i - salto] = aux;
                        cambios = true;
                    }
                }
            }
        }
    } */

    public static void main(String[] args) {

        Random rm = new Random();
        Scanner sc = new Scanner(System.in);
        //EJERCICIO 1
        /*1. Ordenar un array de números enteros de menor a mayor.

        int [] array = new int[10];

        for (int i = 0; i < array.length; i++){
            array[i] = rm.nextInt(100);
        }

        Arrays.sort(array);

        System.out.println("El array ordenado es: ");
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        } */

        //EJERCICIO 2
        /*2. Ordenar un array de números enteros de mayor a menor
        Integer [] array = new Integer[10];

        for (int i = 0; i < array.length; i++){
            array[i] = rm.nextInt(100);
        }

        Arrays.sort(array, Collections.reverseOrder());

        System.out.println("El array ordenado es: ");
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        } */

        //EJERCICIO 3
        /*3. Ordenar un array de números flotantes de menor a mayor.
        float [] array = new float[10];

        for (int i = 0; i < array.length; i++){
            array[i] = Math.round((rm.nextFloat() * 100) * 100.0f) / 100.0f;
            //randomFloat * 100.0f: Multiplica el número flotante por 100
            //Math.round(...): Este método redondea el número flotante al número entero más cercano
            //... / 100.0f: Ahora, se divide el número redondeado por 100 para "mover" los decimales de vuelta a su posición original
        }

        Arrays.sort(array);

        System.out.println("El array ordenado es: ");
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        } */

        //EJERCICIO 4
        /*4. Ordenar un array de números flotantes de mayor a menor.
        float [] array = new float[10];
        float [] arrayAux = new float[10];
        int j, k;
        for (int i = 0; i < array.length; i++){
            array[i] = Math.round((rm.nextFloat() * 100) * 100.0f) / 100.0f;
        }

        Arrays.sort(array);
        j = 0;
        k = array.length-1;

        while (j < array.length){
            arrayAux[j] = array[k];
            j++;
            k--;

        }
        System.out.println("El array ordenado es: ");
        for (int i = 0; i < array.length; i++){
            System.out.print(arrayAux[i] + " ");
        } */

        //EJERCICIO 5
        /*5. Ordenar un array de cadenas de texto en orden alfabético.

        String [] array = {"Pablo", "Ulises", "Maximo", "Santiago", "Andres", "Federico"};

        Arrays.sort(array);

        System.out.println("El array ordenado es: ");
        for(String i : array){
            System.out.print(i + " ");
        } */

        //EJERCICIO 6
        /*6. Ordenar un array de cadenas de texto en orden inverso.

        String [] array = {"Pablo", "Ulises", "Maximo", "Santiago", "Andres", "Federico"};
        String [] arrayAux = new String[6];
        int j, k;

        Arrays.sort(array);
        j = 0;
        k = array.length-1;

        while (j < array.length){
            arrayAux[j] = array[k];
            j++;
            k--;
        }

        System.out.println("El array ordenado es: ");
        for(String i : arrayAux){
            System.out.print(i + " ");
        } */

        //EJERCICIO 7
        /*7. Ordenar un array de objetos de una clase personalizada.*/

        //EJERCICIO 8
        /*8. Ordenar un array de objetos de una clase personalizada por un atributo
específico.*/

        //EJERCICIO 9
        /*9. Ordenar un array de números enteros utilizando el algoritmo de ordenamiento
burbuja.

        int [] array = new int[10];

        for (int i = 0; i < array.length; i++){
            array[i] = rm.nextInt(100);
        }

        burbuja(array);

        System.out.println("El array ordenado es: ");
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        } */

        //EJERCICIO 10
        /*10. Ordenar un array de números enteros utilizando el algoritmo de ordenamiento
por selección.

        int [] array = new int[10];

        for (int i = 0; i < array.length; i++){
            array[i] = rm.nextInt(100);
        }

        seleccion(array);

        System.out.println("El array ordenado es: ");
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        } */

        //EJERCICIO 11
        /*11. Ordenar un array de números enteros utilizando el algoritmo de ordenamiento
por inserción.

        int [] array = new int[10];

        for (int i = 0; i < array.length; i++){
            array[i] = rm.nextInt(100);
        }

        insercionDirecta(array);

        System.out.println("El array ordenado es: ");
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        } */

        //EJERCICIO 12
        /*12. Ordenar un array de números enteros utilizando el algoritmo de ordenamiento
        por mezcla.

        int [] array = new int[10];

        for (int i = 0; i < array.length; i++){
            array[i] = rm.nextInt(100);
        }

        quicksort(array, 0, array.length-1);

        System.out.println("El array ordenado es: ");
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        } */

        //EJERCICIO 13
        /*13. Ordenar un array de números enteros utilizando el algoritmo de ordenamiento
shell.

        int [] array = new int[10];

        for (int i = 0; i < array.length; i++){
            array[i] = rm.nextInt(100);
        }

        shell(array);

        System.out.println("El array ordenado es: ");
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }*/

        //EJERCICIO 14
        /*14.Codifique un algoritmo que permita cargar un array de una dimensión de 20
elementos enteros. Finalizada la carga de los 20 elementos el programa debe
solicitar como se desea ordenar el array ASCENDENTE O DESCENDENTE y que
método de ordenamiento aplicar (inserción, burbuja, selección), según las
opciones elegidas aplique el algoritmos fundamental de ordenamiento que
corresponda. Muestre por pantalla el array original desordenado y su resultante
ordenado según las opciones elegidas. */

        int [] array = new int[20];
        int optionAorD, optionMetod;

        for (int i = 0; i < array.length; i++){
            array[i] = rm.nextInt(100);
        }

        System.out.println("El arreglo desordenado es: ");

        for (int i : array){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.print("[1] Para inserción \n" +
                "[2] Para burbuja \n" +
                "[3] Para selección \n" +
                "Que metodo desea utilizar: ");

        optionMetod = sc.nextInt();

        if(optionMetod == 1){
            insercionDirecta(array);
        } else if (optionMetod == 2) {
            burbuja(array);
        } else if (optionMetod == 3) {
            seleccion(array);
        }else {
            System.out.println("Opción ingresada incorrecta");
        }

        System.out.print("[1] Para ascendente \n" +
                "[2] Para descendente \n" +
                "¿De que manera desea ordenar el array?: ");

        optionAorD = sc.nextInt();

        System.out.println("El arreglo ordenado es: ");
        if(optionAorD == 1){
            for (int i : array){
                System.out.print(i + " ");
            }
        } else if (optionAorD == 2) {
            int j, k;
            j = 0;
            k = array.length-1;

            int [] arrayAux = new int[20];

            while (j < array.length){
                arrayAux[j] = array[k];
                j++;
                k--;
            }

            for (int i : arrayAux){
                System.out.print(i + " ");
            }
        }
    }
}