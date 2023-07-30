/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.relacionesprueba1;

import entidad.Dni;
import persona.Persona;

/**
 *
 * @author Usuario
 */
public class Relacionesprueba1 {

    public static void main(String[] args) {
    Dni dni = new Dni('A', 12345678);
        Persona persona = new Persona("John", "Doe", dni);
        
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Apellido: " + persona.getApellido());
        System.out.println("DNI: " + persona.getDni().getSerie() + persona.getDni().getNumero());
    }
}
