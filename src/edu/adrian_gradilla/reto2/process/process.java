package edu.adrian_gradilla.reto2.process;
import java.util.Scanner;
import static edu.adrian_gradilla.reto2.ui.CLI.*;


public class process {
    /*metodo que imprime en pantalla las opciones para realizar la compra una vez el
    usuario lo escoge en el menu después lo guarda en sus respectivas variables*/
    public void realizarCompra(Scanner scanner) {
        System.out.println("Número de cajas a comprar: ");
        cantidadCompra = scanner.nextDouble();
        System.out.println("Costo de las cajas a comprar:  ");
        costoCompra = scanner.nextDouble();
        comprarCajas();
    }
    /*realiza las operaciones de compraCajas y guarda los egresos, monto de caja y totaldeCompras
    * que se realizaron*/
    public void comprarCajas() {
         totalCompras += cantidadCompra;
         egresosCompras = (costoCompra * cantidadCompra);
         montoEnCaja -= (costoCompra * cantidadCompra);
    }
    /*metodo que imprime en pantalla las opciones para realizar la venta una vez el
   usuario lo escoge en el menu después lo guarda en sus respectivas variables*/
    public void realizarVenta(Scanner scanner) {
        System.out.println("Número de cajas a vender: ");
         cantidadVenta = scanner.nextDouble();
        System.out.println("Precio de las cajas a vender: ");
         precioVenta = scanner.nextDouble();
        venderCajas();
    }
    /*realiza las operaciones para la ventaCajas y guarda los ingresos, monto de caja y totalVentas
     * que se realizaron*/
    private void venderCajas() {
         totalVentas += cantidadVenta;
         ingresoVentas = (precioVenta * cantidadVenta);
         montoEnCaja += (cantidadVenta * precioVenta);
    }
}
