/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exepcioneseje2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Exepcioneseje2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del arreglo: ");
        int size = scanner.nextInt();

        exep myObject = new exep(size);

        System.out.print("Ingrese un índice: ");
        int index = scanner.nextInt();

        System.out.print("Ingrese un valor: ");
        int value = scanner.nextInt();

        try {
            myObject.setValue(index, value);
            System.out.println("El valor ha sido asignado correctamente.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Se produjo una excepción: " + e.getMessage());
        }

        try {
            int retrievedValue = myObject.getValue(index);
            System.out.println("El valor obtenido es: " + retrievedValue);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Se produjo una excepción: " + e.getMessage());
        }
    }
}
    

   