/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej06poo;

import java.util.Scanner;
import nespresso.Cafetera;
import service.CafeteraService;

/**
 *
 * @author Usuario
 */
public class EJ06poo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

    Scanner sc = new Scanner(System.in);
    
    CafeteraService c3 = new CafeteraService();
    Cafetera c4 = c3.crearcafetera();
    
   int opcion;

        do {

            System.out.println("---------------------");
            System.out.println("CAFETERIA");
            System.out.println("1 - Llenar cafetera");
            System.out.println("2 - Servir cafe");
            System.out.println("3 - Agregar cafe");
            System.out.println("4 - Vaciar cafetera");
            System.out.println("5 - SALIR");
            System.out.println("---------------------");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    c3.llenar(c4);
                    break;
                case 2:
                    c3.servirTaza(c4);
                    break;
                case 3:
                    c3.agregarCafe(c4);
                    break;
                case 4:
                    c3.vaciarCafetera(c4);
                    break;
                case 5:
                    System.out.println("Saliendo . . . .");
                    break;
                default:
                    System.out.println("Error al elegir una opcion. Intente nuevamente.");
                    break;
            }
        } while (opcion != 5);
        
   
    
}
    }
