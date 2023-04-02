/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje13guia;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class EJE13GUIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la longitud de un lado del cuadrado: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
    }
    
}
}
    /*En primer lugar, el programa utiliza la clase Scanner para solicitar al usuario 
la longitud del lado del cuadrado que se desea dibujar:

Scanner scanner = new Scanner(System.in);

System.out.print("Ingrese la longitud de un lado del cuadrado: ");
int n = scanner.nextInt();

Luego, se utiliza un bucle for anidado para iterar sobre cada fila y cada columna del cuadrado:

for (int i = 1; i <= n; i++) {
    for (int j = 1; j <= n; j++) {
        // ...
    }
}
Dentro de los bucles for, se utiliza una estructura if para determinar si el carácter actual que se
está dibujando es parte del borde del cuadrado o del interior del cuadrado. Si el índice de fila (i) 
o el índice de columna (j) es igual a 1 o a n (la longitud del lado del cuadrado), entonces se está 
dibujando el borde del cuadrado y se imprime el carácter "*":

if (i == 1 || i == n || j == 1 || j == n) {
    System.out.print("* ");
} else {
    System.out.print("  ");
}
Si no se está dibujando el borde del cuadrado, se está dibujando el interior del cuadrado 
y se imprime un espacio en blanco.

Finalmente, se utiliza el método System.out.println() para imprimir una nueva línea después 
de cada fila del cuadrado:

System.out.println();
De esta manera, el programa dibuja un cuadrado de n elementos por lado utilizando el carácter "*". */
