/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import Entidad.Raices;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Servicios {
    
     public static Raices crearRaices() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el valor de a: ");
        double a = sc.nextDouble();
        System.out.print("Ingrese el valor de b: ");
        double b = sc.nextDouble();
        System.out.print("Ingrese el valor de c: ");
        double c = sc.nextDouble();
        return new Raices(a, b, c);
    }
    
    
}
