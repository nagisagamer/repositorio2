/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Equipo;

import Jugador.Jugador;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class Equipo {
    
    private List<Jugador> jugadores;
     
    public Equipo() {
        jugadores = new ArrayList<>();
    }
    
     public void agregarJugador(Jugador jugador) {
        jugadores.add(jugador);
    }
    
    public void mostrarJugadores() {
        for (Jugador jugador : jugadores) {
            System.out.println("Nombre: " + jugador.getNombre());
            System.out.println("Apellido: " + jugador.getApellido());
            System.out.println("Posición: " + jugador.getPosicion());
            System.out.println("Número: " + jugador.getNumero());
            System.out.println("------------------------");
        }
    }
    
}
/*La clase Equipo tiene un atributo llamado jugadores, que es una lista de objetos de la clase Jugador. 
En este caso, se utiliza la implementación de List proporcionada por la interfaz ArrayList. 
Esta lista se inicializa en el constructor de la clase Equipo.

El método agregarJugador(Jugador jugador) permite añadir un objeto Jugador a la lista de jugadores del equipo. 
Recibe como parámetro un objeto Jugador y lo agrega a la lista utilizando el método add() de la lista jugadores.

El método mostrarJugadores() recorre la lista de jugadores utilizando un bucle for-each. Por cada jugador en la lista,
imprime la información del jugador utilizando los métodos getter correspondientes. Luego, se imprime una línea separadora
para distinguir la información de cada jugador.

En el método main, se crea un objeto Equipo y se crean varios objetos Jugador. Luego, se utilizan los métodos agregarJugador() 
de la clase Equipo para añadir los jugadores al equipo. Por último, se llama al método mostrarJugadores() de la clase Equipo 
para mostrar la información de cada jugador en el equipo.

Espero que esta explicación aclare cómo funciona la parte de la clase Equipo y cómo se utilizan los métodos para agregar 
jugadores y mostrar la información del equipo. Si tienes alguna otra pregunta, no dudes en preguntar.*/