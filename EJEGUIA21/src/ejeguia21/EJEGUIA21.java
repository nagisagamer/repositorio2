/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejeguia21;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class EJEGUIA21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
          // Crear matriz M de 10x10 con valores aleatorios entre 0 y 99
        int[][] M = new int[10][10];
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[0].length; j++) {
                M[i][j] = (int) (Math.random() * 100);
            }
        }

        // Crear matriz P de 3x3
        int[][] P = {{8, 9, 10},
                     {9, 10, 11},
                     {10, 11, 12}};

        // Imprimir las matrices en la consola
        System.out.println("Matriz M:");
        imprimirMatriz(M);
        System.out.println("\nMatriz P:");
        imprimirMatriz(P);

        // Buscar la submatriz P en la matriz M
        boolean encontrado = false;
        for (int i = 0; i < M.length - P.length + 1; i++) {
            for (int j = 0; j < M[0].length - P[0].length + 1; j++) {
                // Comprobar si la submatriz de 3x3 de M que comienza en la posición (i,j) coincide con la matriz P
                boolean coincide = true;
                for (int k = 0; k < P.length; k++) {
                    for (int l = 0; l < P[0].length; l++) {
                        if (P[k][l] != M[i + k][j + l]) {
                            coincide = false;
                            break;
                        }
                    }

                    // Si la submatriz no coincide con P, salir del bucle
                    if (!coincide) {
                        break;
                    }
                }

                // Si la submatriz coincide con P, mostrar la posición de la submatriz en M y salir del programa
                if (coincide) {
                    System.out.println("\nLa matriz P se encuentra en la fila " + (i + 1) + " y columna " + (j + 1) + " de la matriz M.");
                    encontrado = true;
                    break;
                }
            }

            // Si se ha encontrado la submatriz, salir del bucle
            if (encontrado) {
                break;
            }
        }

        // Si no se ha encontrado la submatriz, mostrar un mensaje indicándolo
        if (!encontrado) {
            System.out.println("\nLa matriz P no se encuentra en la matriz M.");
        }
    }

    // Función auxiliar para imprimir una matriz en la consola
    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}