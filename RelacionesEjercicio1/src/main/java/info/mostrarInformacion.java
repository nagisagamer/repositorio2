/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package info;

/**
 *
 * @author Usuario
 */
public class mostrarInformacion {
     System.out.println("Nombre: " + nombre + " " + apellido);
        System.out.println("Edad: " + edad);
        System.out.println("Documento: " + dni);
        
        if ( perro != null) {
            System.out.println("Perro adoptado:");
            System.out.println("Nombre: " + perro.getNombre());
            System.out.println("Raza: " + perro.getRaza());
            System.out.println("Edad: " + perro.getEdad());
            System.out.println("Tamaño: " + perro.getTamaño());
        } else {
            System.out.println("No ha adoptado ningún perro.");
        }
    
}
