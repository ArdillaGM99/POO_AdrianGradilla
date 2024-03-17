package edu_AdrianGradilla.Reto7.Process;

import java.util.Scanner;

public class VasosCafe {
    private int Recipiente;
    private String Tamaño;
    private double Precio;
    private double CantidadCafe;
    private double CantidadAzucar;

    public VasosCafe() {
    }

    public double getCantidadCafe() {
        return CantidadCafe;
    }

    public void setCantidadCafe(double cantidadCafe) {
        CantidadCafe = cantidadCafe;
    }

    public double getCantidadAzucar() {
        return CantidadAzucar;
    }

    public void setCantidadAzucar(double cantidadAzucar) {
        CantidadAzucar = cantidadAzucar;
    }

    public int getRecipiente() {
        return Recipiente;
    }

    public void setRecipiente(int recipiente) {
        Recipiente = recipiente;
    }

    public String getTamaño() {
        return Tamaño;
    }

    public void setTamaño(String tamaño) {
        Tamaño = tamaño;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double precio) {
        Precio = precio;
    }

    public VasosCafe(int recipiente, String tamaño, double precio, double cantidadCafe, double cantidadAzucar) {
        Recipiente = recipiente;
        Tamaño = tamaño;
        Precio = precio;
        CantidadCafe = cantidadCafe;
        CantidadAzucar = cantidadAzucar;
    }

    public VasosCafe CafePequeñoSinAzucar() {
        return new VasosCafe(120, "Pequeño", 10.50, 50, 0);
    }

    public VasosCafe CafePequeñoConAzucar() {
        return new VasosCafe(120, "Pequeño", 14.50, 50, 50);
    }

    public VasosCafe CafeMedianoSinAzucar() {
        return new VasosCafe(220, "Mediano", 24.50, 100, 0);
    }

    public VasosCafe CafeMedianoConAzucar() {
        return new VasosCafe(220, "Mediano", 34.50, 100, 100);
    }

    public VasosCafe CafeGrandeSinAzucar() {
        return new VasosCafe(320, "Grande", 34.50, 150, 0);
    }

    public VasosCafe CafeGrandeConAzucar() {
        return new VasosCafe(320, "Grande", 39.50, 150, 150);
    }
}
