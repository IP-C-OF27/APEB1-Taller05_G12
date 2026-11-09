
import java.util.Scanner;

/**
 * Ejercicio 05: "Año Bisiesto: Comprobar si un año ingresado es bisiesto o no.
 * Si es bisiesto, mostrar un mensaje especial."
 * @author NombreAutor
 * @version 1.0
 */
public class Ejercicio05_AñoBisiesto {
   public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int anio;
        System.out.print("Por favor, ingrese un año: ");
        anio = teclado.nextInt();
        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
        System.out.println("¡Felicidades! El año " + anio + " es BISIESTO. "
                + "¡Tiene un día extra en febrero! 🎉");
        }
        else {
            System.out.println("El año " + anio + " no es bisiesto.");
        }
     }
   }

/***
 * EVIDENCIA DEL RUN:
 * run:
Por favor, ingrese un a�o: 2024
�Felicidades! El a�o 2024 es BISIESTO. �Tiene un d�a extra en febrero! ?
El a�o 2024 no es bisiesto.
 */