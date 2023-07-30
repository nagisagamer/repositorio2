/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herenciaeje4.circulo;

/**
 implementa la clase Rectangulo que también implemente la interfaz calculosFormas. 
 * En la clase Rectangulo, define variables base y altura y proporciona una implementación 
 * para los métodos calcularArea y calcularPerimetro
 */
public class Rectangulo implements calculosFormas {
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (base + altura);
    }
     }
