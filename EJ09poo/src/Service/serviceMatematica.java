/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import entidad.Matematica;

/**
 *
 * @author Usuario
 */
public class serviceMatematica {
    

    
    private Matematica matematica;

    public serviceMatematica() {
        this.matematica = new Matematica();
    }

    public serviceMatematica(double numero1, double numero2) {
        this.matematica = new Matematica(numero1, numero2);
    }

    public double devolverMayor() {
        double num1 = this.matematica.getNumero1();
        double num2 = this.matematica.getNumero2();
        return Math.max(num1, num2);
    }

    public double calcularPotencia() {
        double mayor = devolverMayor();
        double menor = Math.min(this.matematica.getNumero1(), this.matematica.getNumero2());
        mayor = Math.round(mayor);
        menor = Math.round(menor);
        return Math.pow(mayor, menor);
    }

    public double calcularRaiz() {
        double menor = Math.min(this.matematica.getNumero1(), this.matematica.getNumero2());
        menor = Math.abs(menor);
        return Math.sqrt(menor);
    }
} 
