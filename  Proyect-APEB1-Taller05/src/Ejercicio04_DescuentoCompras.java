
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
        Scanner entrada = new Scanner(System.in);
        double precio, descuento, precioFinal;
        System.out.println("Ingrese el precio del producto:");
        precio = entrada.nextDouble();
        if (precio > 100) {
            descuento = precio * 0.10;
        } else {
            descuento = 0;
        }
        precioFinal = precio - descuento;
        System.out.println("Precio original: $" + precio);
        System.out.println("Descuento: $" + descuento);
        System.out.println("Precio final: $" + precioFinal);

    }
}
