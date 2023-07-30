/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Colecciones1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         ArrayList<String> razasPerros = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;
        
        while (continuar) {
            System.out.println("Ingresa la raza del perro:");
            String raza = scanner.nextLine();
            razasPerros.add(raza);
            
            System.out.println("¿Quieres agregar otra raza de perro? (s/n)");
            String respuesta = scanner.nextLine();
            
            if (respuesta.equals("n")) {
                continuar = false;
            }
        }
        
        System.out.println("Razas de perros guardadas:");
        for (String raza : razasPerros) {
            System.out.println(raza);
        }
    }
    
}
