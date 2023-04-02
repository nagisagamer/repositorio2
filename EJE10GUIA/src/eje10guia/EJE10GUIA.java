/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje10guia;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class EJE10GUIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el límite de la suma:");
        int limite = sc.nextInt();

        int suma = 0;
        int numero;

        while (suma < limite) {
            System.out.println("Ingrese un número:");
            numero = sc.nextInt();
            suma += numero;
        }

        System.out.println("La suma de los números introducidos supera el límite inicial.");
        System.out.println("La suma total es: " + suma);

        sc.close();
    }
    
}
