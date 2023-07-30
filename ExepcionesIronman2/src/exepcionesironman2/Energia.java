/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exepcionesironman2;

/**
 *
 * @author Usuario
 */
public class Energia {
    private int energia;

    public Energia() {
        energia = 100;
    }

    public int getEnergia() {
        return energia;
    }

    public void decrementarEnergia(int cantidad) {
        energia -= cantidad;
        if (energia < 0) {
            energia = 0;
        }
    }
}
