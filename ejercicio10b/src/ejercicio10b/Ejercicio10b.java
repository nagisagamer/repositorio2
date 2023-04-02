/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10b;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Ejercicio10b {
    

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
      /*Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el número 
ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:*/
      Scanner sc = new Scanner(System.in);
int numero;
    for (int i = 1; i <= 4; i++) {
      do {
        System.out.print("Ingrese un numero entre 1 y 20: ");
        numero = sc.nextInt();
      } while (numero < 1 || numero > 20);

      System.out.print(numero + " ");

      for (int j = 1; j <= numero; j++) {
        System.out.print("*");
      }

      System.out.println();
    }
  }
}

    
