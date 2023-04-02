/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Usuario
 */
public class ClienteBanco {
   private String nombre;
   private int id;
   private double saldo; 
  
   public ClienteBanco(){
       
   }
   public ClienteBanco(String nombre, int id, double saldo){
       this.nombre = nombre;
       this.id = id;
       if (saldo> 10){
        this.saldo = saldo;
        System.out.println("bienvenido");}
           else {
           System.out.println("minimo 10");        
                   
                   }
       }
       
       }
     public double getSaldo()
     this.saldo;
     public void setSaldo(double saldo);


     
}
  
    
