/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje14guia;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class EJE14GUIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de pesos argentinos a convertir: ");
        double cantidadARS = scanner.nextDouble();

        System.out.println("Elija la moneda a la que desea convertir:");
        System.out.println("1. Dólares");
        System.out.println("2. Euros");
        System.out.println("3. Yenes");
        int opcion = scanner.nextInt();

        double cantidadConvertida;
        switch (opcion) {
            case 1:
                cantidadConvertida = convertirARSaUSD(cantidadARS);
                System.out.printf("%.2f ARS son %.2f USD", cantidadARS, cantidadConvertida);
                break;
            case 2:
                cantidadConvertida = convertirARSaEUR(cantidadARS);
                System.out.printf("%.2f ARS son %.2f EUR", cantidadARS, cantidadConvertida);
                break;
            case 3:
                cantidadConvertida = convertirARSaJPY(cantidadARS);
                System.out.printf("%.2f ARS son %.2f JPY", cantidadARS, cantidadConvertida);
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }
    }

    public static double convertirARSaUSD(double cantidadARS) {
        double tasaDeCambio = 0.011; // tasa actual ARS a USD
        return cantidadARS * tasaDeCambio;
    }

    public static double convertirARSaEUR(double cantidadARS) {
        double tasaDeCambio = 0.0092; // tasa actual ARS a EUR
        return cantidadARS * tasaDeCambio;
    }

    public static double convertirARSaJPY(double cantidadARS) {
        double tasaDeCambio = 1.22; // tasa actual ARS a JPY
        return cantidadARS * tasaDeCambio;
    }
}

    /*El .2f en el código representa el número de decimales que se deben mostrar 
al imprimir el valor de la conversión de divisas. En este caso, .2f significa que 
se deben mostrar dos decimales después del punto decimal en el valor de la conversión.

Por ejemplo, si la conversión de $1000 pesos argentinos a dólares es igual a $13.22, 
la cadena de formato %.2f se asegura de que se muestre como $13.22 y no como 
$13.22222222. Esto ayuda a que la salida sea más legible y fácil de leer. */
    

