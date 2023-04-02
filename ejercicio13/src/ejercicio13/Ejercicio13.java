/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio13;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
   Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer número:");
        int a = sc.nextInt();
        System.out.println("Ingrese el segundo número:");
        int b = sc.nextInt();

        EsMultiplo(a, b);
    }

    public static void EsMultiplo(int a, int b) {
        if (a % b == 0) {
            System.out.println(a + " es múltiplo de " + b);
        } else {
            System.out.println(a + " no es múltiplo de " + b);
        }
    }
}