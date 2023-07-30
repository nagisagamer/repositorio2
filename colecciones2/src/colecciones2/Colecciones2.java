/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Colecciones2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> perros = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Ingresa una raza de perro:");
            String raza = sc.nextLine();
            perros.add(raza);

            System.out.println("¿Quieres ingresar otra raza de perro? (S/N)");
            String opcion = sc.nextLine().toUpperCase();
            if (opcion.equals("N")) {
                continuar = false;
            }
        }

        System.out.println("Perros guardados:");
        for (String perro : perros) {
            System.out.println(perro);
        }

        System.out.println("Ingresa la raza del perro a eliminar:");
        String perroEliminar = sc.nextLine();

        Iterator<String> iter = perros.iterator();
        while (iter.hasNext()) {
            String perro = iter.next();
            if (perro.equals(perroEliminar)) {
                iter.remove();
            }
        }

        Collections.sort(perros);

        System.out.println("Perros ordenados:");
        for (String perro : perros) {
            System.out.println(perro);
        }
    

    }
    
}
