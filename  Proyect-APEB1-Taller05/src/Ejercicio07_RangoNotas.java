
import java.util.Scanner;

/**
 * Ejercicio 07: "Rango de Notas: Asignar una letra (A, B, C, D) a una
 * calificación en función de su rango (A para 90-100, B para 80-89, etc.)."
 * @author Steven Chamba
 * @version 1.0
 */
public class Ejercicio07_RangoNotas {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int nota;
        System.out.print("Por favor, ingrese su nota: ");
        nota = tcl.nextInt();
        if(nota >=90)
            System.out.println("Su categoria es: A ");
        else if(nota >= 80 && nota < 90)
            System.out.println("Su categoria es: B ");
        else if (nota >= 70 && nota < 90)
            System.out.println("Su categoria es: C ");
        else if (nota < 70) 
            System.out.println("Su categoria es: D");
    }
}
/**
 * run:
Por favor, ingrese su nota: 900
Su categoria es: A 
* run:
Por favor, ingrese su nota: 70
Su categoria es: C 
* run:
Por favor, ingrese su nota: 87
Su categoria es: B 
BUILD SUCCESSFUL (total time: 3 seconds)

 */