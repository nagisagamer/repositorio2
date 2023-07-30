/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Usuario
 */
public class Mascota {
    
    private String nombre;
    private String apodo;
    private String tipo;
    private String color;
    private int edad;
    private boolean cola;
    private String raza;
    //conejo gato perro loro
    private int energia;
    
    //constructor
    public Mascota(){
        this.energia = 1000;
        
    }
    public Mascota(String nombre, String apodo, String tipo){
        this.nombre = nombre;
        this.apodo = apodo;
        //aca se esta aplicando la logica del tipo de animal que puede ir en la app
        if (tipo.equals("perro") || tipo.equals("gato") || tipo.equals("loro") || tipo.equals("conejo") || tipo.equals("carpincho") )
        this.tipo = tipo;
     this.energia = 1000;   
    }
     
    public Mascota(String nombre, String apodo, String tipo, String color, int edad, boolean cola, String raza) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.tipo = tipo;
        this.color = color;
        this.edad = edad;
        this.cola = cola;
        this.raza = raza;
        this.energia = 1000;
    }
    
    //setter
    public void setNombre(String nombre){
        //logica al nombre para obtener la longitud de caracteres del nombre ingresado
        //si el nombre viene vacio no lo procesa pero si agregan un nombre lo setea y procesa
        //los setters pueden tener logica dentro
        if(nombre.length() > 0){
            
        }
        //this.nombre = nombre;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCola(boolean cola) {
        this.cola = cola;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    //para crear un getter se coloca:
    //modificador(public) + tipo de dato + getatributo en este caso nombre
    public String getNombre(){
        //en este caso se tiene que colocar return para que lo envie al main principal
        return nombre;
        
    }

    public String getApodo() {
        return apodo;
    }

    public String getTipo() {
        return tipo;
    }

    public String getColor() {
        return color;
    }

    public int getEdad() {
        return edad;
    }

    public boolean isCola() {
        return cola;
    }

    public String getRaza() {
        return raza;
    }
    
   /**
    * funcion destinada a pasear
    * @param energiaRestar
    * @return 
    */ 
    public int pasear(int energiaRestar){
        //esto resta energia cada vez que lo pasea
        
        energia = energia - energiaRestar;
        //otro metodo de restar energia
        //energia -= energiaRestar;
        return energia;
        
    }  
    /**
     * funcion para pasear por vueltas
     * @param energiaRestar
     * @param vueltas
     * @return energia
     */
    public int pasear(int energiaRestar, int vueltas){
        //a cada vuelta resta energia se une energia con vueltas
        for (int i = 0; i < vueltas; i++) {
            energia -= energiaRestar;
            
        }
        return energia;
    }
//crea una funcion que devuelve un mensaje formateado y armado segun cada mascota
    //haciendo referencia a cada atributo

    @Override
    public String toString() {
        return "Mascota{" + "nombre=" + nombre + ", apodo=" + apodo + ", tipo=" + tipo + ", color=" + color + ", edad=" + edad + ", cola=" + cola + ", raza=" + raza + ", energia=" + energia + '}';
    }
    
}
