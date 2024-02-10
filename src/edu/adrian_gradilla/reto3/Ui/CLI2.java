package edu.adrian_gradilla.reto3.Ui;

import edu.adrian_gradilla.reto3.Process.Calculos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CLI2 {

    private final Scanner scanner;
    private int filas;
    private int columnas;
    private final Calculos calculo;

    /*Constructor que inicializa el Scanner y la instancia de Calculos*/
    public CLI2() {
        this.scanner = new Scanner(System.in);
        solicitarFilasColumnas();
        this.calculo = new Calculos(filas, columnas);
    }

    /*Método para solicitar al usuario la cantidad de filas y columnas*/
    private void solicitarFilasColumnas() {
        do {
            try {
                System.out.print("Ingrese la cantidad de filas: ");
                filas = scanner.nextInt();
                System.out.print("Ingrese la cantidad de columnas: ");
                columnas = scanner.nextInt();

                if (filas <= 0 || columnas <= 0) {
                    System.out.println("Ingrese valores mayores que 0 para filas y columnas.");
                } else {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Por favor, ingrese valores numéricos válidos.");
                scanner.nextLine(); // Limpiar el buffer
            }
        } while (true);
    }

    /*Método para mostrar el menú y realizar operaciones según la elección del usuario*/
    public void showMenu() {
        char opcion;
        do {
            System.out.println("\nMenú:");
            System.out.println("A. Contar pares e impares por filas");
            System.out.println("B. Contar pares e impares por columnas");
            System.out.println("C. Mostrar suma de todos los números");
            System.out.println("S. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.next().charAt(0);

            switch (opcion) {
                case 'A':
                    calculo.contarParesImparesPorFilas();
                    break;
                case 'B':
                    calculo.contarParesImparesPorColumnas();
                    break;
                case 'C':
                    int suma = calculo.calcularSumaMatriz();
                    System.out.println(STR."La suma total de los valores del vector es: \{suma}");
                    break;
                case 'S':
                    System.out.println("Programa finalizado.");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }

        } while (opcion != 'S');
    }
}
