package edu.adrian_gradilla.reto3.Process;
public class Diccionario {

    private final String[] palabras;
    private final String[] significados;

    public Diccionario() {
        palabras = new String[10];
        significados = new String[10];


        palabras[0] = "Profesor";
        significados[0] = "persona que comparte conocimientos";
        palabras[1] = "Gato";
        significados[1] = "Animal doméstico";
        palabras[2] = "Amigo";
        significados[2] ="persona que compartes un fuerte vinculo";
        palabras[3] ="";
        significados[3]="";
        palabras[4]="";
        significados[4]="";
        palabras[5]="";
        significados[5]="";
        palabras[6]="";
        significados[6]="";
        palabras[7]="";
        significados[7]="";
        palabras[8]="";
        significados[8]="";
        palabras[9]="";
        significados[9]="";



    }

    public void enlistarPalabras() {
        System.out.println("Palabras en el diccionario:");
        for (String palabra : palabras) {
            if (palabra != null) {
                System.out.println(STR."- \{palabra}");
            }
        }
    }

    public String buscarPalabra(String palabraBuscada) {
        int indice = -1;
        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i] != null && palabras[i].equalsIgnoreCase(palabraBuscada)) {
                indice = i;
                break;
            }
        }

        if (indice != -1) {
            return STR."Significado de '\{palabras[indice]}': \{significados[indice]}";
        } else {
            return STR."La palabra '\{palabraBuscada}' no existe en el diccionario.";
        }
    }

    public String detalleDiccionario() {
        StringBuilder detalles = new StringBuilder();
        detalles.append("Detalle del diccionario:\n");
        detalles.append("Cantidad de palabras en el diccionario: ").append(contarPalabras()).append("\n");

        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i] != null) {
                detalles.append("- Palabra: ").append(palabras[i])
                        .append(", Cantidad de caracteres: ").append(palabras[i].length())
                        .append(", Significado: ").append(significados[i])
                        .append(", Cantidad de caracteres del significado: ").append(significados[i].length())
                        .append("\n");
            }
        }
        return detalles.toString();
    }

    private int contarPalabras() {
        int contador = 0;
        for (String palabra : palabras) {
            if (palabra != null) {
                contador++;
            }
        }
        return contador;
    }
}
