/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Usuario
 */
public class Raices {
    
    // Atributos
    private double a;
    private double b;
    private double c;
    
    // Constructor
    public Raices(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public double getDiscriminante() {
        return (b * b) - (4 * a * c);
    }
    
    public boolean tieneRaices() {
        return getDiscriminante() >= 0;
    }
    
    public boolean tieneRaiz() {
        return getDiscriminante() == 0;
    }
    
    public void obtenerRaices() {
        if (tieneRaices()) {
            double x1 = (-b + Math.sqrt(getDiscriminante())) / (2 * a);
            double x2 = (-b - Math.sqrt(getDiscriminante())) / (2 * a);
            System.out.println("Las raíces son: " + x1 + " y " + x2);
        } else {
            System.out.println("No existen raíces reales");
        }
    }
    
    public void obtenerRaiz() {
        if (tieneRaiz()) {
            double x = -b / (2 * a);
            System.out.println("La raíz es: " + x);
        } else {
            System.out.println("No existe una única raíz real");
        }
    }
    
    public void calcular() {
        if (tieneRaices()) {
            obtenerRaices();
        } else if (tieneRaiz()) {
            obtenerRaiz();
        } else {
            System.out.println("No existen raíces reales");
        }
    }
}
