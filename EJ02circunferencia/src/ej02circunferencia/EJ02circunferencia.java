/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej02circunferencia;

import ObtenerRadio.Radio;
import Service.ServiceRadio;

/**
 *
 * @author Usuario
 */
public class EJ02circunferencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //public static void main(String[] args) {
        // TODO code application logic here
        ServiceRadio circuloServicio = new ServiceRadio();
        Radio circulo = circuloServicio.crearCircunferencia();
        System.out.println("Área = " + circuloServicio.area(circulo));
        System.out.println("Perímetro = " + circuloServicio.perimetro(circulo));
        circuloServicio.imprimirCircunferenciaData(circulo);
        
    }
    
}
