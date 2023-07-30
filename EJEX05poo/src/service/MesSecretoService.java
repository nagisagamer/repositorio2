/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entidad.MesSecreto;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class MesSecretoService {
     public void jugar() {
        MesSecreto mesSecreto = new MesSecreto();
        Scanner sc = new Scanner(System.in);
        boolean adivinado = false;

        do {
            System.out.print("Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: ");
            String mes = sc.nextLine();
            adivinado = mesSecreto.adivinarMes(mes);
        } while (!adivinado);

        sc.close();
    }
    
}
