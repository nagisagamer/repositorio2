/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej05poo;

import Service.cuentaService;

/**
 *
 * @author Usuario
 */
public class EJ05poo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            cuentaService micuentaService = new cuentaService();
    micuentaService.crearCuenta();
    micuentaService.consultarSaldo();
    micuentaService.ingresar(1000);
    micuentaService.retirar(500);
    micuentaService.extraccionRapida();
    micuentaService.consultarDatos();
}
    }
    

