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
    public static void main(String[] args) {

        char [][] adn = new char[6][6];
        char [][] adnMutant = new char[6][6];

        adnMutant[0][0] = 'T';
        adnMutant[0][1] = 'G';
        adnMutant[0][2] = 'A';
        adnMutant[0][3] = 'C';
        adnMutant[0][4] = 'G';
        adnMutant[0][5] = 'T';

        adnMutant[1][0] = 'A';
        adnMutant[1][1] = 'G';
        adnMutant[1][2] = 'A';
        adnMutant[1][3] = 'A';
        adnMutant[1][4] = 'G';
        adnMutant[1][5] = 'C';

        adnMutant[2][0] = 'A';
        adnMutant[2][1] = 'G';
        adnMutant[2][2] = 'A';
        adnMutant[2][3] = 'A';
        adnMutant[2][4] = 'C';
        adnMutant[2][5] = 'C';

        adnMutant[3][0] = 'G';
        adnMutant[3][1] = 'G';
        adnMutant[3][2] = 'T';
        adnMutant[3][3] = 'A';
        adnMutant[3][4] = 'C';
        adnMutant[3][5] = 'A';

        adnMutant[4][0] = 'T';
        adnMutant[4][1] = 'G';
        adnMutant[4][2] = 'T';
        adnMutant[4][3] = 'G';
        adnMutant[4][4] = 'T';
        adnMutant[4][5] = 'T';

        adnMutant[5][0] = 'A';
        adnMutant[5][1] = 'G';
        adnMutant[5][2] = 'A';
        adnMutant[5][3] = 'C';
        adnMutant[5][4] = 'C';
        adnMutant[5][5] = 'A';

        //fillMatrix(adn);
        //showMatrix(adn);

        showMatrix(adnMutant);
        //System.out.print(horizontalGeneVerification(adnMutant));
        //System.out.print(verticalGeneVerification(adnMutant));

        System.out.print(mainDiagonalsGeneVerification(adnMutant));
    }
}