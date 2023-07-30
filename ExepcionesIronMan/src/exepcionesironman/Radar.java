/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exepcionesironman;

import java.util.List;

/**
 *
 * @author Usuario
 */
public class Radar extends ArmaduraIronManRevisada {
    private List<ObjetoEnemigo> enemigos;
    
    public Radar(String colorPrimario, String colorSecundario, int resistencia) {
        super(colorPrimario, colorSecundario, resistencia);
    }
    
    // Método para agregar un enemigo al radar
    public void agregarEnemigo(ObjetoEnemigo enemigo) {
        enemigos.add(enemigo);
    }

    // Método para calcular la distancia a la que se encuentra cada enemigo
    public void calcularDistanciasEnemigos() {
        System.out.println("Calculando distancias a los enemigos...");
        for (ObjetoEnemigo enemigo : enemigos) {
            double distancia = Math.sqrt(Math.pow(enemigo.getCoordenadaX(), 2) +
                    Math.pow(enemigo.getCoordenadaY(), 2) +
                    Math.pow(enemigo.getCoordenadaZ(), 2));
            System.out.println("Enemigo: " + enemigo.getNombre());
            System.out.println("Distancia: " + distancia + " unidades.");
        }
    }
  
    
}
