/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import ObtenerRadio.Radio;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ServiceRadio {
  //  public Radio crearCircunferencia(){
    
   private static final Scanner INPUT = new Scanner(System.in).useDelimiter("\n");
    
    public Radio crearCircunferencia (){
        System.out.println("Por favor ingrese el radio de la circunferencia");
        return new Radio(INPUT.nextFloat());
    }
    
    public float area(Radio circulo){
        return (float) (Math.pow(circulo.getRadio(), 2) * Math.PI);
    }
    
    public float perimetro(Radio circulo){
        return (float) (2 * Math.PI * circulo.getRadio());
    }
    
    public void imprimirCircunferenciaData(Radio circulo){
        System.out.println(circulo.toString());
    }
     }