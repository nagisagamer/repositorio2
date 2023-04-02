/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje04guia;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class EJE04GUIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la temperatura en grados centígrados:");
        Double celsius = sc.nextDouble();
        Double fahrenheit = 32 + (9 * celsius / 5);
        System.out.println("Los grados centigrados ingresados equivalen a: " + fahrenheit + " grados fahrenheit." );
    }
    
}
