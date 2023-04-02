/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import Entidades.ClienteBanco;
import Servicios.ServiceBanco;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class MainBanco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese su nombre");                
        ClienteBanco Usuario2 = new ClienteBanco(sc.next(),"123",11);
        ServicesBanco sb = new ServiceBanco();
        
        sb.depositar(11.50);
        
    }
    
}
