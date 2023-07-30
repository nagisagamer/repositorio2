/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.herenciaeje4;

import com.mycompany.herenciaeje4.circulo.Circulo;
import com.mycompany.herenciaeje4.circulo.Rectangulo;

/**
en el main, crea objetos de las clases Circulo y Rectangulo, 
* y utiliza los métodos calcularArea y calcularPerimetro para obtener los resultados. 
* Este código creará un objeto Circulo con radio 5.0 y un objeto Rectangulo con base 
* 4.0 y altura 6.0. Luego, calculará y mostrará el área y el perímetro de cada forma 
* geométrica utilizando los métodos implement
 */
public class HerenciaEJE4 {

    public static void main(String[] args) {
        Circulo circulo = new Circulo(5);
        double areaCirculo = circulo.calcularArea();
        double perimetroCirculo = circulo.calcularPerimetro();

        System.out.println("Área del círculo: " + areaCirculo);
        System.out.println("Perímetro del círculo: " + perimetroCirculo);

        Rectangulo rectangulo = new Rectangulo(4, 6);
        double areaRectangulo = rectangulo.calcularArea();
        double perimetroRectangulo = rectangulo.calcularPerimetro();

        System.out.println("Área del rectángulo: " + areaRectangulo);
        System.out.println("Perímetro del rectángulo: " + perimetroRectangulo);
    }
}