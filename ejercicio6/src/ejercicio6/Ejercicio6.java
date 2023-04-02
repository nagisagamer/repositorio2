/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*EJERCICIO 6
Implementar un programa que le pida dos números enteros a usuario y determine si ambos o
alguno de ellos es mayor a 25.*/
   Scanner scanner = new Scanner(System.in);

// Ask user 1 to input a value
System.out.println("Usuario 1, ingrese un valor:");
int n1 = scanner.nextInt();

// Ask user 2 to input a value
System.out.println("Usuario 2, ingrese un valor:");
int n2 = scanner.nextInt();

// Check if both numbers are greater than 25
if (n1 > 25 && n2 > 25) {
    System.out.println("Los dos números ingresados son mayores a 25.");
} 
// Check if only the first number is greater than 25
else if (n1 > 25) {
    System.out.println("El primer número ingresado es mayor a 25.");
} 
// Check if only the second number is greater than 25
else if (n2 > 25) {
    System.out.println("El segundo número ingresado es mayor a 25.");
} 
// If none of the numbers are greater than 25
else {
    System.out.println("Ninguno de los números ingresados es mayor a 25.");
}
}
    }

