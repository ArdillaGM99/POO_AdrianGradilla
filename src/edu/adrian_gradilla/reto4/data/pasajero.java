package edu.adrian_gradilla.reto4.data;

public class pasajero {

    /**Clase interna que representa nuestro pasajero */
    public static class Pasajero {
        private final String nombre;
        /** Constructor para inicializarlo */
        public Pasajero(String nombre) {
            this.nombre = nombre;
        }
        /** Representacion en cadena que representa nuestro pasajero */
        @Override
        public String toString() {
            return "Pasajero: " + nombre;
        }
    }

}
