/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exepcioneseje5b;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Exepcioneseje5b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numeroAdivinar = random.nextInt(500) + 1;
        int intentos = 1;

        System.out.println("¡Bienvenido al juego de adivinar el número! solo tienes 1 intento");

        while (true) {
            System.out.print("Ingresa un número (1-500): ");

            try {
                int numeroUsuario = scanner.nextInt();
                intentos++;

               if (numeroUsuario == numeroAdivinar) {
                    System.out.println("¡Felicidades! Has adivinado el número.");
                    System.out.println("Número de intentos: " + intentos);
                    break;
                } else {
                    System.out.println("Lo siento, no has adivinado el número.");
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Debes ingresar un número válido.");
                intentos++;
                scanner.nextLine(); // Limpiar el búfer del escáner
            }
        }

        scanner.close();
    }
    
}
