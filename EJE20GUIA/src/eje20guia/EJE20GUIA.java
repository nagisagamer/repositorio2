/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje20guia;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class EJE20GUIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear una matriz de 3 x 3 para almacenar los números ingresados por el usuario.
          int[][] cuadrado = new int[3][3];
        Scanner sc = new Scanner(System.in);
        boolean esMagico = true;
//Pedir al usuario que ingrese cada número de la matriz y validar que se encuentren entre 1 y 9.
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Ingrese el número en la posición [" + i + "][" + j + "]: ");
                int num = sc.nextInt();
                while (num < 1 || num > 9) {
                    System.out.println("El número ingresado no es válido. Intente nuevamente.");
                    System.out.print("Ingrese el número en la posición [" + i + "][" + j + "]: ");
                    num = sc.nextInt();
                }
                cuadrado[i][j] = num;
            }
        }
//Calcular la suma de ambas diagonales y comprobar que sean iguales. Si no son iguales, la matriz no es un cuadrado mágico.
        int sumadiag1 = cuadrado[0][0] + cuadrado[1][1] + cuadrado[2][2];
        int sumadiag2 = cuadrado[0][2] + cuadrado[1][1] + cuadrado[2][0];

        if (sumadiag1 != sumadiag2) {
            esMagico = false;
        }
/*Calcular la suma de cada fila, columna y comparar con la suma de las diagonales. 
Si alguna de estas sumas no es igual a la suma de las diagonales, la matriz no es un cuadrado mágico.*/
        for (int i = 0; i < 3; i++) {
            int sumafila = 0;
            int sumacolumna = 0;
            for (int j = 0; j < 3; j++) {
                sumafila += cuadrado[i][j];
                sumacolumna += cuadrado[j][i];
            }
            if (sumafila != sumacolumna || sumafila != sumadiag1) {
                esMagico = false;
            }
        }
//Si todas las sumas son iguales, entonces la matriz es un cuadrado mágico.
        if (esMagico) {
            System.out.println("¡El cuadrado es mágico!");
        } else {
            System.out.println("El cuadrado no es mágico.");
        }
    }
}
    
    

