/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej01libro;

import Entidad.Libro;
import Service.LibroService;

/**
 *
 * @author Usuario
 */
public class EJ01libro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    //LibroService crearlibro = new LibroService();
    //LibroService crearlibro = new LibroService();
     //Libro l1 = crearlibro.crearlibro();
    LibroService crearlibro = new LibroService();
        Libro l1 = crearlibro.crearlibro();
        
        System.out.println(l1.toString());
     
    
    
    
    }
    
}
