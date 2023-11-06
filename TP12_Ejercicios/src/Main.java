import  java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <String> mails = new ArrayList<>();

        String cadena, dni, mail;

        //EXPRESIONES REGULARES
        String noTerminaConDigitoRegex = ".*[^\\d]$";
        String noEmpiezaConDigitoRegex = "^\\D.*";
        String entre5y10LetrasRegex = "^[a-zA-Z]{5,10}$";
        String abcRegex = ".*abc.*";
        String dniRegex = "^\\d{2}-\\d{3}-\\d{3}$";
        String emailRegex = "^(.+)@(gmail|hotmail)\\.com$";

        System.out.print("Ingrese una cadena: ");
        cadena = sc.next();

        //System.out.print("Ingrese un DNI:");
        //dni = sc.next();


        //NO TERMINA CON DIGITO
        while (!cadena.matches(noTerminaConDigitoRegex)){
            System.out.print("Ingrese una cadena que no termine con digito: ");
            cadena = sc.next();
        }

        //NO EMPIEZA CON DIGITO
        while (!cadena.matches(noEmpiezaConDigitoRegex)){
            System.out.print("Ingrese una cadena que no empieze con digito: ");
            cadena = sc.next();
        }

        //ENTRE 5 Y 10 MAYUSCULAS O MINUSCULAS
        while (!cadena.matches(entre5y10LetrasRegex)){
            System.out.print("Ingrese una cadena que tenga entre 5 o 10 letras: ");
            cadena = sc.next();
        }

        //ABC
        while (!cadena.matches(abcRegex)){
            System.out.print("Ingrese una cadena que tenga la secuencia abc: ");
            cadena = sc.next();
        }

        /*//DNI CON FORMATO XX-XXX-XXX
        while (!dni.matches(dniRegex)) {
            System.out.print("DNI no válido. Ingrese un DNI válido (xx-xxx-xxx): ");
            dni = sc.next();
        }


        int intAñadirMail;
        do {
            System.out.print("Desea ingresar un usuario al mail [0] para salir: ");
            intAñadirMail = sc.nextInt();

            if (intAñadirMail == 0) {
                break;
            } else {
                System.out.print("Ingrese un mail: ");
                mail = sc.next();

                while (!mail.matches(emailRegex)) {
                    System.out.println("Correo electrónico no válido. Debe ser de gmail.com o hotmail.com: ");
                    System.out.print("Ingrese un mail: ");
                    mail = sc.next();
                }

                mails.add(mail);
            }
        } while (intAñadirMail != 0); */
    }
}