/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejex03poo;

import Entidad.Raices;
import service.Servicios;

/**
 *
 * @author Usuario
 */
public class EJEX03poo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Raices r = Servicios.crearRaices();
        r.calcular();
    }
    }
    

