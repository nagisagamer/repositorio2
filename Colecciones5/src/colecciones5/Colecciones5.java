/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones5;

import service.paisesService;

/**
 *
 * @author Usuario
 */
public class Colecciones5 {

    /**
     * @param args the command line arguments
     */
       public static void main(String[] args) {
        paisesService ps = new paisesService();
        
        ps.insertPaises();
        ps.ordenarPaises();
        ps.eliminarPaises();
    }
    
}
