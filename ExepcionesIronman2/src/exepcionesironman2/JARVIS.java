/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exepcionesironman2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Usuario
 */
public class JARVIS {
      private Radar radar;
    private List<Dispositivo> dispositivos;

    public JARVIS() {
        this.radar = new Radar();
        this.dispositivos = new ArrayList<>();
    }

    public void agregarObjetosRadar(int cantidadObjetos) {
        Random random = new Random();
        for (int i = 0; i < cantidadObjetos; i++) {
            double coordenadaX = random.nextDouble();
            double coordenadaY = random.nextDouble();
            double coordenadaZ = random.nextDouble();
            boolean esHostil = random.nextBoolean();
            int resistencia = random.nextInt(100);

            ObjetoRadar objeto = new ObjetoRadar(coordenadaX, coordenadaY, coordenadaZ, esHostil, resistencia);
            radar.agregarObjeto(objeto);
        }
    }

    public void revisarDispositivos() {
        for (Dispositivo dispositivo : dispositivos) {
            boolean reparado = false;
            do {
                if (dispositivo.estaDanado()) {
                    dispositivo.repararDanio();
                    reparado = !dispositivo.estaDanado();
                } else {
                    reparado = true;
                }
            } while (!reparado);
        }
    }

    public void agregarDispositivo(Dispositivo dispositivo) {
        dispositivos.add(dispositivo);
    }

    public void eliminarDispositivo(Dispositivo dispositivo) {
        dispositivos.remove(dispositivo);
    }

    // Otros métodos de JARVIS...

    public static void main(String[] args) {
        // Ejemplo de uso del simulador
        JARVIS jarvis = new JARVIS();

        // Agregar objetos al radar
        jarvis.agregarObjetosRadar(10);

        // Agregar dispositivos
        jarvis.agregarDispositivo(new Propulsor());
        jarvis.agregarDispositivo(new Repulsor());
        jarvis.agregarDispositivo(new Consola());
        jarvis.agregarDispositivo(new Sintetizador());

        // Revisar los dispositivos
        jarvis.revisarDispositivos();
    }
}
