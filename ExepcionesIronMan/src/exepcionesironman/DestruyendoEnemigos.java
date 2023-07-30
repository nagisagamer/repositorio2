/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exepcionesironman;

/**
 *
 * @author Usuario
 */
public class DestruyendoEnemigos extends Simulador {

   private static final int ALCANCE_GUANTES = 5000;

    public DestruyendoEnemigos() {
    }

    // Método para destruir enemigos hostiles
    public void destruirEnemigosHostiles() {
        if (dispositivoSano() && cargaReactorSuficiente()) {
            for (ObjetoEnemigo enemigo : radar) {
                if (enemigo.isHostil() && calcularDistancia(enemigo) <= ALCANCE_GUANTES) {
                    while (enemigo.getResistencia() > 0) {
                        int potenciaDisparo = calcularPotenciaDisparo(enemigo);
                        enemigo.recibirDisparo(potenciaDisparo);
                    }
                    System.out.println("Enemigo destruido: " + enemigo.getNombre());
                }
            }
        } else {
            System.out.println("No es posible disparar. Verifica el estado de los dispositivos y la carga del reactor.");
        }
    }

    // Método para calcular la distancia entre la armadura y un objeto enemigo
    private double calcularDistancia(ObjetoEnemigo enemigo) {
        double distanciaX = enemigo.getCoordenadaX();
        double distanciaY = enemigo.getCoordenadaY();
        double distanciaZ = enemigo.getCoordenadaZ();

        return Math.sqrt(distanciaX * distanciaX + distanciaY * distanciaY + distanciaZ * distanciaZ);
    }

    // Método para calcular la potencia de disparo según la distancia al enemigo
    private int calcularPotenciaDisparo(ObjetoEnemigo enemigo) {
        double distancia = calcularDistancia(enemigo);
        double potenciaMaxima = 100; // Potencia máxima de disparo

        // Potencia inversamente proporcional a la distancia
        double potencia = potenciaMaxima * (1 - (distancia / ALCANCE_GUANTES));

        return (int) potencia; // Convertir a entero
    }

    // Método para verificar si el dispositivo está sano
    private boolean dispositivoSano() {
        return guanteDerecho.isSano() && guanteIzquierdo.isSano();
    }

    // Método para verificar si la carga del reactor es suficiente
    private boolean cargaReactorSuficiente() {
        return cargaReactor >= getConsumoGuantes() * 2; // Consumo de ambos guantes
    }

 

    
    
}
