/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exepcionesironman2;

import java.util.Random;

/**
 *
 * @author Usuario
 */
public class Dispositivo {
 public static final int INTENSIDAD_BASICA = 1;
    public static final int INTENSIDAD_NORMAL = 2;
    public static final int INTENSIDAD_INTENSIVA = 3;

    private boolean danado;

    public boolean estaDanado() {
        return danado;
    }

    public void sufrirDanio() {
        Random random = new Random();
        danado = random.nextDouble() < 0.3;
    }

    public void repararDanio() {
        Random random = new Random();
        danado = random.nextDouble() >= 0.4;
    }
}

