/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafetera;

public class Cafetera {

    private int capacidadMaxima;
    private int cantidadActual;
    
    public Cafetera() {
        this.capacidadMaxima = 0;
        this.cantidadActual = 0;
    }
    
    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }
    
    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }
    
    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }
    
    public int getCantidadActual() {
        return cantidadActual;
    }
    
    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
    
    public void llenarCafetera() {
        this.cantidadActual = this.capacidadMaxima;
    }
    
    public void servirTaza(int tamanoTaza) {
        if (this.cantidadActual >= tamanoTaza) {
            System.out.println("Se ha llenado la taza");
            this.cantidadActual -= tamanoTaza;
        } else {
            System.out.println("No se ha llenado la taza");
            System.out.println("La cantidad de café en la cafetera es " + this.cantidadActual);
            this.cantidadActual = 0;
        }
    }
    
    public void vaciarCafetera() {
        this.cantidadActual = 0;
    }
    
    public void agregarCafe(int cantidad) {
        this.cantidadActual += cantidad;
        if (this.cantidadActual > this.capacidadMaxima) {
            this.cantidadActual = this.capacidadMaxima;
        }
    }
}