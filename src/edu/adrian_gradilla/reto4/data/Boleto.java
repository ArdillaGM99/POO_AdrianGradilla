package edu.adrian_gradilla.reto4.data;

import java.util.ArrayList;

public class Boleto {
    private final String nombreComprador;
    private final int cantidadBoletos;
    private final ArrayList<pasajero.Pasajero> listaPasajeros;

   /** Constructor */
    public Boleto(String nombreComprador, int cantidadBoletos) {
        this.nombreComprador = nombreComprador;
        this.cantidadBoletos = cantidadBoletos;
        this.listaPasajeros = new ArrayList<>();
    }
    /** Agregamos pasajero adicional a nuestra lista*/
    public void AnadirPasajero(pasajero.Pasajero pasajero) {
        listaPasajeros.add(pasajero);
    }
    /** Calculo del boleto*/
    public double calcularImporte() {
        return cantidadBoletos * 1250.50;
    }
    /** Obtenemos la cantidad de boletos */
    public int getCantidadBoletos() {
        return cantidadBoletos;
    }
    /** Devolvemos una representacion en cadena del boleto*/
    @Override
    public String toString() {
        return "Comprador: " + nombreComprador +
                ", Cantidad de Boletos: " + cantidadBoletos +
                ", Importe: $" + calcularImporte() +
                ", Pasajeros adicionales: " + listaPasajeros;
    }
}
