/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import cuenta.Cuenta;


/**
 *
 * @author Usuario
 */
public class cuentaService {
        private Cuenta cuenta;
        
        //llamar primer metodo de la clase cuenta osea el getter
        public Cuenta getCuenta() {
        return cuenta;
    }
         public void crearCuenta() {
        cuenta = new Cuenta();
        cuenta.crearCuenta();
    }

          public void ingresar(double ingreso) {
        cuenta.ingresar(ingreso);
    }

    public void retirar(double retiro) {
        cuenta.retirar(retiro);
    }
    
    public void extraccionRapida(){
        cuenta.extraccionRapida();
    }
    
    public void consultarSaldo(){
        cuenta.consultarSaldo();
    }
    public void consultarDatos(){
        cuenta.consultarDatos();
    }
    }



   /* public void crearCuenta() {
        cuenta = new Cuenta();
        cuenta.crearCuenta();
    }

    public void ingresar(double ingreso) {
        cuenta.ingresar(ingreso);
    }

    public void retirar(double retiro) {
        cuenta.retirar(retiro);
    }

    public void extraccionRap*/
    

