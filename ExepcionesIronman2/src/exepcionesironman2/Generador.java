/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exepcionesironman2;

/**
 *
 * @author Usuario
 */
public class Generador {
    private static final float CARGA_MAXIMA_REACTOR = 100.0f;
    private float cargaReactor;

    public Generador() {
        cargaReactor = CARGA_MAXIMA_REACTOR;
    }

    public void consumirEnergia(int cantidad) throws EnergiaInsuficienteException {
        if (cantidad > cargaReactor) {
            throw new EnergiaInsuficienteException();
        }
        cargaReactor -= cantidad;
    }

    public float obtenerCargaReactor() {
        return cargaReactor;
    }

    public float getCargaReactor() {
        return cargaReactor;
    }

    public void setCargaReactor(float cargaReactor) {
        this.cargaReactor = cargaReactor;
    }
}