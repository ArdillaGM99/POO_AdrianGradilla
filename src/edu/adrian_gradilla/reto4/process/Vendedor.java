package edu.adrian_gradilla.reto4.process;

import edu.adrian_gradilla.reto4.data.Boleto;
import edu.adrian_gradilla.reto4.data.pasajero;

import java.util.ArrayList;
import java.util.Scanner;

public class Vendedor {
    /** Lista que almacena todas las ventas */
    private static ArrayList<Boleto> listaVentas = new ArrayList<>();
    /** Constructor para inicializar las ventas */
    public Vendedor() {
        listaVentas = new ArrayList<>();
    }
    /** Metodo para capturar datos del comprador y pasajeros adicionales
     * ademas crea un boleto y lo agrega a la lista de ventas*/
    public static void realizarVenta(Scanner scanner) {
        System.out.println("Ingresar nombre del comprador: ");
        String nombre = scanner.next();
        System.out.println("Ingresar cantidad de boletos: ");
        int cantidadBoletos = scanner.nextInt();

        Boleto boleto = new Boleto(nombre, cantidadBoletos);
        listaVentas.add(boleto);

        for (int i = 0; i < cantidadBoletos - 1; i++) {
            System.out.println("Ingresar nombre del pasajero adicional " + (i + 1) + ": ");
            String nombrePasajero = scanner.next();
            pasajero.Pasajero pasajero = new pasajero.Pasajero(nombrePasajero);
            boleto.AnadirPasajero(pasajero);
        }

        System.out.println("----Ticket de Venta----");
        System.out.println(boleto);
    }
    /**Mostramos los datos de todas nuestras ventas informacion,importe y cantidad totol de pasajeros*/
    public static void mostrarDatos() {
        for (Boleto boleto : listaVentas) {
            System.out.println(boleto.toString());
        }

        double importeTotal = CostoTotal();
        System.out.println("Importe Total: $" + importeTotal);

        int totalPasajeros = calcularTotalPasajeros();
        System.out.println("Total de Pasajeros Registrados: " + totalPasajeros);
    }
    /** Calcula el importeTotal de nuestras ventas */
    private static double CostoTotal() {
        double importeTotal = 0;
        for (Boleto boleto : listaVentas) {
            importeTotal += boleto.calcularImporte();
        }
        return importeTotal;
    }
    /** Calcula la cantidad total de pasajeros que se registraron en todas las ventas */
    private static int calcularTotalPasajeros() {
        int totalPasajeros = 0;
        for (Boleto boleto : listaVentas) {
            totalPasajeros += boleto.getCantidadBoletos();
        }
        return totalPasajeros;
    }
}
