/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej11poo;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EJ11poo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        // Pedimos al usuario que ingrese la fecha
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el día: ");
        int dia = scanner.nextInt();
        System.out.print("Ingrese el mes: ");
        int mes = scanner.nextInt() - 1; // Restamos 1 porque los meses en Java empiezan en 0
        System.out.print("Ingrese el año: ");
        int anio = scanner.nextInt();
        scanner.close();
        
        // Creamos la fecha ingresada por el usuario
        Date fecha = new Date(anio, mes, dia);
        
        // Creamos la fecha actual
        Date fechaActual = new Date();
        
        // Calculamos la diferencia en años entre las dos fechas
        long diferencia = (fechaActual.getTime() - fecha.getTime()) / 1000 / 60 / 60 / 24 / 365;
        
        // Mostramos las fechas y la diferencia en años por pantalla
        System.out.println("Fecha ingresada por el usuario: " + fecha);
        System.out.println("Fecha actual: " + fechaActual);
        System.out.println("Diferencia en años: " + diferencia);
    }
    }
    
/*El programa pide al usuario que ingrese el día, mes y año de la fecha, y luego crea un objeto Date 
con esa fecha. Luego, crea otro objeto Date con la fecha actual utilizando el constructor sin argumentos.

Después, se calcula la diferencia en años entre las dos fechas utilizando el método getTime() que devuelve 
el tiempo en milisegundos desde el 1 de enero de 1970, y se divide por la cantidad de milisegundos que hay en un año.

Por último, se muestran las fechas y la diferencia en años por pantalla.

Espero que esto te sea de ayuda. Si tienes alguna duda o necesitas alguna aclaración, no dudes en preguntarme.*/
