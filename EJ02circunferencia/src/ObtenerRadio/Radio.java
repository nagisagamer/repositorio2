/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObtenerRadio;

/**
 *
 * @author Usuario
 */
public class Radio {
    
  
     private float radio;
    
    public Radio (){
    
    }
    
    /**
     * 
     * @param radio 
     */
    public Radio (float radio){
        this.radio = radio;
    }
    
    /**
     * 
     * @param radio 
     */
    public void setRadio (float radio){
        this.radio = radio;
    }
    
    /**
     * 
     * @return radio
     */
    public float getRadio (){
        return radio;
    }

    @Override
    public String toString() {
        return "Circunferencia{" + "radio=" + radio + '}';
    }
}
    

    
  
