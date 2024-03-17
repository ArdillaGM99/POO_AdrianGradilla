package edu_AdrianGradilla.Reto7.CLI;

import edu_AdrianGradilla.Reto7.Process.Cafetera;
import edu_AdrianGradilla.Reto7.Process.VasosCafe;

import java.util.Scanner;

public class CLI {

    public static void showMenu() {
        Scanner scanner = new Scanner(System.in);
        Cafetera cafetera = new Cafetera();
        VasosCafe vasosCafe = new VasosCafe();

        System.out.println("********************************************");
        System.out.println("Bienvenido a la Cafeteria Patito");
        System.out.println("********************************************");

        while (true) {
            System.out.print("Ingrese la cantidad de vasos que desea comprar (0 para salir): ");
            int cantidadVasos = scanner.nextInt();

            if (cantidadVasos <= 0) {
                System.out.println("Saliendo del programa.");
                return;
            }

            for (int i = 1; i <= cantidadVasos; i++) {
                System.out.println("Vaso de café número " + i + ":");
                System.out.println("Seleccione el tipo de café:");
                System.out.println("1. Café Pequeño Sin Azúcar");
                System.out.println("2. Café Pequeño Con Azúcar");
                System.out.println("3. Café Mediano Sin Azúcar");
                System.out.println("4. Café Mediano Con Azúcar");
                System.out.println("5. Café Grande Sin Azúcar");
                System.out.println("6. Café Grande Con Azúcar");

                int opcion = scanner.nextInt();
                VasosCafe vaso;

                switch (opcion) {
                    case 1:
                        vaso = vasosCafe.CafePequeñoSinAzucar();
                        break;
                    case 2:
                        vaso = vasosCafe.CafePequeñoConAzucar();
                        break;
                    case 3:
                        vaso = vasosCafe.CafeMedianoSinAzucar();
                        break;
                    case 4:
                        vaso = vasosCafe.CafeMedianoConAzucar();
                        break;
                    case 5:
                        vaso = vasosCafe.CafeGrandeSinAzucar();
                        break;
                    case 6:
                        vaso = vasosCafe.CafeGrandeConAzucar();
                        break;
                    default:
                        System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                        i--; // Para repetir la selección del vaso
                        continue;
                }

                if (cafetera.tieneSuficientesInsumos(vaso.getCantidadCafe(), vaso.getCantidadAzucar())) {
                    cafetera.servirVasoCafe(vaso);
                    System.out.println("Vaso de café servido: " + vaso.getTamaño() + " - Precio: $" + vaso.getPrecio() +
                            (vaso.getCantidadAzucar() > 0 ? " con azúcar" : " sin azúcar"));
                    System.out.println();
                } else {
                    System.out.println("No hay suficientes insumos para servir el vaso de café.");
                    System.out.println();
                }
            }

            System.out.println("********************************************");
            System.out.println("Resumen de la compra:");
            System.out.println("Importe total de venta: $" + (cantidadVasos * vasosCafe.CafePequeñoSinAzucar().getPrecio()));
            System.out.println("Total de tazas vendidas: " + cantidadVasos);
            System.out.println("********************************************");
        }
    }
}
