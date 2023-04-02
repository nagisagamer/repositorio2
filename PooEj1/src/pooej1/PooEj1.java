/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej1;

import Entidad.Persona;
import Servicio.PersonaServicio;

/**
 *
 * @author Usuario
 */
public class PooEj1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         //instanciacion utilizando el constructor por defecto
        //Persona p1 = new Persona();
         //instanciacion utilizando el constructor por parametro
        //Persona p2 = new Persona();
        //invocacion de objetos
        //p1.setNombre("mariano");
        //p2.getNombre();
        
        PersonaServicio p2 = new PersonaServicio();
        Persona p1 = p2.crearpersona();
        
       
       
       
    }

   
    
}
