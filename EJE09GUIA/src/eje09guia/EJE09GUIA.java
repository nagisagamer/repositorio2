/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje09guia;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class EJE09GUIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String cadena1="A";
        System.out.println("ingresa una palabra o frase para detectar si la primera letra es una A");
        String cadena2 = sc.nextLine();
        if (cadena2.toUpperCase().startsWith(cadena1)){
             System.out.println("Correcto");
        }else{
            System.out.println("incorrecto");
    }
    }
    
}
