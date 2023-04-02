/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg9;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
 public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        int suma = 0;

        for (int i = 0; i < 20; i++) {
            System.out.println("Ingrese un número:");
            int numero = scanner.nextInt();

            if (numero == 0) {
                System.out.println("Se capturó el número cero.");
                break;
            }

            if (numero < 0) {
                System.out.println("El número ingresado es negativo y no se sumará.");
                continue;
            }

            suma += numero;
        }

        System.out.println("La suma de los números leídos es: " + suma);
    }
}