/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Rectangulo.Rectangulo;

/**
 *
 * @author Usuario
 */
public class RectanguloService {
   
  
    // Definición de la variable Rectangulo que será utilizada en los métodos
    private Rectangulo rectangulo;

    // Getter para obtener el Rectangulo creado
    public Rectangulo getRectangulo() {
        return rectangulo;
    }

    // Método para crear un nuevo Rectangulo utilizando el método crearRectangulo() de la clase Rectangulo
    public void crearRectangulo() {
        rectangulo = new Rectangulo(); // Se crea un nuevo objeto Rectangulo
        rectangulo.crearRectangulo(); // Se llama al método crearRectangulo() de la clase Rectangulo para ingresar los valores de base y altura
    }

    // Método para dibujar el Rectangulo creado utilizando el método dibujarRectangulo() de la clase Rectangulo
    public void dibujarRectangulo() {
        rectangulo.dibujarRectangulo(); // Se llama al método dibujarRectangulo() de la clase Rectangulo para imprimir el Rectangulo
    }

    // Método para calcular la superficie del Rectangulo creado utilizando el método calcularSuperficie() de la clase Rectangulo
    public double calcularSuperficie() {
        return rectangulo.calcularSuperficie(); // Se llama al método calcularSuperficie() de la clase Rectangulo para obtener la superficie del Rectangulo
    }

    // Método para calcular el perímetro del Rectangulo creado utilizando el método calcularPerimetro() de la clase Rectangulo
    public double calcularPerimetro() {
        return rectangulo.calcularPerimetro(); // Se llama al método calcularPerimetro() de la clase Rectangulo para obtener el perímetro del Rectangulo
    }
}
   


