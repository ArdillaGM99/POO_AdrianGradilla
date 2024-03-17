package edu_AdrianGradilla.Reto7.Process;

import java.util.Scanner;

public class Raiz {
    public static void Raiz() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor ingrese el número para calcular su raíz cuadrada: ");
        double num = scanner.nextDouble();

        if (num < 0) {
            System.out.println("No se puede calcular la raíz cuadrada de un número negativo.");
            return;
        }

        double guess = num / 2;

        while (true) {
            double newGuess = (guess + (num / guess)) / 2; //
            if (Math.abs(guess - newGuess) < 0.000001) { //
                System.out.println("La raíz cuadrada de " + num + " es aproximadamente: " + newGuess);
                return;
            }
            guess = newGuess;
        }
    }
}
