
import java.util.Scanner;

/**
 * Ejercicio 03: "Mayor de tres números: Dados tres números distintos, 
 * determinar cuál es el mayor."
 * @author Steven Chamba 
 * @version 1.0
 */

public class Ejercicio03_MayorNumeros {
   
   public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double num1, num2, num3;
        System.out.println("Ingrese el primer numero:");
        num1 = entrada.nextDouble();
        System.out.println("Ingrese el segundo numero:");
        num2 = entrada.nextDouble();
        System.out.println("Ingrese el tercer numero:");
        num3 = entrada.nextDouble();
        if (num1 > num2 && num1 > num3) {
            System.out.println("El numero mayor es: " + num1);
        } 
        else if (num2 > num1 && num2 > num3) {
            System.out.println("El numero mayor es: " + num2);
        } 
        else {
            System.out.println("El numero mayor es: " + num3);
        }
   }
}
/***
 * EVIDENCIA DEL RUN:
 * 5
Ingrese el segundo numero:
3
Ingrese el tercer numero:
6
El numero mayor es: 6.0
 */