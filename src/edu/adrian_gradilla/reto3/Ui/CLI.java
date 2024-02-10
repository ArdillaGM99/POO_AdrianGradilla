package edu.adrian_gradilla.reto3.Ui;

import edu.adrian_gradilla.reto3.Process.Diccionario;

import java.util.Scanner;

public class CLI {

    /*Instancia de la clase Diccionario*/
    private final Diccionario Diccionario;
     /*Constructor que inicializa la Clase*/
    public CLI() {
        Diccionario = new Diccionario();
    }
    /*Metodo para manejar el menu e interactuar con las opciones del usuario*/
    public void showMenu() {
        Scanner scanner = new Scanner(System.in);

        char opcion;
        do {

            System.out.println("\n--------Diccionario:---------------");
            System.out.println("A. Enlistar palabras del diccionario");
            System.out.println("B. Buscar palabra en el diccionario");
            System.out.println("C. Detalle del diccionario");
            System.out.println("S. Finalizar programa");
            System.out.print("Seleccione una opción: ");
            System.out.println("\n-----------------------------------");
            opcion = scanner.next().charAt(0);


            switch (opcion) {
                case 'A':
                    Diccionario.enlistarPalabras();
                    break;
                case 'B':
                    scanner.nextLine(); // Limpiar el buffer
                    System.out.print("Ingrese la palabra que desea buscar: ");
                    String palabraBuscada = scanner.nextLine();
                    System.out.println(Diccionario.buscarPalabra(palabraBuscada));
                    break;
                case 'C':
                    System.out.println(Diccionario.detalleDiccionario());
                    break;
                case 'S':
                    System.out.println("---------Fin del programa------------.");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }

        } while (opcion != 'S');
    }
}

