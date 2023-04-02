/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6b;

import java.util.Scanner;
import java.util.scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio6b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          /*Implementar un programa que le pida dos números enteros a usuario y determine si ambos o
alguno de ellos es mayor a 25.*/

System.out.println("ingrese un numero: ");
int n1 = scanner.nextInt();

System.out.println("ingrese otro numero: ");
int n2 = scanner.nextInt();

if (n1 > 25 && n2 > 25 ){
    System.out.println(" Los 2 numeros son mayores a 25 ");
    
} else if (n1 > 25) {
     System.out.println(" El primer numero es mayor a 25 ");
} else if (n2 > 25 ){
    System.out.println(" El segundo numero es mayor a 25 ");
}else{
    System.out.println(" ninguno de los numeros es mayor a 25 ");
}
}
}
    
    
