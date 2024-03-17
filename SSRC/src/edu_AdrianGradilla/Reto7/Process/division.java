package edu_AdrianGradilla.Reto7.Process;

import java.util.Scanner;

public class division {
    public static void division() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor ingrese el dividendo: ");
        int dividendo = scanner.nextInt();
        System.out.println("Por favor ingrese el divisor: ");
        int divisor = scanner.nextInt();

        int cociente = 0;

        while (dividendo >= divisor) {
            dividendo -= divisor;
            cociente++;
        }

        System.out.println("El cociente de la división es: " + cociente);

    }
}
