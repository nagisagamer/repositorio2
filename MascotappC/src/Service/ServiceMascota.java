/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Mascota;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ServiceMascota {
    
  
    
    //private Scanner sc = new Scanner(System.in).useDelimiter("\n");
    private Scanner sc;
    private ArrayList<String> mascotas;
    public ServiceMascota() {
        this.sc = new Scanner(System.in).useDelimiter("\n");
        this.mascotas = new ArrayList();
        }
    
    
    public void crearMascota(){
        
        System.out.println("introducir nombre");
        String nombre = sc.next();
        
         System.out.println("introducir apodo");
        String apodo = sc.next();
        
         System.out.println("introducir tipo");
        String tipo = sc.next();
        
        String mascota = nombre + " " + apodo + " " + tipo;
        
        mascotas.add(mascota);
        //esto devuelve el nacimiento de una mascota que va a tener
        //ciertas caracteristicas
        //return new Mascota(nombre,apodo,tipo);
}
    public void mostrarMascotas(){
        System.out.println("Las mascotas actuales de la lista mascotas son:");
        for (String aux : mascotas) {
            System.out.println(aux);
            
        }
        System.out.println("cantidad ="+ mascotas.size());
    }
    
    
    }
    