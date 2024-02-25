package edu.AdrianGradilla.reto5.Medicamentos;

import java.util.ArrayList;
import java.util.Scanner;

/** La clase Medicamento representa un medicamento con su nombre químico, precio al público y forma farmacéutica. */
public class Medicamento {

    /* Declaración de la variable final nombreQuimico de tipo String */
    private final String nombreQuimico;

    /* Declaración de la variable final precioPublico de tipo float */
    private final float precioPublico;

    /* Declaración de la variable final formaFarmaceutica de tipo String */
    private final String formaFarmaceutica;

    /**
     * Constructor de la clase Medicamento.
     * @param nombreQuimico Nombre químico del medicamento.
     * @param precioPublico Precio al público del medicamento.
     * @param formaFarmaceutica Forma farmacéutica del medicamento.
     */
    public Medicamento(String nombreQuimico, float precioPublico, String formaFarmaceutica) {
        this.nombreQuimico = nombreQuimico;
        this.precioPublico = precioPublico;
        this.formaFarmaceutica = formaFarmaceutica;
    }

    /**
     * Obtiene el nombre químico del medicamento.
     * @return Nombre químico del medicamento.
     */
    public String getNombreQuimico() {
        return nombreQuimico;
    }

    /**
     * Obtiene el precio al público del medicamento.
     * @return Precio al público del medicamento.
     */
    public float getPrecioPublico() {
        return precioPublico;
    }

    /**
     * Obtiene la forma farmacéutica del medicamento.
     * @return Forma farmacéutica del medicamento.
     */
    public String getFormaFarmaceutica() {
        return formaFarmaceutica;
    }

    /**
     * Representación en cadena del objeto Medicamento.
     * @return Representación en cadena del objeto Medicamento.
     */
    @Override
    public String toString() {
        return new StringBuilder().append("Medicamento{").append("nombreQuimico='")
                .append(nombreQuimico).append('\'').append(", precioPublico=").append(precioPublico)
                .append(", formaFarmaceutica='").append(formaFarmaceutica).append('\'').append('}').toString();
    }

    /** La clase interna Process proporciona métodos estáticos para el procesamiento de medicamentos. */
    public static class Process {

        /* Declaración y asignación de una lista de medicamentos */
        public static final ArrayList<Medicamento> listaMedicamentos = new ArrayList<>();

        /* Declaración del objeto scanner para entrada de datos */
        static Scanner scanner = new Scanner(System.in);

        /**
         * Registra un nuevo medicamento.
         * @param scanner Scanner para la entrada de datos.
         */
        public static void registrarMedicamento(Scanner scanner) {
            try {
                System.out.println("Ingrese el nombre químico del medicamento:");
                String nombreQuimico = Process.scanner.next();

                System.out.println("Ingrese el nombre registrado del medicamento:");
                String nombreRegistrado = Process.scanner.next();

                System.out.println("Ingrese el nombre genérico del medicamento:");
                String generico = Process.scanner.next();

                System.out.println("Ingrese el precio del medicamento:");
                float precioPublico = Process.scanner.nextFloat();

                String formaFarmaceutica;
                do {
                    System.out.println("Ingrese el tipo de forma farmacéutica:");
                    System.out.println("1. Formas sólidas");
                    System.out.println("2. Formas semisólidas");
                    System.out.println("3. Formas líquidas");
                    int opcionForma = Process.scanner.nextInt();

                    switch (opcionForma) {
                        case 1:
                            formaFarmaceutica = "Formas sólidas";
                            break;
                        case 2:
                            formaFarmaceutica = "Formas semisólidas";
                            break;
                        case 3:
                            formaFarmaceutica = "Formas líquidas";
                            break;
                        default:
                            System.out.println("Opción no válida. Inténtalo de nuevo.");
                            formaFarmaceutica = null;
                            break;
                    }
                } while (formaFarmaceutica == null);

                Medicamento nuevoMedicamento = new Medicamento(nombreQuimico,
                        precioPublico, formaFarmaceutica);

                listaMedicamentos.add(nuevoMedicamento);
                System.out.println("Medicamento registrado con éxito.");
            } catch (Exception e) {
                System.out.println("Error: Ingresa un tipo de dato válido.");
                Process.scanner.nextLine();
            }
        }
    }
}