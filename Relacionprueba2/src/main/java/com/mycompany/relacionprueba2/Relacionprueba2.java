/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.relacionprueba2;

import Equipo.Equipo;
import Jugador.Jugador;

/**
 *
 * @author Usuario
 */
public class Relacionprueba2 {

    public static void main(String[] args) {
 Equipo equipo = new Equipo();
        
        Jugador jugador1 = new Jugador("John", "Doe", "Delantero", 10);
        Jugador jugador2 = new Jugador("Jane", "Smith", "Defensor", 5);
        Jugador jugador3 = new Jugador("Mike", "Johnson", "Mediocampista", 7);
        Jugador jugador4 = new Jugador("samy", "calles", "portera", 23);
        equipo.agregarJugador(jugador1);
        equipo.agregarJugador(jugador2);
        equipo.agregarJugador(jugador3);
        equipo.agregarJugador(jugador4);
        
        equipo.mostrarJugadores();
    }
    }

