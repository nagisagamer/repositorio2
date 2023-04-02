/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1guia;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ejercicio1_variables_guia7 {
    public static void main (String[] args){
        Scanner leer = new Scanner(System.in);
       String email;
       System.out.println("ingresa tu email");
       email = leer.next();
       String name;
       System.out.println("ingresa tu nombre");
       name = leer.next();
       String id;
       System.out.println("ingresa tu id");
       id = leer.next();
       String telefono;
       System.out.println("ingresa tu telefono");
       telefono = leer.next();
       String direccion;
       System.out.println("ingresa tu dirección");
       direccion = leer.next();
       String respuesta;
       System.out.println(" el email que ingresaste es: " + email + " el nombre que ingresaste es: " + name + " la ID que ingresaste es: " + id + " el telefono que ingresaste es: " + telefono + " la direccion ingresada es: " + direccion + " gracias ");
       leer.close();
    }
    
}
