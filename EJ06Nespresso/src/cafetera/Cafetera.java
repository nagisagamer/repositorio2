/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafetera;

public class Cafetera {

    private int capacidadMaxima;
    private int cantidadActual;

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

    public Cafetera() {
        capacidadMaxima = 1000;
        cantidadActual = 0;
    }

    public Cafetera(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
        cantidadActual = capacidadMaxima;
    }

    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = Math.min(capacidadMaxima, cantidadActual);
    }

    public int llenarCafetera() {
        cantidadActual = capacidadMaxima;
        return cantidadActual;
    }

    public void servirTaza(int taza) {
        if (taza > cantidadActual) {
            vaciarCafetera();
        } else {
            cantidadActual -= taza;
        }
    }

    public int vaciarCafetera() {
        cantidadActual = 0;
        return cantidadActual;
    }

    public int agregarCafe(int relleno) {
        cantidadActual += relleno;
        cantidadActual = Math.min(cantidadActual, capacidadMaxima);
        return cantidadActual;
    }
}