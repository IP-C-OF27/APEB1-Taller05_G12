
import java.util.Scanner;

/**
 * Ejercicio 04: "Descuento en Compras: Calcular el precio final de un producto
 * con un descuento del 10% si el precio original es mayor de $100; de lo
 * contrario, no hay descuento."
 * @author Steven Chamba
 * @version 1.0
 */
public class Ejercicio04_DescuentoCompras {
    public static void main(String[] args) {
        double precio;
        Scanner tcl = new Scanner(System.in);
        System.out.println("Ingrese el precio del producto:");
        precio = tcl.nextInt();
        if (precio > 100)
            precio = precio * 0.9;
        System.out.println(precio);

    }
}
/**
 *run:
Ingrese el precio del producto:
1000
900.0
BUILD SUCCESSFUL (total time: 3 seconds) 
 */