/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej06Nespresso;

import cafetera.Cafetera;

public class Nespresso extends Cafetera {
    private double cafePorCapsula;

    // Constructor que recibe la capacidad máxima y la cantidad de café por cápsula
    public Nespresso(int capacidadMaxima, double cafePorCapsula) {
        super(capacidadMaxima, capacidadMaxima); // Llamada al constructor de la superclase
        this.cafePorCapsula = cafePorCapsula;
    }

    // Getter y setter de cafePorCapsula
    public double getCafePorCapsula() {
        return cafePorCapsula;
    }

    public void setCafePorCapsula(double cafePorCapsula) {
        this.cafePorCapsula = cafePorCapsula;
    }

    // Método para servir una cápsula
    public void servirCapsula() {
    if (getCantidadActual() < cafePorCapsula) {
        System.out.println("No hay suficiente café para servir la cápsula");
    } else {
        setCantidadActual((int) (getCantidadActual() - cafePorCapsula));
        System.out.println("Cápsula servida, queda " + getCantidadActual() + " de café");
    }
}}