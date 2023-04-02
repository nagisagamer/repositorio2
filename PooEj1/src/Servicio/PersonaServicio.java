/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class PersonaServicio {
    
    public Persona crearpersona(){
        
    
    Persona p1 = new Persona();
    
    Scanner leer = new Scanner(System.in);
    
    System.out.println("ingrese el nombre de la persona");
    p1.setNombre(leer.next());
 
    System.out.println("ingrese el apellido de la persona");
    p1.setApellido(leer.next());
    
     System.out.println("ingrese la edad de la persona");
    p1.setEdad(leer.nextInt());
    
     System.out.println("ingrese la estatura de la persona");
    p1.setEstatura(leer.nextInt());
    
     System.out.println("ingrese la identificacion de la persona");
    p1.setIdentificacion(leer.nextInt());
    
    System.out.println("La persona ha sido creada felicidades");
    return p1;
    }
}
