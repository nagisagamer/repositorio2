/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entidad.Cancion;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class CancionServic {
 public Cancion crearCancion() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el título de la canción:");
        String titulo = scanner.nextLine();
        System.out.println("Ingrese el autor de la canción:");
        String autor = scanner.nextLine();
        return new Cancion(titulo, autor);
    
}
 }
/*En la clase CancionServic se puede agregar el método crearCancion() que solicita al 
usuario ingresar el título y autor de la canción a través 
del objeto Scanner, crea un objeto Cancion con los datos ingresados y lo devuelve.*/
