/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje11guia;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class EJE11GUIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        int num1, num2, resultado;
//mientras no sea igual a 5 no se sale del menu
        while (opcion != 5) {
            System.out.println("MENU");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Elija opción: ");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el primer número:");
                    num1 = sc.nextInt();
                    System.out.println("Ingrese el segundo número:");
                    num2 = sc.nextInt();
                    resultado = num1 + num2;
                    System.out.println("La suma es: " + resultado);
                    break;
                case 2:
                    System.out.println("Ingrese el primer número:");
                    num1 = sc.nextInt();
                    System.out.println("Ingrese el segundo número:");
                    num2 = sc.nextInt();
                    resultado = num1 - num2;
                    System.out.println("La resta es: " + resultado);
                    break;
                case 3:
                    System.out.println("Ingrese el primer número:");
                    num1 = sc.nextInt();
                    System.out.println("Ingrese el segundo número:");
                    num2 = sc.nextInt();
                    resultado = num1 * num2;
                    System.out.println("La multiplicación es: " + resultado);
                    break;
                case 4:
                    System.out.println("Ingrese el primer número:");
                    num1 = sc.nextInt();
                    System.out.println("Ingrese el segundo número:");
                    num2 = sc.nextInt();
                    if (num2 == 0) {
                        System.out.println("Error: no se puede dividir por cero");
                    } else {
                        resultado = num1 / num2;
                        System.out.println("La división es: " + resultado);
                    }
                    break;
                case 5:
                    System.out.print("¿Está seguro de salir del sistema? (S/N): ");
            String respuesta = sc.next();
            if (respuesta.equalsIgnoreCase("S")) {
                opcion = 5;
                System.out.println("Saliendo del programa...");
            }
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
        }

        sc.close();
    }
    
}
