/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.relacioneseje3v2;

import cliente.Cliente;
import cuota.Cuota;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import poliza.Poliza;
import vehiculo.Vehiculo;

/**
 *
 * @author Usuario
 */
public class RelacionesEJE3v2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        
        // Solicitar datos del cliente
        System.out.print("Ingrese nombre y apellido del cliente: ");
        String nombreApellido = scanner.nextLine();
        System.out.print("Ingrese número de documento del cliente: ");
        String documento = scanner.nextLine();
        System.out.print("Ingrese mail del cliente: ");
        String mail = scanner.nextLine();
        System.out.print("Ingrese domicilio del cliente: ");
        String domicilio = scanner.nextLine();
        System.out.print("Ingrese teléfono del cliente: ");
        String telefono = scanner.nextLine();
        
        // Crear cliente con los datos ingresados
        Cliente cliente = new Cliente(nombreApellido, documento, mail, domicilio, telefono);
        
        // Solicitar datos del vehículo
        System.out.print("Ingrese marca del vehículo: ");
        String marca = scanner.nextLine();
        System.out.print("Ingrese modelo del vehículo: ");
        String modelo = scanner.nextLine();
        System.out.print("Ingrese año del vehículo: ");
        int anio = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer de entrada
        System.out.print("Ingrese número de motor del vehículo: ");
        String numeroMotor = scanner.nextLine();
        System.out.print("Ingrese número de chasis del vehículo: ");
        String chasis = scanner.nextLine();
        System.out.print("Ingrese color del vehículo: ");
        String color = scanner.nextLine();
        System.out.print("Ingrese tipo de vehículo (camioneta, sedán, etc.): ");
        String tipo = scanner.nextLine();
        
        // Crear vehículo con los datos ingresados
        Vehiculo vehiculo = new Vehiculo(marca, modelo, anio, numeroMotor, chasis, color, tipo);
        
        // Solicitar datos de la póliza
        System.out.print("Ingrese número de póliza: ");
        String numeroPoliza = scanner.nextLine();
        System.out.print("Ingrese fecha de inicio de la póliza (dd/mm/aaaa): ");
        String fechaInicioStr = scanner.nextLine();
        Date fechaInicio = null;
        try {
            fechaInicio = dateFormat.parse(fechaInicioStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.print("Ingrese fecha de fin de la póliza (dd/mm/aaaa): ");
        String fechaFinStr = scanner.nextLine();
        Date fechaFin = null;
        try {
            fechaFin = dateFormat.parse(fechaFinStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.print("Ingrese cantidad de cuotas: ");
        int cantidadCuotas = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer de entrada
        System.out.print("Ingrese forma de pago: ");
        String formaPago = scanner.nextLine();
        System.out.print("Ingrese monto total asegurado: ");
        double montoTotalAsegurado = scanner.nextDouble();
        scanner.nextLine(); // Limpiar el buffer de entrada
        System.out.print("Incluye cobertura de granizo? (true/false): ");
        boolean incluyeGranizo = scanner.nextBoolean();
        scanner.nextLine(); // Limpiar el buffer de entrada
        System.out.print("Ingrese monto máximo para cobertura de granizo: ");
        double montoMaximoGranizo = scanner.nextDouble();
        scanner.nextLine(); // Limpiar el buffer de entrada
        System.out.print("Ingrese tipo de cobertura: ");
        String tipoCobertura = scanner.nextLine();
        
        // Crear la póliza con los datos ingresados
        Poliza poliza = new Poliza(numeroPoliza, fechaInicio, fechaFin, cantidadCuotas, formaPago,
                                   montoTotalAsegurado, incluyeGranizo, montoMaximoGranizo,
                                   tipoCobertura, cliente, vehiculo);
        
        // Solicitar datos de las cuotas
        for (int i = 0; i < cantidadCuotas; i++) {
            System.out.print("Ingrese número de cuota " + (i + 1) + ": ");
            int numeroCuota = scanner.nextInt();
            System.out.print("Ingrese monto total de la cuota " + (i + 1) + ": ");
            double montoTotalCuota = scanner.nextDouble();
            scanner.nextLine(); // Limpiar el buffer de entrada
            System.out.print("Está pagada la cuota " + (i + 1) + "? (true/false): ");
            boolean pagada = scanner.nextBoolean();
            scanner.nextLine(); // Limpiar el buffer de entrada
            System.out.print("Ingrese fecha de vencimiento de la cuota " + (i + 1) + " (dd/mm/aaaa): ");
            String fechaVencimientoStr = scanner.nextLine();
            Date fechaVencimiento = null;
            try {
                fechaVencimiento = dateFormat.parse(fechaVencimientoStr);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            System.out.print("Ingrese forma de pago de la cuota " + (i + 1) + ": ");
            String formaPagoCuota = scanner.nextLine();
            
            // Crear la cuota con los datos ingresados
            Cuota cuota = new Cuota(numeroCuota, montoTotalCuota, pagada, fechaVencimiento,
                                    formaPagoCuota, poliza);
            
            // Agregar la cuota a la póliza
            poliza.agregarCuota(cuota);
        }
    }
}

