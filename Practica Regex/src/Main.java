import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //EJERCICIO 1
        /*1. Validación de Teléfono: Escribe un programa que solicite al usuario su número de
teléfono. Utiliza la validación de teléfono proporcionada para garantizar que el número
tenga entre 7 y 10 dígitos.

        String phone;
        String numeroRegex = "^261\\d{4,7}$";

        do{
            System.out.print("Escribe un número de telefono: ");
            phone = sc.nextLine();

            if(phone.matches(numeroRegex)){
                break;
            }
        }while(true);*/

        //EJERCICIO 2
        /*2. Validación de CUIL: Crea un programa que pida al usuario su número de CUIL. Utiliza la
validación de CUIL proporcionada para verificar que el número tenga exactamente 11
dígitos.

        String cuil;
        String cuilRegex = "\\d{11}";

        do{
            System.out.print("Escribe un número de CUIL: ");
            cuil = sc.nextLine();

            if(cuil.matches(cuilRegex)){
                break;
            }
        }while(true); */

        //EJERCICIO 3
        /*3. Validación de Correo Electrónico: Desarrolla un programa que solicite una dirección de
correo electrónico. Utiliza la validación de correo electrónico proporcionada para
asegurarte de que la dirección cumple con un formato de correo electrónico válido

        String email;
        String  emailRegex = "^(.+)@(gmail|hotmail)\\.com$";

        do {
            System.out.print("Escribe un mail: ");
            email = sc.nextLine();

            if(email.matches(emailRegex)){
                break;
            }
        }while (true); */

        //EJERCICIO 4
        /*4. Validación de Nomenclatura: Escribe un programa que requiera al usuario ingresar una
nomenclatura de 22 caracteres. Usa la validación de nomenclatura para comprobar
que la entrada tiene la longitud y el formato correctos.

        String nomenclatura;
        String  nomenclaturaRegex = ".{22}";

        do {
            System.out.print("Escribe un Nomenclatura: ");
            nomenclatura = sc.nextLine();

            if(nomenclatura.matches(nomenclaturaRegex)){
                break;
            }
        }while (true); */

        //EJERCICIO 5
        /*5. Validación de Letras: Crea un programa que pida al usuario ingresar un nombre. Utiliza
        la validación de letras para asegurarte de que solo contenga letras y tenga entre 7 y 10
        caracteres.

        String letra;
        String  letraRegex = "^[A-Za-z]{7,10}$";

        do {
            System.out.print("Escribe un nombre: ");
            letra = sc.nextLine();

            if(letra.matches(letraRegex)){
                break;
            }
        }while (true); */

        //EJERCICIO 6
        /*6. Combinación de Validaciones: Desarrolla un programa que solicite al usuario su
número de teléfono, CUIL y correo electrónico. Aplica las validaciones adecuadas a
cada entrada.

        String phone, cuil, email;

        String numeroRegex = "^261\\d{4,7}$";
        String cuilRegex = "\\d{11}";
        String  emailRegex = "^(.+)@(gmail|hotmail)\\.com$";

        do {
            System.out.print("Escribe un número de telefono: ");
            phone = sc.nextLine();

            System.out.print("Escribe un mail: ");
            email = sc.nextLine();

            System.out.print("Escribe un número de CUIL: ");
            cuil = sc.nextLine();

            if(phone.matches(numeroRegex) && cuil.matches(cuilRegex) && email.matches(emailRegex)){
                break;
            }
        }while (true); */

        //EJERCICIO 7
        /*7. Validación de Correo Electrónico Múltiple: Escribe un programa que permita al usuario
        ingresar una lista de correos electrónicos separados por comas. Aplica la validación de
        correo electrónico a cada dirección y muestra un mensaje de error si alguna de ellas es
        inválida.

        int correct;
        String emails;
        String emailRegex = "^(.+)@(gmail|hotmail)\\.com$";

        do {
            System.out.print("Escribe los mails separados por coma: ");
            emails = sc.nextLine();

            correct = 0;

            String [] email = emails.split(",");

            //Recorre la lista de correos electrónicos y valida cada uno
            for (String emailsFor : email) {
                String auxEmail = emailsFor.trim(); // Elimina espacios en blanco alrededor

                if (auxEmail.matches(emailRegex)) {
                    System.out.println(emailsFor + " es un correo electrónico válido.");
                } else {
                    System.out.println(emailsFor + " no es un correo electrónico inválido.");
                    correct = 1;
                }
            }
        }while (correct == 1); */

        //EJERCICIO 8
        /*8. Validación de Teléfono Internacional: Crea un programa que solicite al usuario un
número de teléfono internacional. Utiliza una variante de la validación de teléfono para
aceptar números que contengan el prefijo internacional.

        String internacionalNumber;
        String internacionalNumberRegex = "^\\+\\d{1,3} \\d{7}$";

        do {
            System.out.print("Ingrese un número internacional: ");
            internacionalNumber = sc.nextLine();

            if(internacionalNumber.matches(internacionalNumberRegex)){
                break;
            }
        }while (true); */

        //EJERCICIO 9
        /*9. Validación de Correo Electrónico Personalizado: Desarrolla un programa que requiera
una dirección de correo electrónico. Utiliza una versión personalizada de la validación
de correo electrónico que acepte solo dominios de correo electrónico específicos (por
ejemplo, "miempresa.com").

        String personEmail;
        String personEmailRegex = "^(.+)@miempresa\\.com$";
        do {
            System.out.print("Ingrese su mail de la empresa: ");
            personEmail = sc.nextLine();

            if(personEmail.matches(personEmailRegex)){
                break;
            }
        }while (true); */

        //EJERCICIO 10
        /*10. Validación de Código Postal: Escribe un programa que pida al usuario su código postal.
        Utiliza una versión modificada de la validación de letras que permita letras y números,
        pero asegúrate de que tenga el formato correcto

        String cp;
        String cpRegex = "^[A-Z]{2}\\d{2}";

        do {
            System.out.print("Introduce el codigo postal: ");
            cp = sc.nextLine();

            if(cp.matches(cpRegex)){
                break;
            }
        }while (true); */

        //EJERCICIO 11
        /*11. Validación de DNI: Crea un programa que solicite al usuario su número de Documento
Nacional de Identidad (DNI). Utiliza una versión adaptada de la validación de CUIL para
asegurarte de que tenga exactamente 8 dígitos.

        String dni;
        String dniRegex = "\\d{8}";

        do{
           System.out.print("Ingrese el DNI: ");
           dni = sc.nextLine();

           if(dni.matches(dniRegex)){
               break;
           }
        }while (true); */
    }
}