package edu.AdrianGradilla.reto6.Data;

public class Categoria {
    private String categoria;
    private int clave;
    private double sueldoBase;
    private double pagoPorHora;

    public Categoria(String categoria, int clave, double sueldoBase, double pagoPorHora) {
        this.categoria = categoria;
        this.clave = clave;
        this.sueldoBase = sueldoBase;
        this.pagoPorHora = pagoPorHora;
    }


    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public double getPagoPorHora() {
        return pagoPorHora;
    }

    public void setPagoPorHora(double pagoPorHora) {
        this.pagoPorHora = pagoPorHora;
    }
}
