package edu.adrian_gradilla.reto1.process;


public class CalculadoraMasaCorporal {

    /*Calcula el Índice de Masa Corporal (IMC) a partir del peso y
    la estatura.*/
    public static double calculoIMC(double peso, double estatura) {
        double imc = peso / (estatura * estatura);
        System.out.println("IMC: " + imc);
        return imc;
    }

    /* Nos calcula y muestra la masa corporal magra de una persona basada en el peso, estatura y sexo  */
    public static void calcularMasaCorporalMagra(double peso, double estatura, char sexo) {
        double masaCorporalMagra;

        if (sexo == 'M' || sexo == 'm')  {
            masaCorporalMagra = (1.10 * peso) - (128 * Math.pow(peso, 2) / Math.pow(estatura, 2));
        } else if (sexo == 'F' || sexo == 'f') {
            masaCorporalMagra = (1.07 * peso) - (148 * Math.pow(peso, 2) / Math.pow(estatura, 2));
        } else {
            System.out.println("Sexo no válido.") ;
            return;
        }

        System.out.println("Masa corporal magra: " + masaCorporalMagra);
    }

    /* Aquí mostramos el metabolismo basal a partir de los datos edad, estatura, peso y sexo */
    public static void calcularMetabolismoBasal(double peso, double estatura, int edad, char sexo){
        double metabolismoBasal;

        if (sexo == 'M' || sexo == 'm') {
            metabolismoBasal = 66.5 + (13.75 * peso) + (5.003 * estatura) - (6.775 * edad);
        } else if (sexo == 'F' || sexo == 'f') {
            metabolismoBasal = 655.1 + (9.563 * peso) + (1.85 * estatura) - (4.676 * edad);
        } else {
            System.out.println("Sexo no válido.");
            return;
        }

        System.out.println("Metabolismo basal: " +  metabolismoBasal);
    }
    public static void MencionarTipoDeImc(double imc) {
        if(imc < 18.5){
            System.out.println("Tienes un peso bajo, ¡bro!");
        } else if (imc >= 18.5 && imc <= 24.99) {
            System.out.println("Tienes un peso normal, ¡excelente!");
        } else if (imc >= 25.0 && imc <= 29.99) {
            System.out.println("Tienes sobrepeso, ¡no olvides cuidarte! :D");
        } else if (imc >= 30.0 && imc <= 34.99) {
            System.out.println("Tienes obesidad leve, ¡a correr!");
        } else if (imc >= 35.0 && imc <= 39.99) {
            System.out.println("Tienes obesidad media, es momento de considerar una dieta.");
        } else {
            System.out.println("Tienes obesidad mórbida, ¡ve al doctor urgentemente!");

        }
    }
}