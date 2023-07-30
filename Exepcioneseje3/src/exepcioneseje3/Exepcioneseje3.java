/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exepcioneseje3;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Exepcioneseje3 {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        String numero1String = scanner.nextLine();

        System.out.print("Ingrese el segundo número: ");
        String numero2String = scanner.nextLine();

        int numero1 = Integer.parseInt(numero1String);
        int numero2 = Integer.parseInt(numero2String);

        int resultado = numero1 / numero2;

        System.out.println("El resultado de la división es: " + resultado);
    }
    }
    

