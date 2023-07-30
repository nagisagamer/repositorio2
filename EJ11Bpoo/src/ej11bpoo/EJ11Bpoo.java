/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej11bpoo;

import entidad.FechaUtil;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EJ11Bpoo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Crear objeto FechaUtil
        FechaUtil fechaUtil = new FechaUtil();

        // Pedir al usuario que ingrese el día, mes y año de la fecha
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el día: ");
        int dia = scanner.nextInt();
        System.out.print("Ingrese el mes: ");
        int mes = scanner.nextInt();
        System.out.print("Ingrese el año: ");
        int anio = scanner.nextInt();

        // Crear objeto Date con la fecha ingresada por el usuario
        Date fecha1 = new Date(anio - 1900, mes - 1, dia);

        // Crear objeto Date con la fecha actual
        Date fecha2 = new Date();

        // Calcular la diferencia en años entre las dos fechas usando la clase FechaUtil
        int diferenciaEnAnios = fechaUtil.diferenciaEnAnios(fecha1, fecha2);

        // Mostrar las fechas y la diferencia en años
        System.out.println("Fecha ingresada: " + fecha1);
        System.out.println("Fecha actual: " + fecha2);
        System.out.println("Diferencia en años: " + diferenciaEnAnios);
    }
    
}
