package edu.AdrianGradilla.reto5.CLI;
import edu.AdrianGradilla.reto5.Medicamentos.Medicamento;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

/* Clase que representa la interfaz de línea de comandos (CLI). */
public class CLI {

    /** HashMap para almacenar usuarios registrados y sus contraseñas */
    public static final HashMap<String, String> Usuario_Registrados = new HashMap<>();

    /* Usuario actualmente autenticado. */
    public static String usuarioActual;

    /***cMétodo para mostrar el menú principal.c@param scanner Scanner para la entrada de datos. */
    public static void showMenu(Scanner scanner) {
        while(true) {
            System.out.println("****************");
            System.out.println("Bienvenido a la farmacia pistolas          *");
            System.out.println("Regístrate e inicia sesión para acceder :  *");
            System.out.println("Seleccione una opción:                     *");
            System.out.println("1. Iniciar sesión                          *");
            System.out.println("2. Registrarse                             *");
            System.out.println("3. Salir                                   *");
            System.out.println("****************");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    iniciarSesion(scanner);
                    break;
                case 2:
                    registrarse(scanner);
                    break;
                case 3:
                    System.out.println("Saliendo del programa: ");
                    System.exit(0);
                default:
                    System.out.println("Opcion no valida. Ingresa una opcion valida: ");
                    break;
            }
        }
    }

    /* Método para iniciar sesión. @param scanner Scanner para la entrada de datos. */
    public static void iniciarSesion(Scanner scanner) {
        System.out.println("*");
        System.out.println("Ingresa tu nombre de usuario: *");
        String usuario = scanner.next();

        if (Usuario_Registrados.containsKey(usuario)) {
            System.out.println("Ingresa tu contraseña:        *");
            String contrasena = scanner.next();

            if (Objects.equals(Usuario_Registrados.get(usuario), contrasena)) {
                System.out.println("Inicio de sesión exitoso :D");
                usuarioActual = usuario;
                showMenu2(scanner);  // Llamar a showMenu2 después del inicio de sesión
            } else {
                System.out.println("Contraseña incorrecta, inténtalo de nuevo.");
            }
        } else {
            System.out.println("Usuario no encontrado. Regístrate antes de iniciar sesión.");
        }
    }

    /***Método para el registro de un nuevo usuario. param scanner Scanner para la entrada de datos. */
    public static void registrarse(Scanner scanner) {
        System.out.println("*");
        System.out.println("Ingresa un nuevo nombre de usuario: *");
        String nuevoUsuario = scanner.next();

        if(Usuario_Registrados.containsKey(nuevoUsuario)){
            System.out.println("El usuario ya existe. Por favor, elige otro nombre de usuario.");
        } else {
            System.out.println("Ingresa una nueva contraseña:       *");
            String nuevaContrasena = scanner.next();

            Usuario_Registrados.put(nuevoUsuario, nuevaContrasena);
            System.out.println(STR."Registro exitoso. Bienvenido \{nuevoUsuario} :D ");
            showMenu(scanner);
        }
    }

    /* Método para mostrar el menú de opciones después del inicio de sesión. @param scanner Scanner para la entrada de datos. */
    public static void showMenu2(Scanner scanner) {
        while (true) {
            System.out.println("Selecciona la opcion que necesites: ");
            System.out.println("1.- Registrar un Medicamento");
            System.out.println("2.- Generar Reporte");
            System.out.println("3.- Salir del menu");

            char opcion = scanner.next().charAt(0);
            switch (opcion) {
                case '1':
                    Medicamento.Process.registrarMedicamento(scanner);
                    System.out.println("Opción 1 seleccionada.");
                    break;
                case '2':
                    generarReporte();
                    System.out.println("Opción 2 seleccionada.");
                    break;
                case '3':
                    System.out.println("Saliendo del menú.");
                    System.exit(0);
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida ");
                    break;
            }
        }
    }

    /* Método para generar un reporte de medicamentos. */
    public static void generarReporte() {
        System.out.println("**** Reporte de Medicamentos ****");
        System.out.println(STR."Registrado por: \{usuarioActual}");
        System.out.println(STR."Fecha de generación: \{obtenerFechaActual()}");
        System.out.println(STR."Cantidad de productos en la lista: \{Medicamento.Process.listaMedicamentos.size()}");

        for (Medicamento medicamento : Medicamento.Process.listaMedicamentos) {
            System.out.println(STR."\nMedicamento: \{medicamento.getNombreQuimico()}");
            System.out.println(STR."Tipo de forma farmacéutica: \{medicamento.getFormaFarmaceutica()}");
            System.out.println(STR."Precio al público: \{medicamento.getPrecioPublico()}");

            // Mostrar el porcentaje adicional
            float porcentajeAdicional = obtenerPorcentajeAdicional(medicamento.getFormaFarmaceutica());
            System.out.println(STR."Porcentaje adicional: \{porcentajeAdicional}%");

            // Calcular y mostrar el precio de venta con porcentaje adicional al precio al público
            float precioVentaCalculado = medicamento.getPrecioPublico() + (medicamento.getPrecioPublico() * porcentajeAdicional / 100);
            System.out.println(STR."Precio de venta (con \{porcentajeAdicional}% adicional): \{precioVentaCalculado}");
        }

        System.out.println("");
    }

    /* Método para obtener la fecha actual en un formato específico. @return La fecha actual en formato String. */
    private static String obtenerFechaActual() {
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date fechaActual = new Date();
        return formatoFecha.format(fechaActual);
    }

    /* Método para obtener el porcentaje adicional según la forma farmacéutica del medicamento. @param formaFarmaceutica La forma farmacéutica del medicamento. @return El porcentaje adicional. **/
    static float obtenerPorcentajeAdicional(String formaFarmaceutica) {
        return switch (formaFarmaceutica.toLowerCase()) {
            case "formas sólidas" -> 9;
            case "formas semisólidas" -> 12;
            case "formas líquidas" -> 13;
            default -> 0;
        };
    }
}