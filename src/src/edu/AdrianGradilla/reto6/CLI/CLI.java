package edu.AdrianGradilla.reto6.CLI;

import edu.AdrianGradilla.reto6.Data.Categoria;
import edu.AdrianGradilla.reto6.Process.Empleado;

import java.util.Scanner;

import static edu.AdrianGradilla.reto6.Process.Empleado.empleados;

public class CLI {

    /**Menu de eleccion*/
    public static void showmenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("********************************************");
            System.out.println("Hola! Soy el empleado de RH!               *");
            System.out.println("1. Captura de Datos                        *");
            System.out.println("2. Mostrar Reporte de Nómina               *");
            System.out.println("3. Salir                                   *");
            System.out.println("********************************************");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    capturarDatos();
                    break;

                case 2:
                    Empleado.generarReporte();
                    break;

                case 3:
                    System.out.println("Saliendo del programa.");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                    break;
            }
        }
    }

        /** Se capturaran cuantos empleados se van registrar primero, posteriormente se piden los datos de empleado
         * por empleado*/
    private static void capturarDatos() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa la cantidad de empleados a capturar: ");
        int cantidadEmpleados = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < cantidadEmpleados; i++) {
            System.out.println(STR."Ingresa los datos para el empleado #\{i + 1}");

            System.out.println("Ingresa el nombre completo: ");
            String nombreCompleto = scanner.nextLine();

            System.out.println("Ingresa las horas trabajadas: ");
            int horasTrabajadas = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Ingresa las horas extras: ");
            int horasExtrasTrabajadas = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Digita el numero de telefono: ");
            String telefono = scanner.nextLine();

            System.out.println("Ingrese fecha de nacimiento DD/MM/AA");
            String fechaNacimiento = scanner.nextLine();

            System.out.println("Ingresa tu categoria correspondiente ventas, administrador o gerente: ");
            String categoriaNombre = scanner.nextLine();

            System.out.println("Ingrese clave de categoria: ");
            int claveCategoria = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Ingrese el sueldo base de la categoria: ");
            double sueldoBaseCategoria = scanner.nextDouble();
            scanner.nextLine();

            System.out.println("Ingrese el pago por hora: ");
            double pagoPorHoraCategoria = scanner.nextDouble();
            scanner.nextLine();

            Categoria categoria = new Categoria(categoriaNombre, claveCategoria, sueldoBaseCategoria, pagoPorHoraCategoria);
            Empleado empleado = new Empleado(nombreCompleto, horasTrabajadas, horasExtrasTrabajadas, telefono, fechaNacimiento, categoria);

            empleados.add(empleado);
        }
    }
}

