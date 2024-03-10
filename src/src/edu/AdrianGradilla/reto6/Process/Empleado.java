package edu.AdrianGradilla.reto6.Process;

import edu.AdrianGradilla.reto6.Data.Categoria;

import java.util.ArrayList;
import java.util.List;

public class Empleado {
    public static List<Empleado> empleados = new ArrayList<>();
    private String nombreCompleto;
    private int horasTrabajadas;
    private int horasExtrasTrabajadas;
    private String telefono;
    private String fechaNacimiento;
    private Categoria categoria;

    public Empleado(String nombreCompleto, int horasTrabajadas, int horasExtrasTrabajadas,
                    String telefono, String fechaNacimiento, Categoria categoria) {
        this.nombreCompleto = nombreCompleto;
        this.horasTrabajadas = horasTrabajadas;
        this.horasExtrasTrabajadas = horasExtrasTrabajadas;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        this.categoria = categoria;
    }

    public Empleado() {

    }


    /**Getters y setters*/
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public int getHorasExtrasTrabajadas() {
        return horasExtrasTrabajadas;
    }

    public void setHorasExtrasTrabajadas(int horasExtrasTrabajadas) {
        this.horasExtrasTrabajadas = horasExtrasTrabajadas;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public double calcularPago() {
        double sueldoBase = this.categoria.getSueldoBase();
        double pagoPorHora = this.categoria.getPagoPorHora();
        double pagoTotal = sueldoBase * horasTrabajadas + pagoPorHora * horasExtrasTrabajadas;

        return pagoTotal;
    }

    public static void generarReporte() {
        double totalNomina = 0;
        double totalSueldoNormal = 0;
        double totalPagoHorasExtras = 0;
        int totalHorasLaboradas = 0;
        int personasConHorasExtras = 0;

        for (Empleado empleado : empleados) {
            Categoria categoria = empleado.getCategoria();

            double pagoTotal = empleado.calcularPago();
            totalNomina += pagoTotal;
            totalSueldoNormal += categoria.getSueldoBase() * empleado.getHorasTrabajadas();
            totalPagoHorasExtras += categoria.getPagoPorHora() * empleado.getHorasExtrasTrabajadas();
            totalHorasLaboradas += empleado.getHorasTrabajadas() + empleado.getHorasExtrasTrabajadas();

            if (empleado.getHorasExtrasTrabajadas() > 0) {
                personasConHorasExtras++;
            }
        }

        int personasSinHorasExtras = empleados.size() - personasConHorasExtras;

        System.out.println("*********** Reporte de Nómina ***********");
        System.out.println("Total de la Nómina de la Empresa: $" + totalNomina);
        System.out.println("Total a Pagar por Sueldo Normal: $" + totalSueldoNormal);
        System.out.println("Total a Pagar por Horas Extras: $" + totalPagoHorasExtras);
        System.out.println("Total de Horas Laboradas en la Empresa: " + totalHorasLaboradas + " horas");
        System.out.println("Total de Personas con Horas Extras: " + personasConHorasExtras);
        System.out.println("Total de Personas sin Horas Extras: " + personasSinHorasExtras);
    }
}
