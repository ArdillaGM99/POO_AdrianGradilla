package edu_AdrianGradilla.Reto7.CLI;

import edu_AdrianGradilla.Reto7.Process.*;

import java.util.Scanner;

public class CLI_Operaciones {
    public static void showmenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("********************************************");
            System.out.println("Escoge una operacion                        *");
            System.out.println("1. Resta                                    *");
            System.out.println("2. Suma                                     *");
            System.out.println("3. division                                 *");
            System.out.println("4. Multiplicacion                           *");
            System.out.println("5. logaritmo                                *");
            System.out.println("6. Raiz                                     *");
            System.out.println("3. Salir                                    *");
            System.out.println("********************************************");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    Resta.Resta();
                    break;

                case 2:
                    Suma.Suma();
                    break;
                case 3:
                    division.division();
                    break;
                case 4:
                    Multiplicacion.Multiplicacion();
                    break;
                case 5:
                    logaritmo.Logaritmo();
                    break;
                case 6:
                    Raiz.Raiz();
                case 7:
                    System.out.println("Saliendo del programa.");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                    break;
            }
        }
    }
}
