/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje16guia;

import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class EJE16GUIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc = new Scanner(System.in);
        
        // Pedir al usuario el tamaño del vector y el número a buscar
        System.out.print("Ingrese el tamaño del vector: ");
        int n = sc.nextInt();
        int[] vector = new int[n];
         System.out.print("Ingrese el número a buscar: ");
        int num = sc.nextInt();
        // Llenar el vector con valores aleatorios
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            vector[i] = rand.nextInt(100);
            }
        
        // Buscar el número en el vector
        boolean encontrado = false;
        for (int i = 0; i < n; i++) {
            if (vector[i] == num) {
                System.out.println("El número " + num + " se encuentra en la posición " + i + " del vector.");
                encontrado = true;
            }
        }
        
        if (!encontrado) {
            System.out.println("El número " + num + " no se encuentra en el vector.");
        }
    }
    
}
