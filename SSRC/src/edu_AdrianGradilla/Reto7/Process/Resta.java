package edu_AdrianGradilla.Reto7.Process;

import java.util.Scanner;

public class Resta {

    public static void Resta() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor ingrese el primer número: ");
        int num1 = scanner.nextInt();
        System.out.println("Por favor ingrese el segundo número: ");
        int num2 = scanner.nextInt();
        int resta = num1 - num2; // Calcula la resta de los dos números
        System.out.println("La resta es: " + resta);
    }
}
