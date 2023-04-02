 ./*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg8b;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Ejercicio8b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
       int nota;
               while(true) {
                    System.out.println("ingresa una nota entre 0 y 10");
                    nota = sc.nextInt();
                    if ( nota >= 0 && nota <= 10) {
                      System.out.println("la nota es correcta");  
                    break;
                    } else {
                       System.out.println("ingresa la nota nuevamente");   }
                    
                    
                   
               }
        
                
    }
    
}
/* Si deseas que el programa solicite al usuario que ingrese la nota nuevamente 
hasta que ingrese una nota válida, puedes utilizar un bucle while para envolver 
la estructura condicional if-else:

Scanner sc = new Scanner(System.in);
int nota;
while (true) {
    System.out.println("Ingresa una nota entre 0 y 10");
    nota = sc.nextInt();
    if (nota >= 0 && nota <= 10) {
        System.out.println("La nota es correcta");
        break;
    } else {
        System.out.println("Ingresa la nota nuevamente");
    }
}
En este caso, la sentencia while (true) crea un bucle infinito que solo se 
detiene cuando se encuentra la instrucción break dentro del if. Si la nota 
ingresada no está dentro del rango válido, se imprimirá "Ingresa la nota nuevamente", 
pero el bucle continuará ejecutándose hasta que se ingrese una nota válida.

Ten en cuenta que es importante validar la entrada de los datos de entrada
del usuario para evitar errores en el programa. En el ejemplo anterior, utilizamos 
el operador && para evaluar si la nota ingresada está entre 0 y 10, lo que significa 
que solo se aceptarán números enteros entre esos valores. Si deseas permitir decimales 
o números negativos, deberás ajustar la condición en consecuencia. */

