package agenda_telefonica;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        sn.useDelimiter("\n");
        boolean salir = false;
        int opcion;

        Agenda agendaTelefonica = new Agenda(3);
        String nombre;
        int telefono;

        Contacto c;

        while (!salir) {

            System.out.println("1. Crear nuevo contacto");
            System.out.println("2. Mostrar contactos");
            System.out.println("3. Borrar contacto");

            System.out.println("4. Salir");
            try {
                System.out.println("Escribe el numero de la opcion deseada");
                opcion = sn.nextInt();

                switch (opcion) {
                    case 1:

                        System.out.println("Escribe un nombre");
                        nombre = sn.next();

                        System.out.println("Escribe un telefono");
                        telefono = sn.nextInt();

                        c = new Contacto(nombre, telefono);

                        agendaTelefonica.crearContacto(c);

                        break;
                    case 2:

                        agendaTelefonica.mostrarContactos();

                        break;

                    case 3:

                        System.out.println("Escribe un nombre");
                        nombre = sn.next();

                        c = new Contacto(nombre, 0);

                        agendaTelefonica.borrarContacto(c);

                        break;

                    case 4:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 4");
                }

            } catch (InputMismatchException e) {
                System.out.println("Solo puedes insertar números");
                sn.next();
            }

        }

    }

}
