/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej12poo;

import Service.ServicioPersona;
import entidad.Persona;

/**
 *
 * @author Usuario
 */
public class EJ12poo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ServicioPersona servicioPersona = new ServicioPersona();

        Persona persona = servicioPersona.crearPersona();

        if (persona != null) {
            servicioPersona.mostrarPersona(persona);

            if (servicioPersona.menorQue(persona, 18)) {
                System.out.println("La persona es menor de edad.");
            } else {
                System.out.println("La persona es mayor de edad.");
            }
        }
    }
    }
    

