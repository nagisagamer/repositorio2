/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operacion;

/**
 *
 * @author Usuario
 */
public class Operacion {
    
    public int op;
    private int num1;
    private int num2;
  
    

    //constructorvacio
    public Operacion() {
    }
    
    //constructor con parametros

     public Operacion( int num1, int num2) {
        
        this.num1 = num1;
        this.num2 = num2;
       
        
    }
  
    //getters y setters

    
    


    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

   
     
     
    //override

    @Override
    public String toString() {
        return "Operacion{" + " num1=" + num1 + ", num2=" + num2 + '}';
    }

   
    

   

    
    
}
