/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuenta;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Cuenta {
    private int numeroCuenta;
    private long dniCliente;
    private int saldoActual;
    private double interes;
    
    //constructor vacio
    public Cuenta() {
    }
    //constructor con parametros
    public Cuenta(long dniCliente, int saldoActual, int numeroCuenta, double interes) {
        this.dniCliente = dniCliente;
        this.saldoActual = saldoActual;
        this.numeroCuenta = numeroCuenta;
        this.interes = interes;
    }
    
    //metodo crear cuenta
     public void crearCuenta() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de cuenta: ");
        this.numeroCuenta = scanner.nextInt();
        System.out.print("Ingrese el DNI del cliente: ");
        this.dniCliente = scanner.nextLong();
        System.out.print("Ingrese el saldo actual: ");
        this.saldoActual = scanner.nextInt();
        System.out.print("Ingrese el interés: ");
        this.interes = scanner.nextDouble();
        //scanner.close();
    }

     //metodo ingresar saldo
     public void ingresar(double ingreso) {
        this.saldoActual += ingreso;
    }
     
     //metodo retirar saldo
      public void retirar(double retiro) {
        if (retiro <= this.saldoActual) {
            this.saldoActual -= retiro;
        } else {
            this.saldoActual = 0;
        }
    }
      //metodoextraccionrapida
     public void extraccionRapida() {
        double limite = this.saldoActual * 0.2;
        System.out.print("Ingrese la cantidad a retirar (límite de " + limite + "): ");
        Scanner scanner = new Scanner(System.in);
        double retiro = scanner.nextDouble();
       
        if (retiro <= limite) {
            this.saldoActual -= retiro;
        } else {
            System.out.println("No puede retirar más del 20% del saldo actual.");
        }
    }
     //metodo consultar saldo
    public void consultarSaldo() {
        System.out.println("Saldo actual: " + this.saldoActual);
    }
    //metodo consultardatos
    public void consultarDatos() {
        System.out.println("Número de cuenta: " + this.numeroCuenta);
        System.out.println("DNI del cliente: " + this.dniCliente);
        System.out.println("Saldo actual: " + this.saldoActual);
        System.out.println("Interés: " + this.interes);
    }
//getters y setters
    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(long dniCliente) {
        this.dniCliente = dniCliente;
    }

    public int getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

}
