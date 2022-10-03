/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicas_datos;

import java.io.Console;
import java.util.Scanner;

/**
 *
 * @author alexish
 */
public class Practicas_Datos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int op;

        String pass = "Contraseña";
        int intentos = 0;
        Console console = System.console();
        if (console == null) {
            System.out.println("Ejecuta el Programa desde una Consola");
            System.exit(0);
        }
        do {
            char passwordArray[] = console.readPassword("Ingresa Tu Contraseña: ");
            if (pass.equals(new String(passwordArray))) {

                do {
                    Scanner in = new Scanner(System.in);

                    System.out.println("1.- Ingresar Precios\n"
                            + "2.- Ingresar Capitales\n"
                            + "3.- Ingresar Estudiantes\n"
                            + "4.- Ingresar Arreglos CURP\n"
                            + "5.- Salir\n"
                            + "Ingresa una opcion (1-5): ");

                    op = in.nextInt();

                    switch (op) {
                        case 1:
                            ejercicio_uno(in);
                            break;
                        case 2:
                            ejercicio_dos(in);
                            break;
                        case 3:
                            ejercicio_tres(in);
                            break;
                        case 4:
                            ejercicio_cuatro(in);
                            break;
                        case 5:
                            System.out.println("Adios Mundo by HeraCode");
                            break;
                        default:
                            System.out.println("Opcion " + op + " No Valida");
                            break;

                    }

                } while (op != 5);

            } else {
                System.out.println("Contraseña Incorrecta!");
                intentos = intentos + 1;
            }

        } while (intentos < 3);

        System.out.println("Demasiados Intentos!");

    }

    public static void ejercicio_uno(Scanner as) {
        System.out.println("¿Cuantos precios va a ingresar?");
        int catn = as.nextInt();
        float precios[] = new float[catn];
        for (int i = 0; i < precios.length; i++) {
            System.out.println("Ingresa el precio numero: " + (i + 1));
            precios[i] = as.nextFloat();
        }

        System.out.println("\n*-*-*-*-*-*-*-*-*-*-*-*\n");
        System.out.println("La lista de precios quedo de la siguiente manera:");

        for (int a = 0; a < precios.length; a++) {
            System.out.println("Producto " + a + ": " + precios[a]);
        }
    }

    public static void ejercicio_dos(Scanner as) {
        System.out.println("¿Cuantas capitales va a ingresar?");
        int catn = as.nextInt();
        String precios[] = new String[catn];
        for (int i = 0; i < precios.length; i++) {
            System.out.println("Ingresa la capital numero: " + (i + 1));
            precios[i] = as.next();
        }

        System.out.println("\n*-*-*-*-*-*-*-*-*-*-*-*\n");
        System.out.println("La lista de capitales quedo de la siguiente manera:");

        for (int a = 0; a < precios.length; a++) {
            System.out.println("Capital " + a + ": " + precios[a]);
        }
    }

    public static void ejercicio_tres(Scanner as) {
        System.out.println("¿Cuantos estudiantes va a ingresar?");
        int catn = as.nextInt();
        String precios[] = new String[catn];
        for (int i = 0; i < precios.length; i++) {
            System.out.println("Ingresa al estudiante numero: " + (i + 1));
            precios[i] = as.next();
        }

        System.out.println("\n*-*-*-*-*-*-*-*-*-*-*-*\n");
        System.out.println("La lista de estudiantes quedo de la siguiente manera:");

        for (int a = 0; a < precios.length; a++) {
            System.out.println("Estudiante " + a + ": " + precios[a]);
        }
    }

    public static void ejercicio_cuatro(Scanner as) {
        System.out.println("¿Cuantas CURP va a ingresar?");
        int catn = as.nextInt();
        String precios[] = new String[catn];
        for (int i = 0; i < precios.length; i++) {
            System.out.println("Ingresa la CURP numero: " + (i + 1));
            precios[i] = as.next();
        }

        System.out.println("\n*-*-*-*-*-*-*-*-*-*-*-*\n");
        System.out.println("La lista de CURPS quedo de la siguiente manera:");

        for (int a = 0; a < precios.length; a++) {
            System.out.println("CURP " + a + ": " + precios[a]);
        }
    }

}
