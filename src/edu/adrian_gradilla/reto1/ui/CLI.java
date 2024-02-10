package edu.adrian_gradilla.reto1.ui;
import java.util.Scanner;

public class CLI {
    /*Muestra un menu de opciones relacionadas con los calculos corporales
     * y solicita al usuario que escoja una opcion */
    public static char mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menú de opciones:");
        System.out.println("A. Cálculo índice de masa corporal ");
        System.out.println("B. Cálculo masa corporal magra ");
        System.out.println("C. Cálculo de metabolismo basal ");
        System.out.print("Elige una opción :D (A,B,C): ");
        char opcion = scanner.next().charAt(0);
        return opcion;
    }

    /*solicita al usuario un dato a traves de consola y nos devuelve la entrada como string  */
    public static String obtenerDato(String mensaje)  {
        Scanner scanner = new Scanner(System.in);
        System.out.println(mensaje);
        return scanner.next() ;
    }
}