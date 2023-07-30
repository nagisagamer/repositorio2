/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exepcionesironman2;

/**
 *
 * @author Usuario
 */
public class Radar {
     private static final int LIMITE_OBJETOS = 2;
    private ObjetoRadar[] objetos;
    private int cantidadObjetos;

    public Radar() {
        objetos = new ObjetoRadar[LIMITE_OBJETOS];
        cantidadObjetos = 0;
    }

    public void agregarObjeto(ObjetoRadar objeto) {
        if (cantidadObjetos < LIMITE_OBJETOS) {
            objetos[cantidadObjetos] = objeto;
            cantidadObjetos++;
        } else {
            System.out.println("No se puede agregar más objetos al radar");
        }
    }

    public void informarDistanciaEnemigos() {
        for (int i = 0; i < cantidadObjetos; i++) {
            ObjetoRadar objeto = objetos[i];
            if (objeto.esHostil()) {
                double distancia = Math.sqrt(
                    objeto.getCoordenadaX() * objeto.getCoordenadaX() +
                    objeto.getCoordenadaY() * objeto.getCoordenadaY() +
                    objeto.getCoordenadaZ() * objeto.getCoordenadaZ()
                );
                System.out.println("Enemigo " + (i+1) + " a una distancia de " + distancia + " metros.");
            }
        }
    }
}



