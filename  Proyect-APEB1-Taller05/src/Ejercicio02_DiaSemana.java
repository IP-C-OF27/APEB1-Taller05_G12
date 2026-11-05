
import java.util.Scanner;

/**
 * Ejercicio 02: "Día de la semana: Mostrar el nombre del día de la semana en
 * función del número ingresado (1 para lunes, 2 para martes, etc.)."
 * @author Steven 
 * @version 1.0
 */
public class Ejercicio02_DiaSemana {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese un numero de dia 1 al 7: ");
        int dia = entrada.nextInt();
        String msjDia;
        switch (dia)
        {//INICIO SENTENCIA DE SELECCION MULTIPLE  
            case 1: 
                msjDia= "Lunes";
                break;
            case 2: 
                msjDia= "Martes";
                break;
            case 3:
                msjDia= "Miercoles";
                break;
            case 4:
                msjDia= "Jueves";
                break;
            case 5:
                msjDia= "Viernes";
                break;
            case 6:
                msjDia= "Sabado";
                break;
            case 7:
                msjDia= "Domingo";
                break;
            default: 
                msjDia= "Error";              
        }//FIN SENTENCIA DE SELECCION MULTIPLE 
    System.out.print("El numero: " + dia + " corresponde a: " + msjDia);    
    }
}
/***
 * EVIDENCIA DEL RUN:
 Ingrese un numero de dia 1 al 7: 5
El numero: 5 corresponde a: Viernes
 */