/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje08guia;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class EJE08GUIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa una frase o palabra que no pase de 8 espacios");
        String frase = sc.nextLine();
       
         if (frase.length() <= 8){
             System.out.println("correcto");
        }else{
            System.out.println("incorrecto");
    }
    }
    
}
