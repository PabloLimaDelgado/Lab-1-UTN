import java.util.Random;
import  java.util.Scanner;

public class Main {

    //METODO 1
    /*public static void matrixAdder(int matrixOne[][], int matrixTwo[][]){

        int rows = matrixOne.length;
        int cols = matrixOne[0].length;

        int [][] matrixAux = new int[rows][cols];

        for(int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                matrixAux[i][j] = matrixOne[i][j] + matrixTwo[i][j];
            }
        }

        System.out.println("La suma de las 2 matrices es: ");
        for(int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
               System.out.print(matrixAux[i][j] + " ");
            }
            System.out.println();
        }
    } */

    //METODO 2
    /*public static int[][] matrixMultiplier(int matrixOne[][], int matrixTwo[][]){

        if (matrixOne[0].length == matrixTwo.length) {
            int rowsMatrixOne = matrixOne.length;
            int colsMatrixTwo = matrixTwo[0].length;
            int commonDimension = matrixOne[0].length;

            int[][] matrixAux = new int[rowsMatrixOne][colsMatrixTwo];

            for (int i = 0; i < rowsMatrixOne; i++) {
                for (int j = 0; j < colsMatrixTwo; j++) {
                    for (int k = 0; k < commonDimension; k++) {
                        matrixAux[i][j] += matrixOne[i][k] * matrixTwo[k][j];
                    }
                }
            }
            return matrixAux;
        } else {
            int rows = matrixOne.length;
            int cols = matrixOne[0].length;
            int[][] matrixAux = new int[rows][cols];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    matrixAux[i][j] = 0;
                }
            }
            return matrixAux;
        }
    }*/

    //METODO 3
    /*public static int[][] transposedMatrix(int matrixOne[][]){

        int [][] matrixAux = new int [matrixOne[0].length][matrixOne.length];
        for (int i = 0; i < matrixAux.length; i++){
            for (int j = 0; j < matrixAux[0].length; j++){
                matrixAux[i][j] = matrixOne[j][i];
            }
        }
        return matrixAux;
    } */

    //METODO 4
    /*public static boolean symmetricMatrix(int matrixOne[][]){
        int [][] matrixAux = transposedMatrix(matrixOne);

        for (int i = 0; i < matrixAux.length; i++){
            for (int j = 0; j < matrixAux[0].length; j++){
                if(matrixAux[i][j] != matrixOne[i][j]) {
                    return false;
                }
            }
        }
        return true;
    } */

    //METODO 5
    /*public static int sumarMatriz( int matriz[][]){
        int sum = 0,total = 0;

        for(int i = 0; i != matriz.length; i++){
            for(int j = 0; j != matriz.length;j++){
                sum +=matriz[i][j];
            }
            total += sum;
            sum = 0;
        }
        return total;

    } */

    //METODO 6
    /*public static String mayorNumero(int matriz[][]){
        int mayor = 0;
        String posicion = " ";
        for(int i = 0;i < matriz.length; i++){
            for (int j = 0; j< matriz.length;j++){
                if(matriz[i][j]>mayor){
                    mayor = matriz[i][j];
                    posicion = "El mayor número es: "+ mayor + " y está en la fila " + (i+1) + " y en la columna " + (j+1);
                }

            }

        }
        return posicion;
    } */

    //EJERCICIO 8
    /*public  static String sumaFila(int matriz[] [],int fil){
        int i = 0;
        int total = 0;
        fil = fil-1;
        while (i<matriz.length){
            total += matriz[fil][i];
            i++;
        }
        return "El total es: " + total;
    } */

    //EJERCICIO 9
    /*public static String diagonalNot(int array[][]){
        int n = 0;
        int contador_num = 0,  contador_verdad = 0;
        for (int i = 0; i<array.length;i++){

            for(int j = 0; j<array.length;j++){
                if(j==n && i == n && array[i][j] != 0){
                    contador_num+=1;
                } else if (array[i][j] != 0) {
                    contador_num +=1;
                }

            }
            if(contador_num == 1 ){
                contador_verdad+=1;
            }
            contador_num = 0;

            n++;
        }
        if(contador_verdad==(array.length)){
            return"La matriz está en forma diagonal";
        }else { return "La matriz no está en forma diagonal";}

    } */

    //METODO 10
    /*public static void matrizIdentidad(int t){
        Integer[][] matriz = new Integer[t][t];

        for (int i = 0; i < t; i++) {
            for (int j = 0; j < t; j++) {
                if (matriz[i] == matriz[j]) {
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < t; i++) {
            for (int j = 0; j < t; j++) {
                System.out.print(matriz[i][j]+ " ");
            }
            System.out.println(" ");
        }

    } */

    //METODO 11
    /*public static void parImpar(Integer [][] matriz){
        int pares,impares;
        pares=impares=0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(matriz[i][j]%2==0){
                    pares+=1;
                }else{
                    impares+=1;
                }
            }
        }
        System.out.println("Matriz ingresada");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j]+ " ");
            }
            System.out.println(" ");
        }
        System.out.println("La cantidad de elemntos pares en la matriz es de: "+pares);
        System.out.println("La cantidad de elemntos impares en la matriz es de: "+impares);
    } */

    //METODO 12
    /*public static void rotarMatriz(Integer [] [] matriz){
        Integer [] [] matriz_transpuesta= new Integer [3][3];
        Integer [] [] matriz_rotada= new Integer [3][3];
        int filas = matriz.length;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz_transpuesta[i][j]=matriz[j][i];
            }
        }

        for(int i = 0; i < matriz_rotada.length; i++) {
            for (int j = 0; j < matriz_rotada[i].length; j++) {
                matriz_rotada[i][j] = matriz_transpuesta[i][filas-1-j];
            }
        }
        System.out.println("Matriz Rotada");
        for(int i = 0; i < matriz_rotada.length; i++) {
            for (int j = 0; j < matriz_rotada[i].length; j++) {
                System.out.print(matriz_rotada[i][j] + " ");
            }
            System.out.println();
        }

    } */

    //METODO 13
    /*public static void bucarElemento(String [] [] matriz, String element){
        int contador;
        contador=0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(matriz[i][j].equals(element)){
                    contador+=1;
                }
            }
        }
        if(contador>0){
            System.out.println("El elemento "+element+" se encontro "+ contador +" vez/veces");
        }else{
            System.out.println("El elemento "+ element +" no se encontro en la matriz ");
        }

    } */

    //METODO 14
    /*public static void inverseMatrix(int [][] matrixOne){

        int [][] matrixAux = new int [matrixOne.length][matrixOne[0].length];

        for(int i=0; i < matrixOne.length; i++){
            for(int j= 0; j < matrixOne[0].length; j++){

                if(i == matrixOne.length-1){
                    matrixAux[i][j] = matrixOne[0][j];
                }else{
                    matrixAux[i][j] = matrixOne[i+1][j];
                }
            }
        }

        System.out.println("La matriz con las filas cambiadas es: ");
        for(int i=0; i < matrixOne.length; i++){
            for(int j= 0; j < matrixOne[0].length; j++){
                System.out.print(matrixAux[i][j] + " ");
            }
            System.out.println();
        }
    }*/

    //METODO 15
    /*public static void sumDiagonals(int [][] matrixOne){
        int sumDiagonalOne = 0, sumDiagonalTwo = 0;

        int k = 0;
        int l = matrixOne[0].length-1;

        for(int i = 0; i < matrixOne.length; i++){
            for(int j = 0; j < matrixOne[0].length; j++){

                if(i == j){
                    sumDiagonalOne = sumDiagonalOne + matrixOne[i][j];
                    if(k == 0){
                        //break;
                    }

                    sumDiagonalTwo += matrixOne[k][l];
                    System.out.print(sumDiagonalTwo + " ");
                    k++;
                    l--;
                }
            }
        }

        System.out.println("La suma de la diagonal principal es: "+ sumDiagonalOne);
        System.out.println("La suma de la diagonal inversa es: "+ sumDiagonalTwo);
    } */

    //METODO 16
    /*public static String matrizOctogonal(int matriz[][]) {
        int n = 0, matriz_transpuesta[][] = new int [matriz.length][matriz.length];

        if (matriz[0].length == matriz.length) {
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz.length; j++) {
                    matriz_transpuesta[j][i] = matriz[i][j];
                }
            }

            System.out.println("La matriz es: ");
            for (int i = 0;i< matriz.length;i++){
                for(int j = 0; j< matriz.length;j++){
                    System.out.print(matriz_transpuesta[i][j] + " ");
                    if (matriz_transpuesta[i][j] == matriz[i][j]){
                        n+=1;
                    }
                }
                System.out.println(" ");
            }
        } else{
            return "La matriz ingresada no es cuadrada";
        }
        if (n == (matriz.length*matriz.length)){
            return "La matriz es ortogonal";
        }else {
            return "La matriz no es ortogonal";
        }
    } */

    //METODO 17
    /*public static void maxValueRow(int [][] matrixOne){

        int [] arryAux = new int [matrixOne.length];
        int valueRow = 0;

        for(int i = 0; i < matrixOne.length; i++) {
            for (int j = 0; j < matrixOne[0].length; j++) {
                if(matrixOne[i][j] > valueRow){
                    valueRow = matrixOne[i][j];
                }
            }
            arryAux[i] = valueRow;
            valueRow = 0;
        }

        System.out.println("Los maximos valores de cada fila son: ");
        for (int i=0; i < matrixOne.length; i++){
            System.out.print(arryAux[i] + " ");
        }
    }*/

    public static void main(String[] args) {

        Random rm = new Random();
        Scanner sc = new Scanner(System.in);

        //EJERCICIO 1
        /*1. Escribir un método para sumar dos matrices de enteros y devolver la matriz resultante.
        int numRows, numColumns;

        System.out.print("Ingrese el número de filas: ");
        numRows = sc.nextInt();

        System.out.print("Ingrese el número de columnas: ");
        numColumns = sc.nextInt();

        int [][] matrixOne = new int [numRows][numColumns];
        int [][] matrixTwo = new int[numRows][numColumns];

        for(int i = 0; i < numRows; i++){
            for (int j = 0; j < numColumns; j++){
                matrixOne[i][j] = rm.nextInt(100);
                matrixTwo[i][j] = rm.nextInt(100);
            }
        }

        System.out.println("La matriz 1 es: ");
        for(int i = 0; i < numRows; i++){
            for (int j = 0; j < numColumns; j++){
                System.out.print(matrixOne[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("La matriz 2 es: ");
        for(int i = 0; i < numRows; i++){
            for (int j = 0; j < numColumns; j++){
                System.out.print(matrixTwo[i][j] + " ");
            }
            System.out.println();
        }

        matrixAdder(matrixOne, matrixTwo); */

        //EJERCICIO 2
        /*2. Implementar un método para multiplicar dos matrices de enteros y devolver el
resultado.
        int numRows, numColumns;

        System.out.print("Ingrese el número de filas: ");
        numRows = sc.nextInt();

        System.out.print("Ingrese el número de columnas: ");
        numColumns = sc.nextInt();

        int [][] matrixOne = new int [numRows][numColumns];
        int [][] matrixTwo = new int[numRows][numColumns];

        for(int i = 0; i < numRows; i++){
            for (int j = 0; j < numColumns; j++){
                matrixOne[i][j] = rm.nextInt(10);
                matrixTwo[i][j] = rm.nextInt(10);
            }
        }

        int [][] matrixThree = matrixMultiplier(matrixOne, matrixTwo);

        System.out.println("La matriz 1 es: ");
        for(int i = 0; i < numRows; i++){
            for (int j = 0; j < numColumns; j++){
                System.out.print(matrixOne[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("La matriz 2 es: ");
        for(int i = 0; i < numRows; i++){
            for (int j = 0; j < numColumns; j++){
                System.out.print(matrixTwo[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("La matriz multiplicada es: ");
        for(int i = 0; i < numRows; i++){
            for (int j = 0; j < numColumns; j++){
                System.out.print(matrixThree[i][j] + " ");
            }
            System.out.println();
        } */

        //EJERCICIO 3
        /*3. Crear una función que calcule la transpuesta de una matriz.

        int numRows, numColumns;

        System.out.print("Ingrese el número de filas: ");
        numRows = sc.nextInt();

        System.out.print("Ingrese el número de columnas: ");
        numColumns = sc.nextInt();

        int [][] matrixOne = new int [numRows][numColumns];

        for(int i = 0; i < numRows; i++){
            for (int j = 0; j < numColumns; j++){
                matrixOne[i][j] = rm.nextInt(100);
            }
        }

        System.out.println("La matriz original es: ");
        for(int i = 0; i < numRows; i++){
            for (int j = 0; j < numColumns; j++){
                System.out.print(matrixOne[i][j] + " ");
            }
            System.out.println();
        }

        int [][] matrixTwo = transposedMatrix(matrixOne);

        System.out.println("La matriz transpuesta es: ");
        for(int i = 0; i < matrixTwo.length; i++){
            for (int j = 0; j < matrixTwo[0].length; j++){
                System.out.print(matrixTwo[i][j] + " ");
            }
            System.out.println();
        } */

        //EJERCICIO 4
        /*4. Desarrollar un método para verificar si una matriz es simétrica (igual a su transpuesta).

        int numRows, numColumns;

        System.out.print("Ingrese el número de filas: ");
        numRows = sc.nextInt();

        System.out.print("Ingrese el número de columnas: ");
        numColumns = sc.nextInt();

        int [][] matrixOne = new int [numRows][numColumns];

        for(int i = 0; i < numRows; i++){
            for (int j = 0; j < numColumns; j++){
                //matrixOne[i][j] = rm.nextInt(100);
                System.out.print("Ingrese el valor de la posición [" + (i+1)+"]["+(j+1)+"]: ");
                matrixOne[i][j] = sc.nextInt();
            }
        }

        System.out.println("La matriz original es: ");
        for(int i = 0; i < numRows; i++){
            for (int j = 0; j < numColumns; j++){
                System.out.print(matrixOne[i][j] + " ");
            }
            System.out.println();
        }

        boolean symetricMatrix = symmetricMatrix(matrixOne);

        if(symetricMatrix == true){
            System.out.print("La matriz es transpuesta");
        }else{
            System.out.print("La matriz no es transpuesta");
        } */

        //EJERCICIO 5
        /*5. Escribir un método que calcule el producto escalar de un vector (matriz unidimensional)
por un número.

        int numAarry;
        float num;

        System.out.print("Ingrese el número de elementos del vector: ");
        numAarry = sc.nextInt();

        float array[] = new float[numAarry];

        for(int i = 0; i < numAarry; i++){
            array[i] = Math.round((rm.nextFloat() * 100) * 100.0f) / 100.0f;
        }

        System.out.print("Ingrese el número a multiplicar: ");
        num = sc.nextFloat();

        System.out.println("El vector original es: ");
        for(int i = 0; i < numAarry; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();

        System.out.println("El vector multiplicado escalarmente es: ");
        for(int i = 0; i < numAarry; i++){
            System.out.print((array[i]*num) + " ");
        } */

        //EJERCICIO 6
        /*6. Implementar una función que calcule la suma de todos los elementos de una matriz.

        int array6 [][] = new int[3][3];
        for(int j = 0; j< array6.length;j++){
            for(int l = 0; l< array6.length;l++){
                array6[j][l] = (int)(Math.random()*10);
                while (array6[j][l] ==0){
                    array6[j][l] = (int)(Math.random()*10);
                }
            }
        }

        System.out.println("La matriz original es: ");
        for(int j = 0; j< array6.length;j++){
            for(int l = 0; l< array6.length;l++){
                System.out.print(array6[j][l] +  " ");

            }
            System.out.println();
        }
        System.out.println("La suma de todos los elementos es: " + sumarMatriz(array6)); */

        //EJERCICIO 7
        /*7. Desarrollar un método para encontrar el elemento máximo en una matriz y su posición.

        int array7 [][] = new int [5] [5];
        for (int l = 0; l<array7.length; l ++){
            for(int j = 0 ; j<array7.length; j++){
                array7[l][j] = (int)(Math.random()*100);
            }
        }

        System.out.println("La matriz original es: ");
        for(int l = 0; l< array7.length;l++){
            for(int j = 0; j< array7.length;j++){
                System.out.print(array7[l][j]+ " ");

            }
            System.out.println( " ");
        }
        System.out.println(mayorNumero(array7)); */

        //EJERCICIO 8
        /*8. Crear una función que devuelva la suma de una fila específica de una matriz.

        int fil = 0, array8[][] = new int[4][4];
        for (int l = 0; l<array8.length; l ++){
            for(int j = 0 ; j<array8.length; j++){
                array8[l][j] = (int)(Math.random()*100);
                while(array8[l][j] == 0){
                    array8[l][j] = (int)(Math.random()*100);
                }
            }
        }
        for(int l = 0; l< array8.length;l++){
            for(int j = 0; j< array8.length;j++){
                System.out.print(array8[l][j]+ " ");

            }
            System.out.println( " ");
        }
        System.out.print("Que fila desea sumar: ");
        fil = sc.nextInt();
        while(fil>array8.length || fil <0){
            System.out.println("La matriz posee "+ array8.length+ " filas, ingrese un número valido: ");
            fil = sc.nextInt();
        }

        System.out.println(sumaFila(array8,fil)); */

        //EJERCICIO 9
        /*9. Implementar una función que determine si una matriz es diagonal (todos los elementos
fuera de la diagonal principal son cero).

        int array9[] [] = new int[3][3], n = 0;
        for(int l = 0; l< array9.length;l++){
            for(int j = 0; j< array9.length;j++){
                array9[l][j] = 0;
                if(l == n && j == n){
                    array9[l][j] = (int)(Math.random()*100);
                }else {
                    array9[l][j] = 0;
                }
            }
            n++;
        }
        for(int l = 0; l< array9.length;l++){
            for(int j = 0; j< array9.length;j++){
                System.out.print(array9[l][j]+ " ");

            }
            System.out.println( " ");
        }
        System.out.println(diagonalNot(array9)); */

        //EJERCICIO 10
        /*10.Crear una función que genere una matriz identidad de tamaño n.

        int tamanio;
        System.out.println("Ingrese el tamaño de la matriz: ");
        tamanio = sc.nextInt();
        matrizIdentidad(tamanio); */

        //EJERCICIO 11
        /*11.Escribir un método para contar la cantidad de elementos pares e impares en una matriz.
        Integer[][] matriz_numeros = new Integer[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Ingrese numeros para llenar la matriz: ");
                matriz_numeros[i][j] = sc.nextInt();
            }
        }
        parImpar(matriz_numeros); */

        //EJERCICIO 12
        /* 12. Implementar una función que rote una matriz 90 grados en sentido horario.

        Integer [][] matriz = {
                {10, 12, 14},
                {16, 18, 20},
                {22, 24, 26}
        };

        System.out.println("Matriz Original ");
        for(int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        rotarMatriz(matriz); */

        //EJERCICIO 13
        /*13.Desarrollar un método para encontrar el número de veces que aparece un valor
específico en una matriz.

        String [][] matriz = new String[3][3];
        String elemento ;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Ingrese valores para llenar la matriz: ");
                matriz[i][j]=sc.nextLine();
            }
        }

        System.out.println("Ingrese elemento que quiere buscar en la matriz: ");
        elemento=sc.nextLine();

        bucarElemento(matriz,elemento); */

        //EJERCICIO 14
        /*14.Crear una función que invierta el orden de las filas en una matriz

        int numRows, numColumns;

        System.out.print("Ingrese el número de filas: ");
        numRows = sc.nextInt();

        System.out.print("Ingrese el número de columnas: ");
        numColumns = sc.nextInt();

        int [][] matrixOne = new int [numRows][numColumns];

        for(int i = 0; i < numRows; i++){
            for (int j = 0; j < numColumns; j++){
                matrixOne[i][j] = rm.nextInt(100);
            }
        }

        System.out.println("La matriz 1 es: ");
        for(int i = 0; i < numRows; i++){
            for (int j = 0; j < numColumns; j++){
                System.out.print(matrixOne[i][j] + " ");
            }
            System.out.println();
        }

        inverseMatrix(matrixOne); */

        //EJERCICIO 15
        /*15.Escribir un método para sumar todas las diagonales de una matriz cuadrada.

        int numRows;

        System.out.print("Ingrese el número de filas: ");
        numRows = sc.nextInt();

        int [][] matrixOne = new int [numRows][numRows];

        for(int i = 0; i < numRows; i++){
            for (int j = 0; j < numRows; j++){
                matrixOne[i][j] = rm.nextInt(100);
            }
        }

        System.out.println("La matriz 1 es: ");
        for(int i = 0; i < numRows; i++){
            for (int j = 0; j < numRows; j++){
                System.out.print(matrixOne[i][j] + " ");
            }
            System.out.println();
        }

        sumDiagonals(matrixOne); */

        //EJERCICIO 16
        /*16. Implementar una función que verifique si una matriz es ortogonal (su transpuesta es
igual a su inversa).

        int matrix[][] = {
                {1,6,0},
                {6,-3,8},
                {0,8,4}
        };
        System.out.println(matrizOctogonal(matrix));*/

        //EJERCICIO 17
        /*17.Desarrollar un método para encontrar el valor mínimo en cada fila de una matriz y
devolverlos en un arreglo.

        int numRows, numColumns;

        System.out.print("Ingrese el número de filas: ");
        numRows = sc.nextInt();

        System.out.print("Ingrese el número de columnas: ");
        numColumns = sc.nextInt();

        int [][] matrixOne = new int [numRows][numColumns];

        for(int i = 0; i < numRows; i++){
            for (int j = 0; j < numColumns; j++){
                matrixOne[i][j] = rm.nextInt(100);
            }
        }

        System.out.println("La matriz es: ");
        for(int i = 0; i < numRows; i++){
            for (int j = 0; j < numColumns; j++){
                System.out.print(matrixOne[i][j] + " ");
            }
            System.out.println();
        }

        maxValueRow(matrixOne); */

        //EJERCICIO 18
        /*18.Crear una función que calcule el producto de matrices de diferentes tamaños, si es
posible; de lo contrario, devolver una matriz nula

        int numRows, numColumns;

        System.out.print("Ingrese el número de filas de la matriz 1: ");
        numRows = sc.nextInt();

        System.out.print("Ingrese el número de columnas de la matriz 1: ");
        numColumns = sc.nextInt();

        int [][] matrixOne = new int [numRows][numColumns];

        for(int i = 0; i < numRows; i++){
            for (int j = 0; j < numColumns; j++){
                matrixOne[i][j] = rm.nextInt(10);
            }
        }

        System.out.print("Ingrese el número de filas de la matriz 2: ");
        numRows = sc.nextInt();

        System.out.print("Ingrese el número de columnas de la matriz 2: ");
        numColumns = sc.nextInt();

        int [][] matrixTwo = new int[numRows][numColumns];

        for(int i = 0; i < numRows; i++){
            for (int j = 0; j < numColumns; j++){
                matrixTwo[i][j] = rm.nextInt(10);
            }
        }

        int [][] matrixThree = matrixMultiplier(matrixOne, matrixTwo);

        System.out.println("La matriz 1 es: ");
        for(int i = 0; i < matrixOne.length; i++){
            for (int j = 0; j < matrixOne[0].length; j++){
                System.out.print(matrixOne[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("La matriz 2 es: ");
        for(int i = 0; i < matrixTwo.length; i++){
            for (int j = 0; j < matrixTwo[0].length; j++){
                System.out.print(matrixTwo[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("La matriz multiplicada es: ");
        for(int i = 0; i < matrixThree.length; i++){
            for (int j = 0; j < matrixThree[0].length; j++){
                System.out.print(matrixThree[i][j] + " ");
            }
            System.out.println();
        }*/
    }
}