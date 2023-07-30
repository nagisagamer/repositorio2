/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exepcionesironman2;

/**
 *
 * @author Usuario
 */

    public class Repulsor extends Dispositivo {
    private int consumoEnergia;
    private int limiteEnergia = 100;

    public int usar(int intensidad, int tiempo) {
        consumoEnergia = intensidad * tiempo;
        if (consumoEnergia > limiteEnergia) {
            consumoEnergia = limiteEnergia;
        }
        return consumoEnergia;
    }

    public int getConsumoEnergia() {
        return consumoEnergia;
    }

    public void setConsumoEnergia(int consumoEnergia) {
        this.consumoEnergia = consumoEnergia;
    }
}
    
