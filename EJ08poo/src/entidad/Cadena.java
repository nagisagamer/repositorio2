/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 *
 * @author Usuario
 */
public class Cadena {
   
    private String frase;
    private int longitud;
   
  
    //constructor vacio

    public Cadena() {
    }
    
    //constructor con parametros

    public Cadena(String frase) {
        this.frase = frase;
         this.longitud = frase.length();
    }
     public Cadena(int longitud) {
        this.longitud = longitud;
    }
    //getters y setters 


    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    @Override
    public String toString() {
        return "Cadena{" + "frase=" + frase + ", longitud=" + longitud + '}';
    }
    
    
  
    
}
