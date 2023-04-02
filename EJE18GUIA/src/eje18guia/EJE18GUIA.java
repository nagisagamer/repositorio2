/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje18guia;

import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class EJE18GUIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Scanner sc = new Scanner(System.in);
  int[][] matriz = new int[4][4];
        Random aleatorio = new Random();
        
        // Rellenar matriz con valores aleatorios
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = aleatorio.nextInt(100);
            }
        }
        
        // Mostrar matriz original
        System.out.println("Matriz original:");
        mostrarMatriz(matriz);
        
        // Obtener matriz traspuesta
        int[][] traspuesta = obtenerMatrizTraspuesta(matriz);
        
        // Mostrar matriz traspuesta
        System.out.println("Matriz traspuesta:");
        mostrarMatriz(traspuesta);
    }
    
    // Método que muestra una matriz en consola
    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    // Método que obtiene la matriz traspuesta de una matriz dada
    public static int[][] obtenerMatrizTraspuesta(int[][] matriz) {
        int[][] traspuesta = new int[matriz[0].length][matriz.length];
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                traspuesta[j][i] = matriz[i][j];
            }
        }
        
        return traspuesta;
    }
}
/*Se declara una matriz de 4x4 y se crea un objeto de la clase Random para generar valores aleatorios.
Se recorre la matriz con dos bucles for anidados para rellenarla con valores aleatorios.

Se muestra la matriz original en consola utilizando el método mostrarMatriz.

Se llama al método obtenerMatrizTraspuesta para obtener la matriz traspuesta de la matriz original.

Se muestra la matriz traspuesta en consola utilizando el método mostrarMatriz.

El método obtenerMatrizTraspuesta recibe una matriz como parámetro y devuelve su matriz traspuesta. 

Para ello, se crea una nueva matriz con las dimensiones invertidas de la matriz original y se 
copian los elementos en su posición correspondiente intercambiando filas y columnas. 

Finalmente, se devuelve la matriz traspuesta.

El método mostrarMatriz recibe una matriz como parámetro y la muestra en consola utilizando 
dos bucles for anidados. Se utiliza el caracter \t para separar los elementos de la matrizen la salida.*/
        