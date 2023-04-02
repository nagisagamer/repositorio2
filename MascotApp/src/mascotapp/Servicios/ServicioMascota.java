/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotapp.Servicios;

import java.util.Scanner;
import mascotapp.entidades.Mascota;

/**
 *
 * @author Usuario
 */
public class ServicioMascota {
    
    private Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    public Mascota crearMascota(){
        
        System.out.println("introducir nombre");
        String nombre = sc.next();
        
         System.out.println("introducir apodo");
        String apodo = sc.next();
        
         System.out.println("introducir tipo");
        String tipo = sc.next();
        //esto devuelve el nacimiento de una mascota que va a tener
        //ciertas caracteristicas
        return new Mascota(nombre,apodo,tipo);
         
         
        
    }
    
}
