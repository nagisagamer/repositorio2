/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones6;

import service.tiendaService;

/**
 *
 * @author Usuario
 */
public class Colecciones6 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        tiendaService ts = new tiendaService();
        
        ts.insertproductos();
        ts.modificarPrecio();
        ts.eliminarProducto();
    }
    
}
