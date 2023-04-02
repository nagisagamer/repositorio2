/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio14;
import java.util.Scanner
/**
 *
 * @author Usuario
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner sc = new Scanner(System.in);
        
        // Solicita al usuario que ingrese la cantidad de compañeros de equipo
        System.out.println("Ingrese la cantidad de compañeros de equipo:");
        int n = sc.nextInt();
        sc.nextLine(); // Consumir el carácter de nueva línea en el búfer de entrada
        
        // Crea un vector llamado 'Equipo' con una dimensión igual a 'n'
        String[] Equipo = new String[n];
        
        // Itera 'n' veces utilizando un bucle 'for'
        for (int i = 0; i < n; i++) {
            // Solicita al usuario que ingrese el nombre del compañero de equipo
            System.out.println("Ingrese el nombre del compañero " + (i+1) + ":");
            String nombre = sc.nextLine();
            
            // Agrega el nombre del compañero de equipo al vector 'Equipo'
            Equipo[i] = nombre;
        }

        // Imprime los nombres de los compañeros de equipo almacenados en el vector 'Equipo'
        System.out.println("Los nombres de los compañeros de equipo son:");
        for (int i = 0; i < n; i++) {
            System.out.println(Equipo[i]);
        }
    }
}
  
