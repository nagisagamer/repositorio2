/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Vendedor;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class VendedorServicio {

    public Vendedor sltaVendedor() {

        //instancian un objeto de tipo vendedor
        Vendedor v1 = new Vendedor();
//lleno los atributos para esto necesitariamos el scanner
        Scanner leer = new Scanner(System.in);

        System.out.println("ingrese el nombre del vendedor");
        v1.setNombre(leer.next());

        System.out.println("ingrese el DNI del vendedor");
        v1.setDni(leer.nextInt());

        System.out.println("ingrese el sueldo básico del vendedor");
        v1.setSueldoBasico(leer.nextDouble());

        System.out.println("ingrese el dia que comenzo a trabajar");
        int dia = leer.nextInt();
        System.out.println("ingrese el mes que comenzo a trabajar");
        int mes = leer.nextInt();
        System.out.println("ingrese el año que comenzo a trabajar");
        int anio = leer.nextInt();
        Date fecha = new Date(anio - 1900, mes - 1, dia);
        v1.setFechaInicio(fecha);
        return v1;

    }

    //calcular comisiones
   public void SueldoMensual(Vendedor v1) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese cuales fueron las ventas totales del vendedor");
        Double ventas = leer.nextDouble();
        v1.setComisiones(ventas * 0.15);
        v1.setSueldomensual(v1.getSueldoBasico() + v1.getComisiones());
        System.out.println("El sueldo mensual del vendedor:"
                + v1.getNombre() + "es de $" + v1.getSueldomensual());

    }

    //vacaciones calculo
    public void vacaciones(Vendedor v1) {
        Date hoy = new Date();
        int antiguedad = hoy.getYear() - v1.getFechaInicio().getYear();

        if (antiguedad < 5){
             System.out.println("Le corresponden 14 dias de vacaciones");
        }
        else if (antiguedad < 10){
             System.out.println("Le corresponden 21 dias de vacaciones");
        }
        else if (antiguedad > 20){
             System.out.println("Le corresponden 35 dias de vacaciones");
        }else {
            System.out.println("El empleado tiene vacaciones proporcionales");
        }
    }
}
