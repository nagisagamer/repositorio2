/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herenciaeje2;

public class Lavadora extends Electrodomesticos {
    protected int carga;

    public Lavadora() {
    }

    public Lavadora(double precio, String color, char consumoEnergetico, int peso, int carga) {
        super(precio, color, consumoEnergetico, peso);
        this.carga=carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
    
   public void crearLavadora (){
        crearElectrodomestico();
        System.out.println("Ingrese la carga preferida para su lavadora");
        this.carga = leer.nextInt();
    }
   
  
    @Override
   public void precioFinal() {
       super.precioFinal();
       if (this.carga >30) {
           this.precio +=500;
           
       }
      
   }
}
