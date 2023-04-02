/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ejercicio8 {

    /*
Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 la nota se
pedirá de nuevo hasta que la nota sea correcta.
 */


   
    public static void main(String[] args) {
        // TODO code application logic here
        
        int nota;
        
        Scanner Leer = new Scanner(System.in);
        
        System.out.println(" Ingrese una nota ");
        nota = Leer.nextInt();
        
        while( nota < 0 || nota > 10 )
        { 
            System.out.println(" Nota incorrecta, Ingresela de nuevo ");
           System.out.println(" Ingrese una nota ");
           nota = Leer.nextInt();
        }
        
        System.out.println(" La nota es correcta ");
        
        
        
        
    }
    
}