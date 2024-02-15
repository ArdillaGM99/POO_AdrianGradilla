package edu.adrian_gradilla.reto4.ui;

import java.util.Scanner;

public class CLI {

    public void ShowMenu() {
        Scanner scanner = new Scanner(System.in);
        char opcion;

        do {
            System.out.println("---Sistema de registro de ventas---");
            System.out.println("A. Realizar venta de boleto.");
            System.out.println("B. Mostrar datos de la lista de ventas.");
            System.out.println("S. Finalizar el programa.");

            opcion = scanner.next().charAt(0);

            switch (opcion) {
                case 'A':
                    OpcionA(scanner);
                    break;
                case 'B':
                    OpcionB();
                    break;
                case 'S':
                    System.out.println("-----Fin del programa v 1.1-------- ");
                    break;
                default:
                    System.out.println("Opción no válida, inténtalo de nuevo.");
            }
        } while (opcion != 'S');
    }

    public void OpcionA(Scanner scanner) {
        System.out.println("Ingresar nombre de comprador: ");
        String nombre = scanner.next();
        System.out.println("Ingresar cantidad de pasajeros adicionales: ");
        int cantidadPasajeros = scanner.nextInt();



