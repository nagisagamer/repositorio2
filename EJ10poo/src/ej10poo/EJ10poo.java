/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej10poo;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Usuario
 */
public class EJ10poo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         // Creamos los arreglos A y B
        double[] A = new double[50];
        double[] B = new double[20];
        
        // Inicializamos el arreglo A con números aleatorios
        Random rnd = new Random();
        for (int i = 0; i < A.length; i++) {
            A[i] = rnd.nextDouble() * 100; // Números aleatorios entre 0 y 100
        }
        
        // Mostramos el arreglo A sin ordenar
        System.out.println("Arreglo A sin ordenar:");
        System.out.println(Arrays.toString(A));
        
        // Ordenamos el arreglo A de menor a mayor
        Arrays.sort(A);
        
        // Copiamos los primeros 10 elementos del arreglo A al arreglo B
        System.arraycopy(A, 0, B, 0, 10);
        
        // Rellenamos los últimos 10 elementos del arreglo B con el valor 0.5
        Arrays.fill(B, 10, B.length, 0.5);
        
        // Mostramos los dos arreglos resultantes
        System.out.println("Arreglo A ordenado:");
        System.out.println(Arrays.toString(A));
        System.out.println("Arreglo B combinado:");
        System.out.println(Arrays.toString(B));
    }
    }
    
/*El ejercicio consiste en crear un programa en Java que trabaje con dos arreglos: A y B.

El arreglo A debe tener una longitud de 50 números reales, y debe inicializarse con números aleatorios. 
Una forma de hacer esto en Java es utilizando la clase java.util.Random.

Una vez que el arreglo A está inicializado, debemos ordenarlo de menor a mayor. En Java, podemos hacer esto 
utilizando el método Arrays.sort().

Luego, debemos copiar los primeros 10 números ordenados del arreglo A al arreglo B, que tiene una longitud de 
20 números reales. Para hacer esto, podemos utilizar el método System.arraycopy().

Por último, debemos rellenar los últimos 10 elementos del arreglo B con el valor 0.5. En Java, podemos hacer 
esto utilizando el método Arrays.fill().

Una vez que tenemos ambos arreglos A y B procesados, debemos mostrarlos por pantalla. En Java, podemos mostrar un 
arreglo utilizando el método Arrays.toString().

Espero que esta explicación te sea de ayuda. Si tienes alguna duda adicional, no dudes en preguntarme.*/
