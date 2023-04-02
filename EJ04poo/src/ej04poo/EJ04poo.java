/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej04poo;

import Service.RectanguloService;




/**
 *
 * @author Usuario
 */
public class EJ04poo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  // Creamos un objeto RectanguloService
        RectanguloService rectangulo = new RectanguloService();
     
        // Llamamos al método crearRectangulo para obtener los datos del usuario
        rectangulo.crearRectangulo();

        // Llamamos al método dibujarRectangulo para dibujar el rectángulo
        rectangulo.dibujarRectangulo();

        // Llamamos al método calcularSuperficie para obtener la superficie del rectángulo
        System.out.println("Superficie del rectangulo: " + rectangulo.calcularSuperficie());

        // Llamamos al método calcularPerimetro para obtener el perímetro del rectángulo
        System.out.println("Perimetro del rectangulo: " + rectangulo.calcularPerimetro());
    }
}
       
/*en la clase Rectangulo se definen los atributos y métodos necesarios 
para representar y manipular un rectángulo, pero no se crean los parámetros del ejercicio como tal.

En la clase RectanguloService se crea un objeto de la clase Rectangulo y se 
definen los métodos que interactúan con dicho objeto.

Y en el main, se crea un objeto de la clase RectanguloService y se utilizan sus 
métodos para interactuar con el objeto Rectangulo creado en la clase RectanguloService.*/
