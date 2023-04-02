/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje19guia;

import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class EJE19GUIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 Scanner sc = new Scanner(System.in);
    // Definir y llenar la matriz con valores
    int[][] matriz = {{0, 1, -2}, {-1, 0, 3}, {2, -3, 0}};
System.out.println(matriz);
    // Verificar si la matriz es cuadrada
    if (matriz.length != matriz[0].length) {
        System.out.println("La matriz no es cuadrada.");
        return;
    }

    // Verificar si la matriz es anti simétrica
    for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz.length; j++) {
            if (matriz[i][j] != -matriz[j][i]) {
                System.out.println("La matriz no es anti simétrica.");
                return;
            }
        }
    }

    // Si llega hasta aquí, la matriz es anti simétrica
    System.out.println("La matriz es anti simétrica.");
}}