/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria.servicios;

import libreria.Persistencia.ControladoraPersistencia;
import libreria.entidades.Autor;
import libreria.entidades.Editorial;
import libreria.entidades.Libro;

/**
 *
 * @author Usuario
 */
public class Controladora {
    
     ControladoraPersistencia controlPersist = new ControladoraPersistencia ();
     
     public void crearAutor (Autor aut) {
         controlPersist.crearAutor (aut);
     }
     
     
     public void crearLibro (Libro lib){
     controlPersist.crearLibro (lib);   
     }
     
     public void crearEditorial (Editorial editorial) {
     controlPersist.crearEditorial (editorial);    
     }
     
     
     
}
