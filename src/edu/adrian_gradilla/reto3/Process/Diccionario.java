package edu.adrian_gradilla.reto3.Process;
public class Diccionario {

    private final String[] palabras;
    private final String[] significados;
    /* Mi primer Constructor *-* */
    public Diccionario() {
        palabras = new String[10];
        significados = new String[10];

        /*palabras y significados del diccionario*/
        palabras[0] = "Profesor";
        significados[0] = "persona que comparte conocimientos";
        palabras[1] = "Gato";
        significados[1] = "Animal doméstico";
        palabras[2] = "Amigo";
        significados[2] ="persona que compartes un fuerte vinculo";
        palabras[3] ="perro";
        significados[3]="Mejor amigo del humano";
        palabras[4]="automovil";
        significados[4]="transporte de las personas";
        palabras[5]="Gym";
        significados[5]="Lugar para entrenar";
        palabras[6]="League of legends";
        significados[6]="videojuego que te come el alma";
        palabras[7]="Futbol";
        significados[7]="Deporte mas popular del mundo";
        palabras[8]="Salsa";
        significados[8]="Mejor estilo de baile";
        palabras[9]="Programador";
        significados[9]="Persona que resuelve problemas";



    }
        /*Enlisto las palabras que tengo en el Diccionario*/
    public void enlistarPalabras() {
        System.out.println("Palabras en el diccionario:");
        for (String palabra : palabras) {
            if (palabra != null) {
                System.out.println(STR."- \{palabra}");
            }
        }
    }
    /*Con este metodo busco el significado de las palabras*/
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
    /*Aqui obtengo los detalles de las palabras del diccionario*/
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
        /*Metodo privado para contar las palabras presentes del diccionario*/
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
