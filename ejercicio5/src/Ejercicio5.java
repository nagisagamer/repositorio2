/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
    Scanner scanner = new Scanner(System.in);
        
        boolean cf;
        double decimal;
        char caracter;
        
        System.out.println("ingrese un valor booleano (verdadero o falso)");
        cf = scanner.nextBoolean();
        System.out.println("ingresa un valor");
        decimal = scanner.nextDouble();
        System.out.println("ingresa tu nombre");
        caracter = scanner.next().charAt(0);
        
        System.out.println("el valor booleano es: " + cf);
        System.out.println("el valor decimal es: " + decimal);
        System.out.println("el nombre es: " + caracter);
        
        
        
       
                // TODO code application logic here
;
    }
    
}
