/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herenciaeje4.circulo;

import static com.mycompany.herenciaeje4.circulo.calculosFormas.PI;

/**
 se implementa la clase Circulo que implemente la interfaz calculosFormas. 
 * En la clase Circulo, define una variable radio y proporciona una implementación 
 * para los métodos calcularArea y calcularPerimetro 
 */
public class Circulo implements calculosFormas {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return PI * radio * radio;
    }

    @Override
    public double calcularPerimetro() {
        return PI * 2 * radio;
    }
}

