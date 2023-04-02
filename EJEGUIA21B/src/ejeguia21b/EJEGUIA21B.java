/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejeguia21b;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class EJEGUIA21B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
          // Crear matriz M de 10x10 con la matriz P como submatriz
          int[][] m = {
            {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
            {11, 12, 13, 14, 15, 16, 17, 18, 19, 20},
            {21, 22, 23, 24, 25, 26, 27, 28, 29, 30},
            {31, 32, 33, 34, 35, 36, 37, 38, 39, 40},
            {41, 42, 43, 44, 45, 46, 47, 48, 49, 50},
            {51, 52, 53, 54, 55, 56, 57, 58, 59, 60},
            {61, 62, 63, 64, 65, 66, 67, 68, 69, 70},
            {71, 72, 73, 74, 75, 76, 77, 78, 79, 80},
            {81, 82, 83, 84, 85, 86, 87, 88, 89, 90},
            {91, 92, 93, 94, 95, 96, 97, 98, 99, 100}
        };

        int[][] p = {
            {44, 45, 46},
            {54, 55, 56},
            {64, 65, 66}
        };

        // Imprimir la matriz M
        imprimirMatriz(m);

        // Verificar si la matriz P está contenida en la matriz M
        boolean encontrada = false;
        for (int i = 0; i < m.length - p.length + 1; i++) {
            for (int j = 0; j < m[i].length - p[0].length + 1; j++) {
                boolean coinciden = true;
                for (int k = 0; k < p.length; k++) {
                    for (int l = 0; l < p[k].length; l++) {
                        if (m[i+k][j+l] != p[k][l]) {
                            coinciden = false;
                            break;
                        }
                    }
                    if (!coinciden) {
                        break;
                    }
                }
                if (coinciden) {
                    encontrada = true;
                    System.out.printf("La submatriz P comienza en la fila %d, columna %d%n", i, j);
                }
            }
        }

        if (!encontrada) {
            System.out.println("La matriz P no está contenida en la matriz M.");
        }

    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%2d ", matriz[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

}