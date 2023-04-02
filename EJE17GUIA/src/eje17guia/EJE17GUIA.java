/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje17guia;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class EJE17GUIA {

    /*Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).*
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        //Declarar el vector de N enteros y solicitar al usuario que ingrese los N números.
        System.out.print("Ingrese el tamaño del vector: ");
        int n = sc.nextInt();
        
        int[] vector = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese un número entero: ");
            vector[i] = sc.nextInt();
        }
        //Declarar 5 contadores, uno para cada rango de dígitos: de 1 dígito, de 2 dígitos, de 3 dígitos, de 4 dígitos y de 5 dígitos.
        /*Recorrer el vector e ir incrementando el contador correspondiente según la cantidad 
de dígitos del número en la posición actual. Para ello, puedes usar la función Math.log10()
que devuelve el logaritmo en base 10 de un número, sumarle 1 y aplicarle la función Math.floor() 
para redondear hacia abajo al entero más cercano.*/
         int[] contadores = new int[5];
        for (int i = 0; i < n; i++) {
            int digitos = (int) Math.floor(Math.log10(vector[i]) + 1);
            if (digitos == 1) {
                contadores[0]++;
            } else if (digitos == 2) {
                contadores[1]++;
            } else if (digitos == 3) {
                contadores[2]++;
            } else if (digitos == 4) {
                contadores[3]++;
            } else if (digitos == 5) {
                contadores[4]++;
            }
        }
        //Imprimir el resultado mostrando cuántos números hay en cada rango de dígitos.
        System.out.println("Números de 1 dígito: " + contadores[0]);
        System.out.println("Números de 2 dígitos: " + contadores[1]);
        System.out.println("Números de 3 dígitos: " + contadores[2]);
        System.out.println("Números de 4 dígitos: " + contadores[3]);
        System.out.println("Números de 5 dígitos: " + contadores[4]);
        
    }
    
}
