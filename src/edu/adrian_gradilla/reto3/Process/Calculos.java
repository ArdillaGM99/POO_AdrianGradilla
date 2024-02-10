package edu.adrian_gradilla.reto3.Process;

import java.util.Random;


public class Calculos {
    private final int[][] matriz;
    private final int filas;
    private final int columnas;

    /*Constructor que inicializa los valores aleatorios y solicita filas y columnas*/
    public Calculos(int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
        this.matriz = new int[filas][columnas];
        llenarMatrizAleatoria();
    }

    /*Método para llenar la matriz con valores aleatorios en el rango del 1 al 100*/
    private void llenarMatrizAleatoria() {
        Random rand = new Random();
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = rand.nextInt(100) + 1;
            }
        }
    }

    /*Método para contar la cantidad de números pares e impares por filas*/
    public void contarParesImparesPorFilas() {
        System.out.println("-------------------------------------------");
        for (int i = 0; i < filas; i++) {
            int pares = 0;
            int impares = 0;
            for (int j = 0; j < columnas; j++) {
                if (matriz[i][j] % 2 == 0) {
                    pares++;
                } else {
                    impares++;
                }
            }
            System.out.println(STR."Cantidad de pares \{pares}, impares: \{impares} en la fila \{i + 1}");
        }
    }

    /* Método para contar la cantidad de números pares e impares por columnas*/
    public void contarParesImparesPorColumnas() {
        System.out.println("--------------------------------------------");
        for (int j = 0; j < columnas; j++) {
            int pares = 0;
            int impares = 0;
            for (int i = 0; i < filas; i++) {
                if (matriz[i][j] % 2 == 0) {
                    pares++;
                } else {
                    impares++;
                }
            }
            System.out.println(STR."Cantidad de pares \{pares}, impares: \{impares} en la columna \{j + 1}");
        }
    }

    /*Método para calcular la suma de todos los elementos en la matriz*/
    public int calcularSumaMatriz() {
        int suma = 0;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                suma += matriz[i][j];
            }
        }
        return suma;
    }
}
