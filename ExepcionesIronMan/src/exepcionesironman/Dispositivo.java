/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exepcionesironman;

/**
 *
 * @author Usuario
 */
public class Dispositivo {
  private boolean danado;

    public Dispositivo() {
        this.danado = false;
    }

    public boolean estaDanado() {
        return danado;
    }

    public void setDanado(boolean danado) {
        this.danado = danado;
    }
}
