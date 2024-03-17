package edu_AdrianGradilla.Reto7.Process;

import java.util.Scanner;

public class Multiplicacion {
    public static void Multiplicacion() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor ingrese el primer número: ");
        int num1 = scanner.nextInt();
        System.out.println("Por favor ingrese el segundo número: ");
        int num2 = scanner.nextInt();

        int resultado = 0;

        if (num1 < 0 && num2 < 0) {
            num1 = -num1;
            num2 = -num2;
        } else if (num1 < 0 || num2 < 0) {
            resultado = -resultado;
        }

        for (int i = 0; i < Math.abs(num1); i++) {
            resultado += num2;
        }

        System.out.println("El resultado de la multiplicación es: " + resultado);
    }
}
