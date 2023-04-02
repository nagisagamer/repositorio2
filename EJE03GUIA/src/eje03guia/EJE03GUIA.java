/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje03guia;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class EJE03GUIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("ingresa una frase:");
        String frase = sc.nextLine();
         System.out.println(frase.toUpperCase());
          System.out.println(frase.toLowerCase());
    }
    
}
