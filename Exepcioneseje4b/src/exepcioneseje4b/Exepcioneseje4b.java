/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exepcioneseje4b;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Exepcioneseje4b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingrese el primer número: ");
            String numero1String = scanner.next();

            System.out.print("Ingrese el segundo número: ");
            String numero2String = scanner.next();

            int numero1 = Integer.parseInt(numero1String);
            int numero2 = Integer.parseInt(numero2String);

            float resultado = division(numero1, numero2);

            System.out.println("El resultado de la división es: " + resultado);
        } catch (NumberFormatException e) {
            System.out.println("Error al convertir la cadena a entero. " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Error al realizar la división. " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Error de entrada. Ingrese números válidos. " + e.getMessage());
        }
    }

    public static float division(int numero1, int numero2) {
        if (numero2 == 0) {
            throw new ArithmeticException("No se puede dividir por cero.");
        }
        return (float) numero1 / numero2;
    }
    
}
