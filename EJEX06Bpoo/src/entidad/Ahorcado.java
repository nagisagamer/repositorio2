/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 *
 * @author Usuario
 */
public class Ahorcado {

    private char[] palabra;
    private int cantidadMaximaJugadas;
    private int cantidadJugadas;
    private int cantidadEncontradas;

    public Ahorcado(String palabra, int cantidadMaximaJugadas) {
        this.palabra = palabra.toCharArray();
        this.cantidadMaximaJugadas = cantidadMaximaJugadas;
        this.cantidadJugadas = 0;
        this.cantidadEncontradas = 0;
    }

    public char[] getPalabra() {
        return this.palabra;
    }

    public int getCantidadMaximaJugadas() {
        return cantidadMaximaJugadas;
    }

    public int getCantidadJugadas() {
        return cantidadJugadas;
    }

    public void setCantidadJugadas(int cantidadJugadas) {
        this.cantidadJugadas = cantidadJugadas;
    }

    public int getCantidadEncontradas() {
        return cantidadEncontradas;
    }

    public void setCantidadEncontradas(int cantidadEncontradas) {
        this.cantidadEncontradas = cantidadEncontradas;
    }

    public int intentos() {
        return cantidadMaximaJugadas - cantidadJugadas;
    }

    public boolean juegoTerminado() {
        return intentos() == 0 || cantidadEncontradas == palabra.length;
    }

    public boolean buscar(char letra) {
        boolean encontrada = false;

        for (int i = 0; i < palabra.length; i++) {
            if (palabra[i] == letra) {
                cantidadEncontradas++;
                encontrada = true;
            }
        }

        cantidadJugadas++;
        return encontrada;
    }

    public int encontradas(char letra) {
        int encontradas = 0;
        for (int i = 0; i < palabra.length; i++) {
            if (palabra[i] == letra) {
                encontradas++;
            }
        }
        return encontradas;
    }
}
    

