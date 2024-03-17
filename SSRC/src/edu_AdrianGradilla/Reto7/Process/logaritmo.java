package edu_AdrianGradilla.Reto7.Process;

import java.util.Scanner;

public class logaritmo {
    public static void Logaritmo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor ingrese el número para calcular su logaritmo: ");
        double x = scanner.nextDouble();

        if (x <= 0) {
            System.out.println("El número debe ser mayor que 0.");
            return;
        }

        double resultado = 0;
        double term = (x - 1) / (x + 1);
        double numerador = term;
        int denominador = 1;

        for (int i = 1; i <= 1000; i++) {
            resultado += numerador / denominador;
            numerador *= term * term;
            denominador += 2;
        }

        resultado *= 2;

        System.out.println("El logaritmo natural de " + x + " es aproximadamente: " + resultado);
    }
}
