/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exepcionesironman;

/**
 *
 * @author Usuario
 */
public class AccionesEvasivas extends DestruyendoEnemigos {
    private static final double DISTANCIA_SEGURA = 10; // Distancia mínima de seguridad en kilómetros
    private static final double VELOCIDAD_VUELO = 300; // Velocidad de vuelo en kilómetros por hora
    private static final double NIVEL_BATERIA_MINIMO = 0.1; // Nivel de batería mínimo (10%)

    public AccionesEvasivas() {
    }

    // Método para realizar acciones evasivas
    public void realizarAccionesEvasivas() {
        if (cargaReactorSuficiente()) {
            destruirEnemigosHostiles();
            if (calcularNivelBateria() < NIVEL_BATERIA_MINIMO) {
                alejarseDeEnemigos();
            }
        } else {
            System.out.println("La carga del reactor es insuficiente. No es posible realizar acciones evasivas.");
        }
    }

    // Método para calcular el nivel de batería actual
    private double calcularNivelBateria() {
        return cargaReactor / cargaMaximaReactor;
    }

    // Método para alejarse de los enemigos a una distancia segura
    private void alejarseDeEnemigos() {
        double tiempoVuelo = DISTANCIA_SEGURA / VELOCIDAD_VUELO;
        System.out.println("Batería baja. Alejándose de los enemigos durante " + tiempoVuelo + " horas.");
        // Lógica para alejarse de los enemigos
    }
}
}
