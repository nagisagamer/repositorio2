/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej03poo;

import Operacion.Operacion;
import ServiceOperacion.OperacionService;

/**
 *
 * @author Usuario
 */
public class EJ03poo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         OperacionService service = new OperacionService();
        Operacion op = service.crearOperacion();
        
        System.out.println("la suma es: " + service.suma(op));
        System.out.println("la resta es: " + service.resta(op));
        System.out.println("la multiplicacion es: " + service.multiplicacion(op));
        System.out.println("la division es: " + service.division(op));
        
    }
    
}
/*public class OperacionService {

    Scanner leer = new Scanner(System.in);

    public Operacion crearOperacion() {
        Operacion op = new Operacion();
        System.out.println("Ingrese dos numeros: ");
        op.setNro1(leer.nextInt());
        op.setNro2(leer.nextInt()); */