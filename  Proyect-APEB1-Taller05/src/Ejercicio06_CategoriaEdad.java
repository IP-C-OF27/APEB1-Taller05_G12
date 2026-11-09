
import java.util.Scanner;

/**
 * Ejercicio 06: "Categoría de Edad: Clasificar a una persona en una categoría
 * de edad (niño, adolescente, adulto) en función de su edad."
 * @author Steven Chamba
 * @version 1.0
 */

public class Ejercicio06_CategoriaEdad {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int edad;
        System.out.print("Ingrese su edad: ");
        edad = entrada.nextInt();
        if (edad >= 0 && edad <= 11) {
            System.out.println("Categoria: Niño");
        } 
        else if (edad >= 12 && edad <= 17) {
            System.out.println("Categoria: Adolescente");
        } 
        else if (edad >= 18) {
            System.out.println("Categoria: Adulto");
        } 
        else {
            System.out.println("Edad no valida");
        }
    }
    
}

/***
 * EVIDENCIA DEL RUN:
 * run:
Ingrese su edad: 7
Categoria: Ni�o
* run:
Ingrese su edad: 12
Categoria: Adolescente
BUILD SUCCESSFUL (total time: 57 seconds)
* run:
Ingrese su edad: 19
Categoria: Adulto
BUILD SUCCESSFUL (total time: 4 seconds)
* 
 */