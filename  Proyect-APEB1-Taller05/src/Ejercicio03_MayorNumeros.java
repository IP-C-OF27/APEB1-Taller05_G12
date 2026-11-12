
import java.util.Scanner;

/**
 * Ejercicio 03: "Mayor de tres números: Dados tres números distintos, 
 * determinar cuál es el mayor."
 * @author Steven Chamba 
 * @version 1.0
 */

public class Ejercicio03_MayorNumeros {
   public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.println("Ingrese el 3 numeros:");
        int num1 = tcl.nextInt(), num2 = tcl.nextInt(),num3 = tcl.nextInt(), mayor;
        if (num1 > num2 )
            mayor = num1; 
        else 
            mayor = num2;
        if (mayor < num3)
            mayor = num3;
        System.out.println("El numero mayor es: " + mayor);
   }
}
/***
 * EVIDENCIA DEL RUN:
 * run:
Ingrese el 3 numeros:
1 2 3
El numero mayor es: 3
 */