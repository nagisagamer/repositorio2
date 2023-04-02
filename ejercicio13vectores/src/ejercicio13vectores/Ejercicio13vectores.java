/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio13vectores;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Ejercicio13vectores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de compañeros de equipo:");
        int n = sc.nextInt();
        sc.nextLine(); // Consumir el carácter de nueva línea en el búfer de entrada

        String[] equipo = new String[n];

        int i = 0;
        while (i < n) {
            System.out.println("Ingrese el nombre del compañero " + (i+1) + " o presione Enter para finalizar:");
            String nombre = sc.nextLine();
            if (nombre.equals("")) {
                break;
            }
            equipo[i] = nombre;
            i++;
        }
    }
}