/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entidad.Ahorcado;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class AhorcadoService {
    
    private Scanner scanner = new Scanner(System.in);

    public Ahorcado crearJuego() {
        System.out.println("Ingrese la palabra a adivinar: ");
        String palabra = scanner.nextLine().toLowerCase();
        System.out.println("Ingrese la cantidad máxima de jugadas: ");
        int cantidadMaximaJugadas = scanner.nextInt();
        scanner.nextLine(); // Consumimos el salto de línea que quedó en el buffer

        Ahorcado ahorcado = new Ahorcado(palabra, cantidadMaximaJugadas);
        return ahorcado;
    }

    public void longitud(Ahorcado ahorcado) {
        System.out.println("La longitud de la palabra a adivinar es: " + ahorcado.getPalabra().length);
    }

    public boolean buscar(Ahorcado ahorcado, char letra) {
        boolean encontrada = false;

        for (int i = 0; i < ahorcado.getPalabra().length; i++) {
            if (ahorcado.getPalabra()[i] == letra) {
                ahorcado.setCantidadEncontradas(ahorcado.getCantidadEncontradas() + 1);
                encontrada = true;
            }
        }

        ahorcado.setCantidadJugadas(ahorcado.getCantidadJugadas() + 1);
        return encontrada;
    }

    public void encontradas(Ahorcado ahorcado, char letra) {
        int cantidadEncontradas = ahorcado.getCantidadEncontradas();
        int cantidadFaltantes = ahorcado.getPalabra().length - cantidadEncontradas;
        System.out.println("Número de letras (encontradas, faltantes): (" + cantidadEncontradas + "," + cantidadFaltantes + ")");
    }

    public void intentos(Ahorcado ahorcado) {
    int cantidadRestante = ahorcado.getCantidadMaximaJugadas() - ahorcado.getCantidadJugadas();
    System.out.println("Número de intentos restantes: " + cantidadRestante);
}
    }
