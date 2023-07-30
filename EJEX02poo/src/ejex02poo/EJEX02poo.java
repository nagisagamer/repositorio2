/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejex02poo;

import entidad.Puntos;
import service.Servicios;

/**
 En el método distancia(), se utiliza la fórmula para calcular la distancia entre dos puntos .

En la clase Main, se crea un objeto Servicios para poder llamar al método crearPuntos(), se guarda el objeto Puntos que se crea a través
* de este método y se llama al método distancia() 
* de este objeto para calcular la distancia entre los dos puntos ingresados por el usuario.
* Finalmente, se imprime el resultado por pantalla.
 */
public class EJEX02poo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            Servicios servicios = new Servicios();
        Puntos puntos = servicios.crearPuntos();
        double distancia = puntos.distancia();
        System.out.println("La distancia entre los puntos es: " + distancia);
    }
    }
    

