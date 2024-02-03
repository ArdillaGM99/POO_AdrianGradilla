package edu.adrian_gradilla.reto2.ui;

import edu.adrian_gradilla.reto2.process.process;

import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public class CLI{
/* Declaracion de variables*/
    public static final HashMap<String, String> USUARIOS_REGISTRADOS = new HashMap<>();
    public String usuarioActual;
    public static double totalVentas;
    public static double totalCompras;
    public static double ingresoVentas;
    public static double montoEnCaja;
    public static double egresosCompras;
    public static double precioVenta;
    public static double cantidadVenta;
    public static double cantidadCompra;
    public static double costoCompra;
    /*se muestra menu principal además captura la entrada del usuario y manda llamar
    sus respectivos metodos dependiendo la opcion*/
    public static void showmenu () {
        Scanner scanner = new Scanner(System.in);
        CLI negocio = new CLI();

        while (true) {
            System.out.println("********************************************");
            System.out.println("Bienvenido al punto de venta El contador:  *");
            System.out.println("Registrate para poder iniciar sesion:      *");
            System.out.println("Seleccione una opción:                     *");
            System.out.println("1. Iniciar sesión:                         *");
            System.out.println("2. Registrarse:                            *");
            System.out.println("3. Salir:                                  *");
            System.out.println("********************************************");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    negocio.iniciarSesion(scanner);
                    break;
                case 2:
                    negocio.registrarse(scanner);
                    break;
                case 3:
                    System.out.println("Saliendo del programa.");
                    System.exit(0);
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                    break;
            }

            if (negocio.usuarioActual != null) {
                negocio.menu(scanner);
            }
        }
    }


    /* Metodo para iniciar sesion una vez se haya registrado el usuario */
    public void iniciarSesion(Scanner scanner) {
        System.out.println("*******************************");
        System.out.println("Ingresa tu nombre de usuario: *");
        String usuario = scanner.next();
        System.out.println("Ingresa tu contraseña:        *");
        String contrasena = scanner.next();
        System.out.println("*******************************");

        if (USUARIOS_REGISTRADOS.containsKey(usuario) && Objects.equals(USUARIOS_REGISTRADOS.get(usuario), contrasena)) {
            System.out.println("Inicio de sesión exitoso :D");
            usuarioActual = usuario;
        } else {
            System.out.println("Usuario o Contraseña incorrecto, inténtalo de nuevo.");
        }
    }
        /*Metodo para obtener un registro del usuario y guardarlo*/
    public void registrarse(Scanner scanner) {
        System.out.println("*************************************");
        System.out.println("Ingresa un nuevo nombre de usuario: *");
        String nuevoUsuario = scanner.next();
        System.out.println("Ingresa una nueva contraseña:       *");
        String nuevaContrasena = scanner.next();
        System.out.println("*************************************");

        USUARIOS_REGISTRADOS.put(nuevoUsuario, nuevaContrasena);
        System.out.println(STR."Registro exitoso bienvenido: \{nuevoUsuario} :D ");
    }
    process processInstance = new process();
    /*Se muestra un segundo menu una vez se haya logrado iniciar sesion con exito además captura el dato
    * que el usuario ponga y manda llamar su respectivo metodo de opcion. El usuario puede escoger si salir
    * del programa con la opcion d*/
    public void menu(Scanner scanner) {
        while (true) {
            System.out.println("**********************************");
            System.out.println("a. Comprar cajas de papel        *");
            System.out.println("b. Vender cajas de papel         *");
            System.out.println("c. Mostrar reporte               *");
            System.out.println("d. Salir del programa            *");
            System.out.println("Selecciona una opción por favor: *");
            System.out.println("**********************************");

            char opcion = scanner.next().charAt(0);

            switch (opcion) {
                case 'a':
                    processInstance.realizarCompra(scanner);
                    break;
                case 'b':
                    processInstance.realizarVenta(scanner);
                    break;
                case 'c':
                    reporteOpcionC();
                    break;
                case 'd':
                    resumen();
                    System.out.println("Saliendo del programa gracias por usar El Contador.");
                    System.exit(0);
                default:
                    System.out.println("Opción no válida, por favor selecciona una opción válida.");
                    break;
            }
        }
    }
        /*metodo qeu imprime en pantalla el reporte hasta el momento sin salir aún del programa de las operaciones
         lo realize con las variables declaradas al principio*/

    public void reporteOpcionC() {
        System.out.println(STR."Cantidad total de ventas: \{totalVentas}");
        System.out.println(STR."Cantidad total de compras: \{totalCompras}");
        System.out.println(STR."Ingresos generados por ventas: \{ingresoVentas}");
        System.out.println(STR."Egresos generados por compras: \{egresosCompras}");
        System.out.println(STR."Monto total de caja: \{montoEnCaja}");
    }

    /*resumen de lo que se realiza durante el programa el resumen salta una vez el usuario da la opcion salir del
    * programa*/
    public void resumen() {
        System.out.println("****************************************************************************");
        System.out.println("Resumen de actividades:                                                    *");
        System.out.println(STR."Cantidad total de operaciones realizadas: \{totalVentas + totalCompras}*");
        System.out.println(STR."Cantidad total de ventas: \{totalVentas}                               *");
        System.out.println(STR."Cantidad total de compras: \{totalCompras}                             *");
        System.out.println(STR."Monto de la caja: \{montoEnCaja}                                       *");
        System.out.println(STR."Ingresos generados por ventas: \{ingresoVentas}                        *");
        System.out.println(STR."Egresos generados por compras: \{egresosCompras}                       *");
        System.out.println("Gracias por utilizar nuestro punto de venta El contador.                   *");
        System.out.println("****************************************************************************");
    }

}

