package edu_AdrianGradilla.Reto7.Process;

public class Cafetera {
    private double CapacidadCafe = 2000;
    private double CapacidadAgua = 3000;
    private double CapacidadAzucar = 2000;

    public Cafetera() {
    }

    public Cafetera(double capacidadCafe, double capacidadAgua, double capacidadAzucar) {
        CapacidadCafe = capacidadCafe;
        CapacidadAgua = capacidadAgua;
        CapacidadAzucar = capacidadAzucar;
    }

    public boolean tieneSuficientesInsumos(double cantidadCafe, double cantidadAzucar) {
        return CapacidadCafe >= cantidadCafe && CapacidadAzucar >= cantidadAzucar;
    }

    public void servirVasoCafe(VasosCafe vaso) {
        if (tieneSuficientesInsumos(vaso.getCantidadCafe(), vaso.getCantidadAzucar())) {
            CapacidadCafe -= vaso.getCantidadCafe();
            CapacidadAzucar -= vaso.getCantidadAzucar();
            System.out.println("Se ha servido un vaso de café: " + vaso.getTamaño() + " - Precio: $" + vaso.getPrecio());
        } else {
            System.out.println("No hay suficientes insumos para servir el vaso de café.");
        }
    }

    public void agregarCafe(double cantidadCafe) {
        if (CapacidadCafe + cantidadCafe <= 2000) {
            CapacidadCafe += cantidadCafe;
            System.out.println("Se han agregado " + cantidadCafe + " gramos de café a la cafetera.");
        } else {
            System.out.println("No hay suficiente espacio en la cafetera para agregar más café.");
        }
    }

    public void mostrarInsumosDisponibles() {
        System.out.println("Insumos disponibles:");
        System.out.println("Café: " + CapacidadCafe + " gramos");
        System.out.println("Agua: " + CapacidadAgua + " mililitros");
        System.out.println("Azúcar: " + CapacidadAzucar + " gramos");
    }

    public void vaciarCafetera() {
        CapacidadCafe = 0;
        CapacidadAgua = 0;
        CapacidadAzucar = 0;
        System.out.println("La cafetera ha sido vaciada.");
    }
}
