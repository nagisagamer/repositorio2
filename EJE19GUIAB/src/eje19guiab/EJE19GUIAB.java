/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje19guiab;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EJE19GUIAB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner poner = new Scanner(System.in);
        System.out.println("Ingrese la dimensión de la matriz:");
        int n = poner.nextInt();
        System.out.println("Completa los espacios de la matriz:");
        int[][] matriz = new int[n][n];
        int[][] antimatriz = new int[n][n];
        boolean valor = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("matriz[" + i + "][" + j + "] = ");
                matriz[i][j] = poner.nextInt();
                antimatriz[j][i] = -1 * (matriz[i][j]);
                System.out.println("");
            }
        }

        System.out.println("¿La matriz es antisimétrica?");
        System.out.println("la matriz ingresada es:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("[" + matriz[i][j] + "] ");
                if (matriz[i][j] == antimatriz[i][j]) {
                    valor = valor && true;
                } else {
                    valor = valor && false;
                }
            }
            System.out.println("");
        }
        
        System.out.println("La matriz transpuesta negativa es:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("[" + antimatriz[i][j] + "] ");
            }
            System.out.println("");
        }
        
        if ( valor == true) {
            System.out.println("La matriz es antisimétrica");
        } else {
            System.out.println("La matriz no es antisimétrica");
        }
    }
}
    
    

