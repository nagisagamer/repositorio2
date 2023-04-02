/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje16_bguia;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EJE16_BGUIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
int vector[] = new int[10];
Scanner sc = new Scanner(System.in);

System.out.print("Ingrese el tamaño del vector: ");
int j = sc.nextInt();

for (int i = 0; i < j; i++) {
    System.out.print("Ingrese el elemento " + (i + 1) + " del vector: ");
    vector[i] = sc.nextInt();
}

System.out.print("Ingrese el número a buscar: ");
int num = sc.nextInt();
int cont = 0;

for (int i = 0; i < j; i++) {
    if (vector[i] == num) {
        cont++;
        System.out.println("El número " + num + " se encuentra en la posición " + i + " del vector.");
    }
}

if (cont == 0) {
    System.out.println("El número " + num + " no se encuentra en el vector.");
} else {
    System.out.println("El número " + num + " se repite " + cont + " veces en el vector.");
}}}
            
        
        
      
       
    
    

