import Users.User;
import DB.Database;

import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String first_name, last_name, email, password, respuesta;
        Date days = null;
        int cp, number;

        Database myDatabase = new Database("MyDB");

        //EXPRESIONES REGULARES
        String nameRegex = "^[A-Z][a-zA-Z]*$";
        String emailRegex = "^(.+)@(gmail|hotmail)\\.com$";
        String dateRegex = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/(19|20)\\d{2}$";
        String passwordRegex = ".*\\d.*";
        String cpRegex = "^\\d{4}$";
        String numeroRegex = "^261\\d{3,}$";


        while (true){
            //NOMBRE
            do {
                System.out.print("Ingrese el primer nombre: ");
                first_name = sc.nextLine();

                System.out.print("Ingrese el apellido: ");
                last_name = sc.nextLine();

                if (first_name.matches(nameRegex) && last_name.matches(nameRegex)) {
                    System.out.println("Nombres válidos.");
                    break;
                } else {
                    System.out.println("Nombres no válidos. Asegúrese de que las primeras letras sean mayúsculas y no contengan números.");
                }
            }while (true);

            //CORREO ELECTRONICO
            do {
                System.out.print("Ingrese su correo electrónico: ");
                email = sc.nextLine();
                if (email.matches(emailRegex)) {
                    System.out.println("Correo electrónico válido.");
                    break;
                } else {
                    System.out.println("Correo electrónico no válido. Debe ser de gmail.com o hotmail.com.");
                }
            } while (true);

            //VALIDACION DE FECHAS
            do {
                System.out.print("Ingrese la fecha (dd/mm/yyyy): ");
                String dateStr = sc.nextLine();
                if (dateStr.matches(dateRegex)) {
                    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                    try {
                        days = dateFormat.parse(dateStr);
                        System.out.println("Fecha válida: " + days);
                        break;
                    } catch (ParseException e) {
                        System.out.println("Fecha no válida. Debe tener el formato dd/mm/yyyy.");
                    }
                } else {
                    System.out.println("Fecha no válida. Debe tener el formato dd/mm/yyyy.");
                }
            } while (true);

            //VALIDACION DE CONTRASEÑA
            do {
                System.out.print("Ingrese su contraseña: ");
                password = sc.nextLine();
                if (password.matches(passwordRegex)) {
                    System.out.println("Contraseña válida.");
                    break;
                } else {
                    System.out.println("La contraseña debe contener al menos un número.");
                }
            } while (true);

            //VALIDACION DE CODIGO POSTAL
            do {
                System.out.print("Ingrese el código postal (4 dígitos): ");
                String cpStr = sc.nextLine();
                if (cpStr.matches(cpRegex)) {
                    cp = Integer.parseInt(cpStr);
                    System.out.println("Código postal válido.");
                    break;
                } else {
                    System.out.println("Código postal no válido. Debe tener exactamente 4 dígitos.");
                }
            } while (true);

            // Validación del número
            do {
                System.out.print("Ingrese un número (debe comenzar con '261'): ");
                if (sc.hasNextInt()) {
                    number = sc.nextInt();
                    String numberAux = Integer.toString(number);
                    if (numberAux.matches(numeroRegex)) {
                        System.out.println("Número válido.");
                        break;
                    } else {
                        System.out.println("Número no válido. Debe comenzar con '261' seguido de dígitos.");
                    }
                } else {
                    System.out.println("Entrada no válida. Ingrese un número entero.");
                    sc.next();  // Consumir la entrada no válida
                }
            } while (true);

            User user_one = new User(first_name,last_name,email,number,cp,days,password);

            myDatabase.insertUserToDB(user_one);

            System.out.print("¿Desea agregar otro usuario? (S/N): ");
            respuesta = sc.nextLine().toLowerCase();
            sc.nextLine();
            if (!respuesta.equals("s")) {
                break; // Si la respuesta no es "s", salir del bucle
            }
        }

        myDatabase.showUsersFromDB();
    }
}