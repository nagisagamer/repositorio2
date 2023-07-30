/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exepcionesironman2;

/**
 *
 * @author Usuario
 */
public class Sintetizador extends Dispositivo {
   private static final int CONSUMO_MAXIMO = 100;
    private int consumoEnergia;

    public int usar(int intensidad) {
        if (intensidad > CONSUMO_MAXIMO) {
            consumoEnergia = CONSUMO_MAXIMO;
        } else {
            consumoEnergia = intensidad;
        }
        return consumoEnergia;
    }

    public void hablar(String mensaje) {
        System.out.println("Susurro de JARVIS: " + mensaje);
    }

    public int getConsumoEnergia() {
        return consumoEnergia;
    }

    public void setConsumoEnergia(int consumoEnergia) {
        this.consumoEnergia = consumoEnergia;
    }
    
    
}
