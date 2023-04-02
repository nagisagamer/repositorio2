/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje01guia;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class EJE01GUIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Scanner sc = new Scanner(System.in);
     System.out.println("ingrese un numero");
     int num1 = sc.nextInt();
     System.out.println("ingrese el segundo numero");
     int num2 = sc.nextInt();
     int resultado = num1+num2;
     System.out.println("El resultado de la suma es: "+resultado);
     
    }
    
}
