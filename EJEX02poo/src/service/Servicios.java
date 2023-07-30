/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entidad.Puntos;
import java.util.Scanner;

/**
 En la clase Servicios, se define el método crearPuntos() 
 * que solicita al usuario los valores de los atributos de la clase 
 * Puntos y los utiliza para crear un objeto de esa clase.
 */
public class Servicios {
    public Puntos crearPuntos() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese x1: ");
        double x1 = scanner.nextDouble();
        System.out.println("Ingrese y1: ");
        double y1 = scanner.nextDouble();
        System.out.println("Ingrese x2: ");
        double x2 = scanner.nextDouble();
        System.out.println("Ingrese y2: ");
        double y2 = scanner.nextDouble();
        return new Puntos(x1, y1, x2, y2);
    }
}
    

