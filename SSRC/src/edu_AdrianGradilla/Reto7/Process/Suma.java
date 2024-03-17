package edu_AdrianGradilla.Reto7.Process;

import java.util.Scanner;

public class Suma {

    public static void Suma (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Porfavor ingrese el primer numero: ");
        int num1 = scanner.nextInt(); // Corrected the variable name to scanner.nextInt()
        System.out.println("Porfavor ingresa el segundo numero: ");
        int num2 = scanner.nextInt();
        System.out.println("La suma es " + (num1 + num2));
    }
}
