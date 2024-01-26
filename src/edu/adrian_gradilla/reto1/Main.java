package edu.adrian_gradilla.reto1;

import edu.adrian_gradilla.reto1.ui.CLI;
import edu.adrian_gradilla.reto1.process.CalculadoraMasaCorporal;

public class Main {
    /*solicita al usuario una opcion llamando al menu y preguntando al final si desea realizar algo mas*/
    public static void main(String[] args) {
        do {
            char opcion = CLI.mostrarMenu();
            funciones(opcion);

            System.out.println("¿Deseas realizar otro cálculo? (S/N)");
        } while (new java.util.Scanner(System.in).next().trim().equalsIgnoreCase("S")) ;
    }


    /*llama a las funciones para que hagan su trabajo cuando el usuario escoje una opcion*/
    private static void funciones (char opcion) {
        switch (opcion) {
            case 'A':
                calcularIMC();
                break;
            case 'B':
                calcularMasaCorporalMagra();
                break;
            case 'C':
                calcularMetabolismoBasal();
                break;
            default:
                System.out.println("Opción no válida. Por favor, elige A, B o C.");
        }
    }

    /*Realiza el cálculo del Índice de Masa Corporal (IMC) utilizando la información de el usuario.
     * Pide al usuario ingresar el peso en kilogramos y la estatura en centímetros,
     * realiza las conversiones necesarias y luego llama al método*/


    private static void calcularIMC() {
        double pesoIMC = Double.parseDouble(CLI.obtenerDato("Ingrese el peso en kg: "));
        double estaturaIMC = Double.parseDouble(CLI.obtenerDato("Ingrese la estatura en cm: ")) / 100;
        CalculadoraMasaCorporal.calculoIMC(pesoIMC, estaturaIMC);
    }
    /*  Realiza el cálculo de la masa corporal magra utilizando la información brindada por el usuario.
     * Pide al usuario ingresar el peso en kilogramos, la estatura en centímetros y el sexo (M/F),
     * realiza las conversiones necesarias y luego llama al método*/


    private static void calcularMasaCorporalMagra() {
        double pesoMagra = Double.parseDouble(CLI.obtenerDato("Ingrese el peso en kg: "));
        double estaturaMagra = Double.parseDouble(CLI.obtenerDato("Ingrese la estatura en cm: ")) / 100;
        char sexoMagra = CLI.obtenerDato("Ingrese el sexo (M/F): ").toUpperCase().charAt(0);
        CalculadoraMasaCorporal.calcularMasaCorporalMagra(pesoMagra, estaturaMagra, sexoMagra);
    }
    /*Realiza el cálculo del metabolismo basal utilizando la información brindada por el usuario.
    * Pide al usuario ingresar el peso en kilogramos, la estatura en centímetros, la edad y el sexo (M/F),
    * realiza las conversiones necesarias y luego llama al método.*/


    private static void calcularMetabolismoBasal() {
        double pesoMetabolismo = Double.parseDouble(CLI.obtenerDato("Ingrese el peso en kg: "));
        double estaturaMetabolismo = Double.parseDouble(CLI.obtenerDato("Ingrese la estatura en cm: ")) / 100;
        int edadMetabolismo = Integer.parseInt(CLI.obtenerDato("Ingrese la edad: "));
        char sexoMetabolismo = CLI.obtenerDato("Ingrese el sexo (M/F): ").toUpperCase().charAt(0);
        CalculadoraMasaCorporal.calcularMetabolismoBasal(pesoMetabolismo, estaturaMetabolismo, edadMetabolismo, sexoMetabolismo);
    }
}

