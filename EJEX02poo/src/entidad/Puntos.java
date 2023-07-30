/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
se definen los atributos x1, y1, x2 y y2 como privados, y se acceden a ellos a 
* través de los métodos getters. Además, se define un constructor que permite crear 
* un objeto Puntos con valores iniciales para los atributos.
 */
public class Puntos {
    
    private double x1;
    private double y1;
    private double x2;
    private double y2;

    public Puntos(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double distancia() {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public double getX1() {
        return x1;
    }

    public double getY1() {
        return y1;
    }

    public double getX2() {
        return x2;
    }

    public double getY2() {
        return y2;
    }
}
    

