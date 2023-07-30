/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejex1poo;

import entidad.Cancion;
import service.CancionServic;

/**
 *
 * @author Usuario
 */
public class EJEX1poo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
 
        
        CancionServic cancionServic = new CancionServic();
        Cancion cancion = cancionServic.crearCancion();
        
        System.out.println("Canción creada: " + cancion.getTitulo() + " - " + cancion.getAutor());
        
    }
    
}
/*Este código solicita al usuario ingresar el título y autor de la canción, crea el objeto Cancion correspondiente 
utilizando el método crearCancion() de la clase CancionServic y luego muestra el título y autor de la canción creada 
utilizando los métodos 
getTitulo() y getAutor() de la clase Cancion.*/