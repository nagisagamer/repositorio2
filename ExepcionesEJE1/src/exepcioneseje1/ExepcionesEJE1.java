/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exepcioneseje1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ExepcionesEJE1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        
         try {
            System.out.print("Ingrese su edad: ");
            int edad = scanner.nextInt();

            Persona persona = null;
            if (edad >= 0) {
                persona = new Persona();
                persona.setEdad(edad);
            }

            if (persona != null) {
                persona.esMayorDeEdad();
            } else {
                System.out.println("No se puede determinar si es mayor de edad.");
            }

        } catch (NullPointerException e) {
            System.out.println("Se produjo una excepción: " + e.getMessage());
        }
    }
    
   }
   
