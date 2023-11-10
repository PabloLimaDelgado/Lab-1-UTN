import java.util.Scanner;

public class Main {

    //Metodo que llena la matriz
    public static char[][] fillMatrix(char adn[][]){
        Scanner sc = new Scanner(System.in);
        String adnFormatRegex = "^[ACGT]$";
        String inputLetter;

        for (int i = 0; i < adn.length; i++){
            for (int j = 0; j < adn[0].length; j++){
                do {
                    System.out.print("Ingrese el adn en la posición ["+(i+1)+"]" + "["+(j+1)+"]: ");
                    inputLetter = sc.next();

                    if (!inputLetter.matches(adnFormatRegex)){
                        System.out.println("Caracter incorrecto");
                    }
                }while (!inputLetter.matches(adnFormatRegex));

                adn[i][j] = inputLetter.charAt(0);
            }
            System.out.println();
        }

        return  adn;
    }

    //Metodo que transpone la matriz
    public static char[][] transposedMatrix(char adn[][]) {

        char[][] matrixAux = new char[adn[0].length][adn.length];
        for (int i = 0; i < matrixAux.length; i++) {
            for (int j = 0; j < matrixAux[0].length; j++) {
                matrixAux[i][j] = adn[j][i];
            }
        }
        return matrixAux;
    }

    //Metodo que copia en espejo la matriz
    public static char[][] mirrorMatrix(char[][] adn) {
        int rows = adn.length;
        int cols = adn[0].length;
        char[][] matrixAux = new char[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrixAux[i][j] = adn[i][cols - 1 - j];
            }
        }

        return matrixAux;
    }

    //Metodo que muestra la matriz
    public static void showMatrix(char adn[][]){
        System.out.println("El ADN es: ");
        for (int i = 0; i < adn.length; i++){
            for (int j = 0; j < adn[0].length; j++){
                System.out.print(adn[i][j] + " ");
            }
            System.out.println();
        }
    }

    //Verifica las combinaciones horizontales
    public static int horizontalGeneVerification(char adn[][]) {
        int counterGenes = 0;

        for (int i = 0; i < adn.length; i++) {
            int counter = 1;

            for (int j = 0; j < adn[0].length - 1; j++) {
                if (adn[i][j] == adn[i][j + 1]) {
                    counter++;

                    if (counter == 4) {
                        counterGenes++;
                        break;
                    }
                } else {
                    counter = 1;
                }
            }
        }

        return counterGenes;
    }

    //Verifica las combinaciones verticales
    public static int verticalGeneVerification(char adn[][]){
        int counterGenes;
        char [][] adnAux = transposedMatrix(adn);

        counterGenes = horizontalGeneVerification(adnAux);
        return counterGenes;
    }

    //Verifica la combinacion de las diagonales principales
    public static int mainDiagonalsGeneVerification(char adn[][]){
        int mainDiagonal = diagonalGeneVerification(adn, 0, 0);
        int upMainDiagonalLong = diagonalGeneVerification(adn, 0, 1);
        int upMainDiagonalShort = diagonalGeneVerification(adn, 0, 2);
        int downMainDiagonalLong = diagonalGeneVerification(adn, 1, 0);
        int downMainDiagonalShort = diagonalGeneVerification(adn, 2, 0);

        return mainDiagonal + upMainDiagonalLong + upMainDiagonalShort + downMainDiagonalLong + downMainDiagonalShort;
    }

    //Verifica la combinacion de las diagonales opuestas
    public static int oppositeDiagonalsGeneVerification(char adn[][]){
        char [][] adnAux = mirrorMatrix(adn);

        return mainDiagonalsGeneVerification(adnAux);
    }

    //Verifica la combinacion de una diagonal
    public static int diagonalGeneVerification(char adn[][], int row, int col){
        int rows = adn.length;
        int cols = adn[0].length;

        while ((row < rows - 3) && (col < cols - 3)){
            if((adn[row][col] == adn[row+1][col+1]) && (adn[row][col] == adn[row+2][col+2]) && (adn[row][col] == adn[row+3][col+3])){
                return 1;
            }

            row++;
            col++;
        }
        return 0;
    }

    //Verifica si el ADN era mutante
    public static boolean isMutant(char adn[][]){
        int horizontalVerification = horizontalGeneVerification(adn);
        int verticalVerification = verticalGeneVerification(adn);
        int mainDiagonalVerification = mainDiagonalsGeneVerification(adn);
        int oppositeDiagonalVerification = oppositeDiagonalsGeneVerification(adn);

        if (horizontalVerification + verticalVerification + mainDiagonalVerification + oppositeDiagonalVerification >= 2){
            return true;
        } else{
            return false;
        }
    }
    public static void main(String[] args) {

        char [][] adn = new char[6][6];

        fillMatrix(adn);
        showMatrix(adn);
        System.out.print(isMutant(adn));
    }
}