/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exepcionesironman2;

/**
 *
 * @author Usuario
 */
public class ObjetoRadar {
private double coordenadaX;
    private double coordenadaY;
    private double coordenadaZ;
    private boolean hostil;
    private int resistencia;

    public ObjetoRadar(double coordenadaX, double coordenadaY, double coordenadaZ, boolean hostil, int resistencia) {
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
        this.coordenadaZ = coordenadaZ;
        this.hostil = hostil;
        this.resistencia = resistencia;
    }
    

    public double getCoordenadaX() {
        return coordenadaX;
    }

    public void setCoordenadaX(double coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    public double getCoordenadaY() {
        return coordenadaY;
    }

    public void setCoordenadaY(double coordenadaY) {
        this.coordenadaY = coordenadaY;
    }

    public double getCoordenadaZ() {
        return coordenadaZ;
    }

    public void setCoordenadaZ(double coordenadaZ) {
        this.coordenadaZ = coordenadaZ;
    }

    public boolean esHostil() {
        return hostil;
    }

    public void setHostil(boolean hostil) {
        this.hostil = hostil;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }
}
