/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciaejeextra2;

/**
 *
 * @author Usuario
 */
public abstract class Edificio {
    protected double ancho;
    protected double largo;
    protected double alto;

    public Edificio(double ancho, double largo, double alto) {
        this.ancho = ancho;
        this.largo = largo;
        this.alto = alto;
    }

    public abstract double calcularSuperficie();
    
    public abstract double calcularVolumen();
}