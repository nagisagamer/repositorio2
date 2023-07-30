/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.herenciaeje2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class HerenciaEJE2 {

    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in).useDelimiter("\n");

        Lavadora lav = new Lavadora();
        Televisor tele = new Televisor();
        

        String op;
     
        do {
            System.out.println("-----MENU-------");
        System.out.println("Ingrese si quiere comprar un televisor o una lavadora: ");

        System.out.println("A - Lavadora");
        System.out.println("B - Televisor");
         System.out.println("C - Salir");
             op = leer.next();

            switch (op) {

                case "A":
                    lav.crearLavadora();
                    lav.precioFinal();
                    System.out.println("El precio de su lavadora es: " + lav.getPrecio());
                    break;
                case "B":

                    tele.crearTelevidor();
                    tele.precioFinal();
                    System.out.println("El precio de su televisor es: " + tele.getPrecio());
                    break;
             case "C":
                 System.out.println("chauuuuuu....");
                  break;

                default:
                    System.out.println("Ingrese opociÃ³n vÃ¡lida");
            }
           

        } while (!(op.equalsIgnoreCase("C")));

    }

}
