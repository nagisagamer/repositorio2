/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

import java.util.Scanner;

public class holamundo {
    public static void main(String[] args) {
    ///La variable Scanner se utiliza para leer datos del usuario
       Scanner leer = new Scanner(System.in);
    ///se crea una variable cadena (String) que se utiliza para leer datos del usurio
       String nombre;
        System.out.println("ingresa tu nombre");
        nombre = leer.next();
        System.out.println("hola mundo! soy " + nombre + " y estoy programando en java :D amo a mi novia" );
    }
}
