/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rectangulo;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
//public class Recta {
    
public class Rectangulo {
    private double base;
    private double altura;
//constructor vacio
    public Rectangulo() {}
//constructor con parametros
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
/*Se define un método crearRectangulo que utiliza la clase Scanner para 
obtener la base y la altura del usuario y luego asignarlos a los atributos de la clase.*/
   public void crearRectangulo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la base del rectangulo: ");
        this.base = scanner.nextDouble();
        System.out.print("Ingrese la altura del rectangulo: ");
        this.altura = scanner.nextDouble();
        scanner.close();
    }
//Se define un método calcularSuperficie que retorna la superficie del rectángulo multiplicando la base por la altura.
    public double calcularSuperficie() {
        return this.base * this.altura;
    }
//Se define un método calcularPerimetro que retorna el perímetro del rectángulo sumando la base y la altura y multiplicando por 2.
    public double calcularPerimetro() {
        return (this.base + this.altura) * 2;
    }
//Se define un método dibujarRectangulo que utiliza dos bucles for para imprimir asteriscos y crear un rectángulo en la pantalla.
    public void dibujarRectangulo() {
        for (int i = 0; i < this.altura; i++) {
            for (int j = 0; j < this.base; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
/*Se definen los métodos get y set para los atributos base y altura, 
    respectivamente. Estos métodos permiten obtener y cambiar los valores de los atributos 
    de la clase desde fuera de ella. */
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
    
    
 
    
