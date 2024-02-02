package edu.adrian_gradilla.reto2.process;
import java.util.Scanner;
import static edu.adrian_gradilla.reto2.ui.CLI.*;


public class process {
    public void realizarCompra(Scanner scanner) {
        System.out.println("Número de cajas a comprar: ");
        cantidadCompra = scanner.nextDouble();
        System.out.println("Costo de las cajas a comprar: ");
        costoCompra = scanner.nextDouble();
        comprarCajas();
    }

    public void comprarCajas() {
         totalCompras = cantidadCompra;
         egresosCompras = (costoCompra * cantidadCompra);
         montoEnCaja = (costoCompra * cantidadCompra);
    }

    public void realizarVenta(Scanner scanner) {
        System.out.println("Número de cajas a vender: ");
         cantidadVenta = scanner.nextDouble();
        System.out.println("Precio de las cajas a vender: ");
         precioVenta = scanner.nextDouble();
        venderCajas();
    }

    private void venderCajas() {
         totalVentas = cantidadVenta;
         ingresoVentas = (precioVenta * cantidadVenta);
         montoEnCaja = (cantidadVenta * precioVenta);
    }
}
