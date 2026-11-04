
import java.util.Scanner;

/**
 * Ejercicio 01: "Edad para Votar: Determinar si una persona es elegible para
 * votar en función de su edad (mayor o igual a 16 años)."
 * @author Steven Chamba
 * @version 1.0
 */

public class Ejercicio01_LegibleVotacion {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int edad;
        System.out.print("Ingrese su edad: ");
        edad = entrada.nextInt();
        if (edad >= 16) 
            System.out.println("La persona es elegible para votar.");
        else 
            System.out.println("La persona no es elegible para votar.");
    }
}

/***
 * EVIDENCIA DEL RUN:
 * run:
Ingrese su edad: 18
La persona es elegible para votar.
BUILD SUCCESSFUL (total time: 5 seconds)

 */
