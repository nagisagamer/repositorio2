/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje07guia;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class EJE07GUIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String cadena1="eureka";
        System.out.println("ingresa la palabra para ver si son iguales");
        String cadena2 = sc.nextLine();
        if (cadena1.equalsIgnoreCase(cadena2)){
             System.out.println("Si es igual");
        }else{
            System.out.println("No es igual");
    }
    
}}
